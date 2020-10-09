package lesson5;

import java.util.Arrays;

public class Staff {
    /* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    * Конструктор класса должен заполнять эти поля при создании объекта;
    * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    * Создать массив из 5 сотрудников
    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
    ...
    persArray[4] = new Person(...);

    * С помощью цикла вывести информацию только о сотрудниках старше 40 лет; */

    String firstName;
    String secondName;
    String thirdName;
    String position;
    String email;
    String telNumber;
    int salary;
    int age;

    public Staff(String secondName, String firstName, String thirdName, String position, String email, String telNumber, int salary, int age) {
    }

    public void info(){
        System.out.printf("Staff %s %s %s %s %s %s %d %d",secondName, firstName, thirdName, position, email, telNumber, salary, age);
    }

}

