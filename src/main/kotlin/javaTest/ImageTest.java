package javaTest;

public class ImageTest {

    public static void image1() {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0, 5 -> System.out.println("* * * * * *");
                default -> System.out.println("*         *");
            }
        }
    }

    public static void image2() {
        String[] arr = {"*", " ", " ", " ", " ", "*"};
        int num = 0;
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0, 5 -> System.out.print("* * * * * *");
                case 1, 2, 3, 4 -> {
                    arr[num] = "*";
                    String str = String.join(" ", arr);
                    System.out.print(str);
                }
            }
            num++;
            if (num > 1) arr[num - 1] = " ";
            System.out.println();
        }
    }

    public static void image3() {
        String[] arr = {" ", " ", " ", " ", " ", " "};
        int num = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.print("* * * * * *");
            } else {
                arr[num] = "*";
                if (i > 1) arr[num - 1] = " ";
                String str = String.join(" ", arr);
                System.out.println(str);
                num++;
            }

        }
    }

    public static void image4() {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0,1,4,5 -> System.out.println("* * * * * *");
                case 2,3 -> System.out.println("* *     * *");
            }
        }
    }

    public static void image5() {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0,1 -> System.out.println("* * * *    ");
                case 2,3 -> System.out.println("* * * * * *");
                case 4,5 -> System.out.println("    * * * *");
            }
        }
    }
}
