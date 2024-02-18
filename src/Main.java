import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        doFirstHomework();
        task1();
        task2();
        System.out.println(task3());
        task4();
    }

    static void doFirstHomework() {
        int lamps = 10;
        System.out.println("Значение переменной lamps с типом int равно " + lamps);

        byte age = 22;
        System.out.println("Значение переменной age с типом byte равно " + age);

        long number = 88888999;
        System.out.println("Значение переменной number с типом  long  равно " + number);

        short units = 25000;
        System.out.println("Значение переменной с типом short равно " + units);

        float f = 3.14f;
        System.out.println("Значение переменной с типом float равно " + f);

        double d = 3.14d;
        System.out.println("Значение переменной с типом double равно " + d);

        char letter = 'A';
        System.out.println("Значение переменной с типом char равно " + letter);

        boolean c = true;
        System.out.println("Значение переменной с типом boolean равно " + c);

        boolean g = false;
        System.out.println("Значение переменной с типом boolean равно " + g);

        int total = 120;
        int white = 2;
        int brown = 4;
        int clas = total / (white + brown);
        System.out.println("В школе,где " + clas + " классов,нужно " + white * clas +
                " банок белой краски и " + brown * clas + " банок коричневой краски");

        int zMasha = 67760;
        int a = zMasha + zMasha * 10 / 100;
        int rMDifference = 12 * a - 12 * zMasha;
        System.out.println("Маша теперь получает " + a + " рублей.Годовой доход вырос на " + rMDifference + " рублей");

        int zDenis = 83690;
        int b = zDenis + zDenis * 10 / 100;
        int rDDifference = 12 * b - 12 * zDenis;
        System.out.println("Денис теперь получаешь " + b + " рублей.Годовой доход вырос на " + rDDifference + " рублей");

        int zChristina = 76230;
        int z = zChristina + zChristina * 10 / 100;
        int rCDifference = 12 * z - 12 * zChristina;
        System.out.println("Кристина теперь получает " + z + " рублей.Годовой доход вырос на " + rCDifference + " рублей");


        Scanner s = new Scanner(System.in);
        System.out.println("Введите температуру");
        int x = s.nextInt();
        System.out.println("На улице " + x + " градусов");

        if (x >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else if (x <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        int monthNumber = 0;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка");
        }

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        int have = 0;
        int mon = 0;
        int v = 2459000;
        while (have <= v) {
            have = have + 15000;
            mon++;
            System.out.println("Месяц " + mon + " ,сумма накоплений равна " + have + " рублей.");
        }
    }


    static void task1() {
        int[] ran = new int[10];
        System.out.println(ran.length);
        Random random = new Random();
        int randomNumber = random.nextInt();
        for (int i = 0; i < ran.length; i++) {
            ran[i] = random.nextInt(25);
        }
        System.out.println(Arrays.toString(ran));
    }


    static void task2() {
        int[] odd = new int[10];
        for (int i = 0; i < odd.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    static double task3 () {
        double sum = 0;
        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5};
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    static void task4() {
        String[] words = {"Hello ", "Maxima ", "School"};
        concat(words);
        System.out.println(concat(words));
    }

    static String concat(String[] mArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mArray.length; i++) {
            sb.append(mArray[i]).append(" ");
        }return sb.toString();
    }
}
