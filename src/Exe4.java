import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите температуру");
        int x  = s.nextInt();
        System.out.println("На улице " + x + " градусов");

        if (x >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else if (x <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }
}

