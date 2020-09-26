package lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я изучаю Java");
        byte qy = 126;
        short wy = 10000;
        int ey = 1500;
        long ry = 57000000L;
        float ty = 3.14F;
        double yy = 42.195;
        char yu = 76;
        boolean yi = true;
        int z = -1;
        System.out.println(ex(3, 4, 6, 2));
        System.out.println(bool(8, 5));
        System.out.println(fi(-8));
        System.out.println(boolTwo(-2));
        checkName("Кирилл");
        System.out.println(yearVis(2020));

    }

    public static int ex(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean bool(int v, int w) {
        return 10 <= v + w && v + w <= 20;
    }

    public static int fi(int z) {
        if (z >= 0) {
            System.out.println("положительное");
        }
        if (z < 0) {
            System.out.println("отрицательное");
        }
        return z;
    }

    public static boolean boolTwo(int i) {
        return i < 0;
    }

    public static void checkName(String name) {
        System.out.printf("Привет, %s!", name);
    }

    public static boolean yearVis(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
    }
}

