package Book;

public class Shelf {
    public static void main(String[] args){

        Author author = new Author("Кен", "Моги");
        Author author1 = new Author("Лев", "Толстой");
        System.out.println(author);
        System.out.println(author1);

        Book book1 = new Book("Детство", author1, 1852);
        Book book = new Book("Икигай",author , 2015);
        System.out.println(book);
        System.out.println(book1);
        book.setYear(2017);
        System.out.println(book);

    }
}
