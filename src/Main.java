public class Main {
    public static void main(String[] args) {
        Author lev = new Author("Лев Толстой");
        Book voina = new Book("Война и мир", lev, 1925);
        Author pushkin = new Author("Саня Пушкин");
        Book kep = new Book("Капитанская дочь", pushkin, 1832);
        System.out.println("Автор: " + voina.getAuthorBook().getAuthor());
        System.out.println("Произведение: " + voina.getName());
        System.out.println("Год: " + voina.getYear());
        System.out.println("Автор: " + kep.getAuthorBook().getAuthor());
        System.out.println("Произведение: " + kep.getName());
        System.out.println("Год: " + kep.getYear());
        kep.setYear(1840);
        System.out.println("Год изменен на: " + kep.getYear());
        System.out.println(voina.toString());
    }
}