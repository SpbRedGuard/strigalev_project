package lesson3;
import java.util.Scanner;
import java.util.Random;
public class Main_3 {
 static Scanner sc = new Scanner(System.in);
 static Random random = new Random();

    public static void main(String[] args) {
/*1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

 */
 /*   System.out.println("Угадайте число от 0 до 9");

    int range = 9;
    int randomNumber = (int)(Math.random() * range);
    int maxTryCounting = 2;

    System.out.println("Введите число");

    int userNumber = sc.nextInt();


        for (int i = 0; i < maxTryCounting; i++) {
            if (userNumber == randomNumber){
                System.out.println("Поздравляем, Вы угадали число!");
                break;
            }else if (userNumber > randomNumber && userNumber != randomNumber) {
                System.out.println("Вы ввели число больше загаданного");
                 } else {
                System.out.println("Вы ввели число меньше загаданного");
                }
            System.out.println("Повторить попытку еще раз? 1 - да / 0 - нет");
            int userAnswer = sc.nextInt();
            if (userAnswer == 1){
                System.out.println("Введите число");
                userNumber = sc.nextInt();
            }else{
                System.out.println("Спасибо за игру!");
                break;
            }
            if (i == maxTryCounting){
                System.out.println("Попытки закончились");
            }
            }
        System.out.println("Игра закончена"); */

        //2 * Создать массив из слов
        // String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы

    // game ();
        guessWord();

        }
    public static void guessWord() {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int secret = random.nextInt(words.length);
        System.out.println(words[secret]);
        System.out.println("Введите загаданное слово");

        while (true){
            System.out.println();
            System.out.println("введите слово");
            String answer = sc.nextLine();
            if (answer.equals(words[secret])) {
                System.out.println("угадали");
                break;
            }else{
                for (int i = 0; i <15; i++) {
                    if (i < words[secret].length() && i < answer.length() && words[secret].charAt(i) == answer.charAt(i)) {
                        System.out.print(answer.charAt(i));
                    }else{
                        System.out.print("#");
                    }
                    }
                }
            }
        System.out.println("Слово угадано, было загадано слово " + words[secret]);
    }

    }


