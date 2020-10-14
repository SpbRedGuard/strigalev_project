package lesson5;

public class Main_5 {
    public static void main (String[] args){
    Staff [] staffArr = new Staff[5];
        staffArr [0] = new Staff("Иванов", "Иван", "Иванович","механик","ivmech@gmail.com","+7999333222111",35000, 25);
        staffArr [1] = new Staff("Петров", "Петр", "Петрович","сварщик","petmech@gmail.com","+7999333222121",39000, 33);
        staffArr [2] = new Staff("Сидоров", "Сидор", "Сидорович","маляр","sidmech@gmail.com","+7999333222131",44000, 41);
        staffArr [3] = new Staff("Антонов", "Антон", "Антонович","механик","antmech@gmail.com","+7999333222141",35000, 27);
        staffArr [4] = new Staff("Игнатьев", "Игнат", "Игнатович","администратор","igmech@gmail.com","+7999333222151",40000, 44);

        for (int i=0; i < staffArr.length; i++) {
             if (staffArr[i].getAge() > 40){
             staffArr[i].getInfo();
             }
        }
        }
        }


