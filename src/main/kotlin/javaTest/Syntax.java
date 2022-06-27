package javaTest;

import java.util.Scanner;

public class Syntax {

    public static void readData() {
        // Получение данных через консоль и вывод.
        Scanner scanner = new Scanner(System.in);
        String hello;
        hello = scanner.nextLine();
        System.out.println(hello);
    }

    public static void variable() {
        // Числа
        byte num1 = 1, numTest;  // Создание пустой переменой
        numTest = 3;            // Использование переменной
        int num2 = 2;
        float num3 = 3.0f;
        double num4 = 4.0;
        // Строка
        String str = "ok";
        // Символ
        char c = 'c';
        // Логические
        boolean yes = true;
    }

    public static void arithmeticOperators() {
        // Арифметические операций
        int num1, num2, res;
        num1 = 10;
        num2 = 55;
        res = num1 + num2;
        System.out.println(res);
        res = num1 - num2;
        System.out.println(res);
        res = num1 * num2;
        System.out.println(res);
        res = num2 / num1;
        System.out.println(res);
        res = num2 % num1;
        System.out.println(res);
    }

    public static void conditionsStatements() {
        // Условия и операторы
        int a = 12;
        int b = 27;
        int c = 55;

        if (a > b || b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        Scanner scanner = new Scanner(System.in);
        int test;
        test = scanner.nextInt();

        switch (test) {
            case 100 -> System.out.println("100");
            case 27 -> System.out.println("27");
            case 50 -> System.out.println("50");
            default -> System.out.println(test);
        }

    }

    public static void loop() {
        // Циклы
          /* Еще есть такие понятия как Break and Continue,
           для пропуска или остановки итераций цикла.
         */
        for (int i = 0; i <= 10; ++i) {
            System.out.println(i);
        }

        System.out.println("New loop");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            ++i;
        }

        // Бесконечный цикл.
        System.out.println("New loop");
        boolean test = true;
        while (test) {
            System.out.println(i);
            i++;
            if (i > 12)
                test = false;

        }
        System.out.println("New loop");
        do {
            System.out.println("i уже меньше 12");
        } while (i < 12);

        System.out.println("New loop");
        for (int y = 0; y < 6; ++y) {
            for (int x = 0; x < 6; x++) {
                System.out.print(y);
            }
            System.out.println();
        }
        System.out.println("New loop");
        int[] arr = {123, 234, 24, 423, 124, 5};
        for (int z: arr) {
            System.out.println("Элемент массива " + z);
        }

    }
}
