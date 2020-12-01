
import java.util.Arrays;

public class Main_5 {
    private static int SIZE = 10000000;
    private static int HALF = SIZE / 2;
    private static int FILLER = 1;
    private static int PART_FIRST = 0;
    private static int PART_SECOND = 1;

   public static void main(String[] args) throws InterruptedException { // если поток в методе был прерван выбрасывается exception
        System.out.printf ("method1: %d\n", doMethod1()); // печать в консоль вызванного doMethod1
        System.out.printf ("method1: %d\n", doMethod2()); // печать в консоль вызванного doMethod2

    }

    private static long doMethod1() {
        float [] arr = prepareArrays(); // создание массива и заполнение его значениями
        long time = System.currentTimeMillis(); // измерение затраченного времени
        fillArray(arr, 0); // подсчёт количества ячеек
        return System.currentTimeMillis() - time; // повторный вывод времени после подсчёта
    }

    private static long doMethod2() throws InterruptedException {
        float [] arr = prepareArrays(); // создание массива и заполнение его значениями
        long time = System.currentTimeMillis(); // измерение затраченного времени
        float [][] parts = prepareParts(); // создание двумерного массива
        mapArray(arr, parts); // и заполнение его значениями из одномерного

        Thread thread = new Thread(() -> fillArray(parts[PART_SECOND], HALF)); // создание потока с одновременным заполнением массива PART_SECOND
        thread.start(); // Поток стартует
        fillArray(parts[PART_FIRST], HALF); // заполнение масива PART_FIRST
        thread.join(); // синхронизация потоков?

        reduceArray(arr, parts); // соединение массивов
        return System.currentTimeMillis() - time; // повторный вывод времени после всех расчётов
    }

    private static float [] prepareArrays() { //метод создаёт массив float
        float [] arr = new float[SIZE]; // размером SIZE (10000000)
        Arrays.fill(arr, FILLER); // и заполняет его единицами из переменной FILLER
        return arr; // возвращает заполненный массив
    }

    private static float [][] prepareParts() { // метод создаёт и возвращает пустой двухмерный массив float
        return new float[][]{new float[HALF], new float[HALF]}; // размером HALF, то есть по половине SIZE на отдельный массив
    }


    private static void mapArray (float [] arr, float[][] parts){ // в метод подается 1 одномерный массив и 1 двумерный (двумерный заполняется данными из одномерного)
        System.arraycopy(arr, 0, parts[PART_FIRST],0,HALF); // команда arraycopy (из библиотеки java.util.Arrays) копирует массив arr, из позиции 0 в массив parts позицию 0 с аргументом длины HALF
        System.arraycopy(arr, HALF, parts[PART_SECOND],0,HALF); // команда копирует массив arr, из позиции HALF в массив parts позицию 0 с аргументом длины HALF
    }
    private static void fillArray (float[] arr, int startPosition) { //метод подсчитывает ячейки массива
        for (int i = 0, len = arr.length; i < len; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + startPosition)/5) * Math.cos(0.2f + (i + startPosition)/5) * Math.sin(0.4f + (i + startPosition)/2)); // - не разобрался в этом =( Подсчитывает с разных сторон что ли?
        }
    }
    private static void  reduceArray (float[] arr, float [][] parts) { // метод копирует массивы PART_FIRST и PART_SECOND в массив arr
       System.arraycopy(parts[PART_FIRST], 0, arr,0,HALF); // сначала копируется этот из позиции 0 в позицию arr 0, длиной HALF
       System.arraycopy(parts[PART_SECOND], 0, arr,HALF,HALF); // затем этот из позиции 0 в позицию arr HALF, длиной HALF
    }
}
