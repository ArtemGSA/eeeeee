import java.util.Objects;

public class Book {
    private Author author;
    private int year;
    private String bookName;

    public Book(String bookName, Author author, int year){
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }
    public Author getAuthor() {
        return author;
    }
    public String getBookName(){
        return bookName;
    }
    public int getYear() {
        return year;
    }
    @Override
    public boolean equals(Object other){
        if(this.getClass()!=null){
            if(this.getClass() != other.getClass()){
                return false;
            }
            if(this == other){
                return true;
            }}
        else{
            return false;
        }
        Book oBook = (Book) other;
        return Objects.equals(author, oBook.getAuthor())&& Objects.equals(year, oBook.year)&& Objects.equals(bookName, oBook.bookName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(author, year, bookName);
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Название "+this.bookName+" Год издания "+this.year+" Автор "+getAuthor();
    }

}
