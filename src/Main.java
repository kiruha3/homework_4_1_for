public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    private static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i < 512; i = i + i) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Задача 8");
        int perMonth = 29_000;
        int sumPerYear = 0;
        int year = 12;
        for (int i = 1; i < year; i++) {
            sumPerYear += perMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumPerYear);
        }
    }

    private static void task9() {
        System.out.println("Задача 9");
        int perMonth = 29_000;
        float sumPerYear = 0;
        int year = 12;
        float yearPercent = 0.12f;
        float monthPercent = 1.0f+(yearPercent/year);
        for (int i = 1; i < year; i++) {
            sumPerYear += perMonth;
            sumPerYear = sumPerYear * monthPercent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumPerYear);
        }
    }
    private static void task10() {
        System.out.println("Задача 1");
        for (int i=1; i<=10; i++){
            System.out.println("2*"+i+"="+2*i);
        }
    }
}