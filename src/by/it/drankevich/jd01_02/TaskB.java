package by.it.drankevich.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        step1();

        Scanner sc = new Scanner(System.in);
        int month;
        step2(month = sc.nextInt());

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        step3(a, b, c);
    }

    private static void step1() {
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) System.out.println();

        }
    }

    private static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }

    private static void step3(double a, double b, double c) {
        double x1;
        double x2;
        double D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
        if (D == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println(x1);
        }
        if (D < 0) {
            System.out.println("корней нет");

        }
    }
}
