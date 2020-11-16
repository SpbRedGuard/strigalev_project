package stage2_lesson2;

public class MainStage2_Lesson2 {
    public static void main(String[] args) {
        int result = 0;

        String[][] arr = {{"1","2","3","4"},{"1","2","3","4"}};

        String[][] err_arr = {{"1","2","3","4"},{"1","2","3"}};
       
        String[][] err_format = {{"1","2","3","empty",},{"1","2","3","4"}};

        System.out.println("Старт");

        try {
            result = 0;
            result = checkArr(arr);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов массива "+ String.valueOf(result));
        }

        System.out.println("Будет некорректный массив");
        try {
            result = 0;
            result = checkArr(err_arr);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов массива " + String.valueOf(result));
        }

        System.out.println("Будут ошибки в переводе числа");
        try {
            result = 0;
            result = checkArr(err_format);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов " + String.valueOf(result));
        }

        System.out.println("Завершение");
    }

    public static int checkArr(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;
        int value = 0;
        int line = 0;
        int unit = 0;

        if(array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i=1;i<3;i++){
            line = i;
            for(int c=1;c<5;c++){
                unit = c;
                try{
                    value = Integer.parseInt(array[i-1][c-1]);
                    summ += value;
                } catch (IllegalArgumentException e){
                    String message = "в "+ String.valueOf(line)+" ряду, "+ String.valueOf(unit)+" ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return summ;
    }

    static class MyArrayDataException extends RuntimeException{
        public MyArrayDataException(String message) {
            super("Некорректный формат данных "+ message);
        }
    }

    static class MyArraySizeException extends RuntimeException {
        public MyArraySizeException() {
            super("Не корректный размер массива!");
        }
    }
}

