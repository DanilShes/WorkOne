public class Exe2 {
    public static void main(String[] args) {
        int total = 120;
        int white = 2;
        int brown = 4;
        int clas = total / (white + brown);
        System.out.println("В школе,где " + clas + " классов,нужно " + white*clas +
                " банок белой краски и " + brown*clas + " банок коричневой краски");
    }
}
