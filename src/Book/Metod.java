package Book;

public class Metod {
    public static void main(String[] args) {

        int value = 3;
        System.out.println("Before method call " + value);
       value = passByValue(value);
        System.out.println("After passByValue method call " + value);

        int[] array = {15};
        System.out.println("Before passByReference method call " + array[0]);
        passByReference(array);
        System.out.println("After passByReference method call: " + array[0]);

    }
    public static int passByValue(int number){
        number = 7;
        System.out.println("Inside passByValue " + number );
        return number;
    }

    public static void passByReference(int[] array) {
        array[0] = 30;
        System.out.println("Inside passByReference method: " + array[0]);
    }
}
