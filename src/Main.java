public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Egor", "Arhipov");
        Author author2 = new Author("Name", "LastName");

        Book book1 = new Book("Title", author1, 2000);
        Book book2 = new Book("Title", author2, 2001);
    }
}