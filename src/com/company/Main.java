package com.company;

import java.util.Scanner;

public class Main {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task 1
        System.out.println(ANSI_YELLOW + "Task 1" + ANSI_RESET);
        Test1 test1 = () -> {
            System.out.print("Введите трехзначное число: ");
            String b = scanner.next();
            while (b.length() != 3) {
                System.out.print("Не 3-х значное число!\nПопробуй еще :");
                b = scanner.next();
            }
            System.out.println("\tВведено => " + b + "\n\tРеверс => " + new StringBuilder(b).reverse());
        };
        test1.doTest1();

        //Task 2
        System.out.println(ANSI_YELLOW + "\nTask 2" + ANSI_RESET);
        Test2 test2 = () -> {
            int[] num = {1, -5, 8};
            System.out.print("Числа: ");
            for (Integer q : num) {
                System.out.print(q + " ");
            }
            int countNegative = 0;
            int countPositive = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] < 0) {
                    countNegative++;
                } else if (num[i] > 0) {
                    countPositive++;
                }
            }
            System.out.println("\nПоложительных: " + countPositive + "\nОтрицательных: " + countNegative);
        };
        test2.doTest2();

        //Task 3
        System.out.println(ANSI_YELLOW + "\nTask 3" + ANSI_RESET);
        System.out.println("Введите стороны прямоугольника ");
        System.out.print("a=");
        double a = scanner.nextDouble();
        System.out.print("b=");
        double b = scanner.nextDouble();
        System.out.println("Площадь: S=" + getArea(a, b));
        System.out.println("Периметр: P=" + getPerimeter(a, b));

        //Task 4
        System.out.println(ANSI_YELLOW + "\nTask 4" + ANSI_RESET);
        System.out.print("Введите двузначное число: ");
        int c = scanner.nextInt();
        System.out.println(DigitsInNumber(c));

        //Task 5
        System.out.println(ANSI_YELLOW + "\nTask 5" + ANSI_RESET);
        System.out.print("Введите периметр окруженности: ");
        int d = scanner.nextInt();
        final double Pi = 3.14;
        Test5 test5 = () -> System.out.print("L = " + Pi * d);
        test5.doTest5();
    }

    @FunctionalInterface
    interface Test1 {
        void doTest1();
    }

    @FunctionalInterface
    interface Test2 {
        void doTest2();
    }

    @FunctionalInterface
    interface Test5 {
        void doTest5();
    }

    public static Double getArea(double a, double b) {
        double s = a * b;
        return s;
    }

    public static Double getPerimeter(double a, double b) {
        double p = 2 * (a + b);
        return p;
    }

    public static String DigitsInNumber(int c) {
        int n = c;
        int s = 0, m = 1;
        for (int i = 0; i < 2; i++) {
            m *= n % 10;
            s += n % 10;
            n /= 10;
        }
        return "Сумма: " + s +
                "\nПроизведение: " + m;
    }
}




