public class Main {
    public static void main(String[] args) {
        Author aleksandr = new Author("Aleksandr", "Pushkin");
        Book ckazca = new Book("O Zolotoi ribke", aleksandr, 1800);
        System.out.println("ckazka.name = " + ckazca.getBookName());
        Author gogol = new Author("Nikolai", "Gogol");
        Book souls = new Book("Dead souls", gogol, 1900);
        souls.setYear(1888);
        System.out.println(souls.getYear());
        System.out.println(aleksandr.toString());
        System.out.println(ckazca.toString());
        System.out.println(aleksandr.equals(gogol));
        System.out.println(aleksandr.equals(aleksandr));
        System.out.println(ckazca.equals(souls));
        System.out.println(ckazca.equals(ckazca));
        System.out.println(ckazca.equals(null));
        System.out.println(ckazca.toString());
    }
}