package lesson2;

import java.util.Arrays;
    public class Main_2 {
        public static void main(String[] args) {
            // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]
            // С помощью цикла и условия заменить 0 на 1, 1 на 0;

            // Вариант 1.
            System.out.println("задание 1");

       /*     int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
                for (int i = 0; i < arr.length; i++) {
                arr[i] = 1 - arr[i];
                }
                System.out.println(Arrays.toString(arr));
               */


            // Вариант 2

       /*     int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
                for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] == 0 ? 1 : 0;
                }
                System.out.println(Arrays.toString(arr)); */

            // Вариант 3

       /*      int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
                 for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 0) {
                    arr[i] =1;
                        }else{
                        arr[i] = 0;
                        }
                 }
                 System.out.println(Arrays.toString(arr)); */

            // 2. Задать пустой целочисленный массив размером 8.
            // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

            // Вариант 1.
            System.out.println("задание 2");

        /*    int [] arr2 = new int [8];
                for (int i = 0; i < arr2.length ; i++) {
                    arr2[i] = i*3;
                }
                System.out.println(Arrays.toString(arr2)); */

            // Вариант 2.
     /*           int [] arr2 = new int [8];
                    for (int i = 1; i < arr2.length; i++) {
                arr2[i] = arr2[i-1]+3;
            }
                System.out.println(Arrays.toString(arr2)); */

            System.out.println("задание 3");

            // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
            // пройти по нему циклом, и числа меньшие 6 умножить на 2;

      /*    int []arr3 = {3,8,3,4,12,4,5,14,4,8,11,17};
                for (int i =0; i < arr3.length; i++) {
                    if (arr3[i] < 6) {
                        arr3[i] *=2;
                    }
                }
                System.out.println(Arrays.toString(arr3)); */

            System.out.println("задание 4");
            // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
            // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;


      //      printArr4(createArr4(10));
      //      System.out.println("");
      //      System.out.println ("Максимальное число = " + maxVal(new int[]{34,-13,35,78,-100,5,10,19}));
      //      System.out.println ("Минимальное число = " + minVal(new int[]{34,-13,35,78,-100,5,10,19}));
      //      System.out.println(chekBalance(new int[]{2,3,4,2,1,4,3,4,2,6,4,2,5,1,}));
            System.out.println(Arrays.toString(shiftArr(new int[]{2,5,5,2,1,8,9,0}, 6)));
        }
        // Вариант 1. (с одним циклом, два метода)

      /*  public static int[][] createArr4(int n) {
            int[][] arr4 = new int[n][n];
                for (int i = 0; i <n; i++){
                    arr4[i][i] = 1;
                    arr4[i][n-1-i] = 1;
                }
                return arr4;
            } */

            // или Вариант 2. (два цикла, два метода)
         /*   for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1) {
                        arr4[i][j] = 1;
                    }
                }
            }
            return arr4;
        } */


     /*   public static void printArr4(int[][] arr4) {
            for (int i = 0; i < arr4.length; i++) {
                for (int j = 0; j < arr4[i].length; j++) {
                    System.out.print(arr4[i][j] + " ");
                }
                System.out.println();
            }
        }
        // 5. **Задать одномерный массив и найти в нем минимальный и максимальный элементы

        public static int maxVal(int[] arr5) {
            System.out.println("задание 5");
            int max = arr5 [0];
            for (int i = 0; i < arr5.length ; i++) {
                if (arr5[i] > max) {
                max = arr5 [i];
                }
            }

        return max;
        } */

     /*   public static int minVal(int[] arr5) {
            System.out.println("задание 5");
            int min = arr5 [0];
            for (int i = 0; i < arr5.length ; i++) {
                if (arr5[i] < min) {
                    min = arr5 [i];
                }
            }
            return min;
        } */
    //    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    //    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    //    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    //    эти символы в массив не входят.
     /*   public static boolean chekBalance (int [] arr6){
            int summ = 0;
            for (int i = 0; i < arr6.length; i++) {
                summ += arr6[i];
            }
            if (summ %2 != 0){
                return false;
            }
            int sumLeft = 0;
            int i = 0;
            while (sumLeft < summ / 2){
                sumLeft += arr6[i];
                i++;
            }
            return sumLeft == summ / 2;
        } */
    // 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементымассива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        public static int[] shiftArr(int[] arr, int n) {
            int k = n % arr.length + arr.length;
            for (int i = 0; i < k; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
            return arr;
        }
}





