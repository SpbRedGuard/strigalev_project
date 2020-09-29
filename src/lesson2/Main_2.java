package lesson2;

    public class Main_2 {
        public static void main(String[] args) {
            int j = 0;
            System.out.println("задание 1");

            int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
            int maxArr = arr.length;
            for (int i = 0; i < maxArr; i++) {
                System.out.print(i + "-" + arr[i] + " ");
            }

            System.out.println("");
            System.out.println("замена цифр в массиве");

            for (int i = 0; i < maxArr; i++)
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else arr[i] = 1;
            for (int i = 0; i < maxArr; i++) {
                System.out.print(i + "=>" + arr[i] + " ");
            }

            System.out.println("");
            System.out.println("задание 2");

            int[] arr2 = new int[8];
            int maxArr2 = arr2.length;
            for (int i = 0; i < maxArr2; i++) {
                System.out.print(i + "-" + arr2[i] + " ");
            }

            System.out.println("");
            System.out.println("заполнение пустого массива");

            for (int i = 0; i < maxArr2; i++, j = j + 3) {
                arr2[i] = j;
            }

            for (int i = 0; i < maxArr2; i++) {
                System.out.print(i + "-" + arr2[i] + " ");
            }

            System.out.println("");
            System.out.println("задание 3");

            int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int maxArr3 = arr3.length;
            for (int i = 0; i < maxArr3; i++) {
                System.out.print(i + "-" + arr3[i] + " ");
            }
            System.out.println("");
            System.out.println("умножение чисел меньше 6 на 2");

            for (int i = 0; i < maxArr3; i++) {
                if (arr3[i] < 6) {
                    arr3[i] = arr3[i] * 2;
                }
                System.out.print(i + "-" + arr3[i] + " ");
            }

            System.out.println("");
            System.out.println("задание 4");

            int[][] arr4 = new int[5][5];
            for (int i = 0; i < arr4.length; i++) {
                System.out.println();
                for (int h = 0; h < arr4[i].length; h++) {
                    if (i == h) {
                        arr4[i][h] = 1;
                    }
                    if (i + h == arr4.length-1){
                        arr4[i][h] = 1;
                    }
                    System.out.printf("%2s", arr4[i][h]);
                    }

                }


            }


        }



