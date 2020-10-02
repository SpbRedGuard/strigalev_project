package lesson3;
import java.util.Scanner;
public class Main_3 {
 static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
/*1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

 */
    System.out.println("Угадайте число от 0 до 9");

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
        System.out.println("Игра закончена");
        }


    }
