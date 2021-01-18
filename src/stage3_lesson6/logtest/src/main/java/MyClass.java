import  java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(arrayAfter4(new int[]{1,2,3,4,5,6,7,8})));
//        System.out.println(Arrays.toString(arrayAfter4(new int[]{1,5,3,4,5,4,7,8})));
//        System.out.println(Arrays.toString(arrayAfter4(new int[]{1,5,3,5,7,8})));

        System.out.println(arraysContainsOnly1and4(new int[]{1,3,4,5}));
        System.out.println(arraysContainsOnly1and4(new int[]{1,4,4,4}));
        System.out.println(arraysContainsOnly1and4(new int[]{1,1,}));
        System.out.println(arraysContainsOnly1and4(new int[]{1,1}));
    }
    public static int [] arrayAfter4 (int [] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 4) {
                return Arrays.copyOfRange(arr, i+1, arr.length);
            }
        }
        throw new RuntimeException("Массив без 4");
    }
    public static boolean arraysContainsOnly1and4 (int[] arr){
        boolean has1 = false;
        boolean has4 = false;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] !=1 && arr[i] !=4){
                return false;
            }
            if (arr[i] ==1){has1 = true;}
            if (arr[i] ==4){has4 = true;}
        }
        return has1 && has4;
    }

}