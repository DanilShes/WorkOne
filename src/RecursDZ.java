public class RecursDZ {
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(factorialCum(5));
        System.out.println(fib(9));
        primType();
        arifType();
        sravPrim();
        checkTimeWithPrimitive();
        checkTimeWithWrapper();
        overFlow();
    }

    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    static long factorialCum(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int fib(int n) {
        if (n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    static void primType() {
        int i = 10;
        double b = 20.5;
        boolean d = true;

        Integer i0 = i;
        Double b0 = b;
        Boolean d0 = d;

        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        ;
    }

    static void arifType() {
        int s = 45;
        Integer s0 = 55;
        System.out.println(s + s0);

        double f = 35.6;
        Double f0 = 45.6;
        System.out.println(f * f0);

        boolean s1 = true;
        Boolean s2 = false;
        System.out.println(s1 == s2);
    }

    public static void sravPrim() {
        Integer r1 = 112;
        Integer r2 = 112;
        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));

        Integer s1 = 130;
        Integer s2 = 130;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public static void checkTimeWithPrimitive() {
        long startTime = System.currentTimeMillis();
        int sum = 150;
        for (int i = 0; i < sum; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        {
            System.out.println("Время выполнения операции: " + duration + " миллисекунд");
        }
    }
    public static void checkTimeWithWrapper() {
        long startTime = System.currentTimeMillis();
        Integer sum2 = 150;
        for (int i = 0; i < sum2; i++) {
            sum2 += i;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        {
            System.out.println("Время выполнения операции: " + duration + " миллисекунд");
        }
    }

    public static void overFlow() {
        Integer i = Integer.MAX_VALUE;
        System.out.println(i);
        i++;
        System.out.println(i);

        Integer i2 = Integer.MIN_VALUE;
        System.out.println(i2);
        i--;
        System.out.println(i);

        Long a = Long.MAX_VALUE;
        System.out.println(a);
        a++;
        System.out.println(a);

        Long a2 = Long.MIN_VALUE;
        System.out.println(a2);
        a--;
        System.out.println(a);
    }
}

