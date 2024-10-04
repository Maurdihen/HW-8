import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearPublication;

    @Override
    public String toString() {
        return "Книга под названием " + title + " автора " + author + " и " + yearPublication  + " года выпуска";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return getYearPublication() == book.getYearPublication() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublication);
    }

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
