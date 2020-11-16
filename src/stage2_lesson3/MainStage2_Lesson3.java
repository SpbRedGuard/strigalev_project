package stage2_lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainStage2_Lesson3 {
    public static void main(String[] args) {

        String [] wordsArray = {"Один", "Два", "Три","Четыре","Пять","Шесть","Семь","Восемь","Девять","Десять","Одиннадцать","Двенадцать", "Один", "Два", "Три"};
        System.out.println(Arrays.toString(wordsArray)); // Arrays.toString выводит в строковом виде данные массива

        HashMap<String, Integer> check = new HashMap<>();
        for (String word : wordsArray){
            check.put(word, check.getOrDefault(word, 0)+1); // формируем строку и добавляем ключ к словам из массива, изначально выставляем дефолтное значение на 0, ключ присваивается ко всем словам.
        }
        System.out.println(check);
        System.out.println();

        Phone phone = new Phone();
        phone.add("Cruel", "3339922");
        phone.add("Everylight","2291023");
        phone.add("Everylight","2451843");
        phone.add("Cromwell","4199040");
        phone.add("Zelenoff","3491023");
        phone.add("Bluebird","5531653","9874517");


        System.out.println("tel " + phone.getPhoneNumber("Cruel"));
        System.out.println("tel " + phone.getPhoneNumber("Everylight"));
        System.out.println("tel " + phone.getPhoneNumber("Bluebird"));
    }

}