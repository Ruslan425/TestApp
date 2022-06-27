package javaTest;

public class Methods {

    public static void printThereWords() {
        String[] arr = {"Orange", "Banana", "Apple"};
        for (String i : arr) {
            System.out.println(i);
        }
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int res = a + b;
        if (res > 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColor() {
        int value = 1000;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
