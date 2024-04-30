public class Main {
    public static class Author{
        private String authorName;
        private String authorSurename;

        public String getAuthorName() {
            return authorName;
        }

        public String getAuthorSurename() {
            return authorSurename;
        }

        public Author(String authorName, String authorSurename){
            this.authorName = authorName;
            this.authorSurename = authorSurename;
        }
    }

    public static class Book{
        private String bookName;
        private Author author;
        private int year;

        public String getBookName() {
            return bookName;
        }

        public Author getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
        public Book(String bookName, Author author, int year){
            this.bookName = bookName;
            this.author = author;
            this.year = year;
        }
    }
    public static void main(String[] args) {
        Author aleksandr = new Author("Aleksandr", "Pushkin");
        Book ckazca = new Book("O Zolotoi ribke", aleksandr, 1800);
        System.out.println("ckazka.name = " + ckazca.getBookName());
        Author gogol = new Author("Nikolai", "Gogol");
        Book souls = new Book("Dead souls", gogol, 1900);
    }
}