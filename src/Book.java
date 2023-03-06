import java.util.Objects;

public class Book {
    private String name;
    private Author authorBook;
    private int year;


    public Book(String name, Author author, int year) {
        this.name = name;
        this.authorBook = author;
        this.year = year;

    }

    public String getName() {
        return this.name;
    }

    public Author getAuthorBook() {
        return this.authorBook;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book name='" + name + '\'' +
                authorBook +
                ", year=" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorBook, year);
    }
}