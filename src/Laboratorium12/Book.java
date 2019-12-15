package Laboratorium12;

import java.util.Objects;

public class Book {
    String Title;
    String Autor;
    String Publisher;
    int year;

    public Book(String title, String autor, String publisher, int year) {
        Title = title;
        Autor = autor;
        Publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Title.equals(book.Title) &&
                Autor.equals(book.Autor) &&
                Publisher.equals(book.Publisher);
    }
}
