package lesson4;
import java.util.Random;
import java.util.Scanner;

public class Main_4 {
    static final int SIZE = 5; //размер поля, задаём будущую длину будущего массива
    static final int DOTS_TO_WIN = 4; // задаем количество символов в ряд для победы

    static final char DOT_X = 'X'; //переменная определяющая символ, который будет использовать игрок-человек
    static final char DOT_O = 'O'; //переменная определяющая символ, который будет использовать игрок-ии
    static final char DOT_EMPTY = '.'; // переменная определяющая символ, который используется как визуализация пустой клетки

    static char[][] map; // создали двухмерный массив

    static Scanner sc = new Scanner(System.in); //инициализировали метод ввода через консоль
    static Random random = new Random(); // инициализировали метод рандом, для возможности в будущем генерировать случайные числа

    public static void main(String[] args) { //метод запускающий программу игры в крестики-нолики
        initMap(); //метод инициализирует карту
        printMap(); //метод распечатывает карту

        while (true) {
            humanTurn(); //метод хода игрока-человека
            printMap(); //метод распечатки карты для визуализации
            if(checkWinLines(DOT_X, DOTS_TO_WIN)){ //условие проверки на победу игрока-человека, проверяет все возможные победные линии
                System.out.println("Вы победитель!");
                break;
            }
            if (isFull()) { //условие проверки на ничью. Если метод возвращает true, то ничья
                System.out.println("Ничья!");
                break;
            }

            aiTurn(); //метод хода ии
            printMap(); //метод распечатки карты для визуализации
            if(checkWinLines(DOT_O, DOTS_TO_WIN)){ //условие проверки на победу игрока-ии
                System.out.println("Комьютер победил!");
                break;
            }
            if (isFull()) { //условие проверки на ничью
                System.out.println("Ничья!");
                break;
            }
        }
    }


    static void initMap() { //задаем игровое поле двухмерным массивом с размером SIZEхSIZE с заполнеными клетками DOT_EMPTY, пока без визуализации
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() { //метод печати игрового поля
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " "); //печатает верхнюю строку, заполняя её цифрами через пробелы "   1 2 3 4 5" - это ещё не массив map SIZExSIZE
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " "); //распечатывает номер строки
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " "); //распечатывает DOT_EMPTY в i-тую и j-тую ячейки массива, пробегаясь числом пока не заполнит весь размер массив map SIZExSIZE
            }
            System.out.println(); //Переносит строку для печати элементов массива в цикле
        }
    }

    static void humanTurn() { //метод для реализации хода игрока-человека
        int x;
        int y;
        do {
            System.out.println("Input coord X Y");
            x = sc.nextInt() - 1; //человек вводит координату x, она должна уменьшаться на 1, для того, чтобы соответствовать распечатанной ранее нумерации координат
            y = sc.nextInt() - 1; //человек вводит координату y, она должна уменьшаться на 1, для того, чтобы соответствовать распечатанной ранее нумерации координат
        } while (!isCellValid(y, x));//если игрок вводит координаты не правильно, то есть !isCellValid, то программа повторно запрашивает его ввести координаты, до тех пор пока не введёт правильно

        map[y][x] = DOT_X; //Если игрок ввел правильно координаты и вылетел из цикла while, то введенные им значения записываются символом ' X ' в указанные поля массива map SIZExSIZE
    }

    public static void aiTurn() {// После хода человека должен походить игрок-ии
        int x;
        int y;

        // Попытка победить самому
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWinLines(DOT_O, DOTS_TO_WIN)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
// Сбить победную линии противника, если осталось 1 ход для победы
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWinLines(DOT_X, DOTS_TO_WIN)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

// Сбить победную линии противника, если осталось 2 хода для победы
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWinLines(DOT_X, DOTS_TO_WIN - 1) &&
                            Math.random() < 0.5) { //  фактор случайности, чтобы сбивал не все время первый попавшийся путь.
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

// Сходить в произвольную не занятую ячейку

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }


    static boolean isCellValid(int y, int x) { //метод проверяет правильность ввода координат игроком
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) { //пользователь не долженн вводить значения меньше, чем начало порядка нумерации массива и больше, чем длина массива SIZE в строках и столбцах
            return false;
        }
        return map[y][x] == DOT_EMPTY; //возвращает пустые клетки '.' в сетку координат, в массив  map SIZExSIZE
    }

    static boolean isFull() { //Метод проверяет наличии ячеек массива map SIZExSIZE, на наличие символов ' . ', условно показывающих, что ячейка пуста и в неё можно прописать координаты для хода
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true; //если метод возвращает true, то количество полей для хода исчерпано, значет будет ничья
    }

//    static boolean checkWin(char c) {
//        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) { return true; }
//        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) { return true; }
//        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) { return true; }
//
//        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) { return true; }
//        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) { return true; }
//        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) { return true; }
//
//        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) { return true; }
//        if (map[0][2] == c && map[1][1] == c && map[2][0] == c) { return true; }
//
//        return false;
//    }

    static boolean checkLine(int cy, int cx, int vy, int vx, char dot, int dotsToWin) {
        if (cx + vx * (dotsToWin - 1) > SIZE - 1 || cy + vy * (dotsToWin - 1) > SIZE - 1 ||
                cy + vy * (dotsToWin - 1) < 0) {
            return false;
        }

        for (int i = 0; i < dotsToWin; i++) {
            if (map[cy + i * vy][cx + i * vx] != dot) { //проверка победной линии в массиве map, есть ли символы одного значения собраные в линию
                return false;
            }
        }
        return true;
    }

    static boolean checkWinLines(char dot, int dotsToWin) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, dot, dotsToWin) || //проверка горизонтали
                        checkLine(i, j, 1, 0, dot, dotsToWin) || //проверка вертикали
                        checkLine(i, j, 1, 1, dot, dotsToWin) || //проверка положительной диагонали "/"
                        checkLine(i, j, -1, 1, dot, dotsToWin)) { //проверка отрицательной диагонали "\"
                    return true;
                }
            }
        }
        return false;
    }
}


