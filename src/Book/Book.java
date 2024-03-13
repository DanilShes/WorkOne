package Book;

public class Book {

    private String nameBook;

    private Author author;

    private Integer year;


    public Book(String name, Author author, Integer year) {
        this.nameBook = name;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Books.Book{" +
                "name: " + nameBook +
                "  author: " + author +
                "  year: " + year +
                '}';
    }
}
