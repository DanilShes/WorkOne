public class Exe8 {
    public static void main(String[] args ) {
        int have = 0;
        int mon = 0;
        int c = 2459000;
        while (have <= c ) {
            have = have + 15000;
            mon++;
            System.out.println("Месяц " + mon + " ,сумма накоплений равна " + have + " рублей.");
        }
    }
}

