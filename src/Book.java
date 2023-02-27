public class Book {
    private String name;
    private Author authorBook;
    private int year;


    public Book(String name, Author author, int year) {
this.name = name;
this.authorBook = author;
this.year = year;

    }

public String getName(){
        return this.name;
}
public Author getAuthorBook(){
        return this.authorBook;
}
public int getYear(){
        return this.year;
}
    public void setYear(int year) {
        this.year = year;
    }

}