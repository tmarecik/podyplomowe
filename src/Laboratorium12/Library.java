package Laboratorium12;

public class Library {

    Object[] bookShelf = new Object[5];

    public void showBookDetailsFromShelf(int bookIndexInShelf){
        System.out.println(bookShelf[bookIndexInShelf]);

    }

    public static void main(String[] args) {

        Library library = new Library();
        Book book = new Book("HairiśPoTTa", "Personaq Nongrata", "Main Narodnyja Publisier", 696);
        Book book1 = new Book("WładcaBranzolet", "Personaq Grata", "COrpoLandia", 6969);
        Book book2 = new Book("WłatcyMuh", "Persona", "OffStremPublishing", 1111);
        Book book3 = new Book("WłatcyMuh", "Persona", "OffStremPublishing", 1111);
        Book book4 = new Book("WłatcyMuh", "Persona", "OffStremPublishing", 1111);

        library.bookShelf[0] = book;
        library.bookShelf[1] = book1;
        library.bookShelf[2] = book2;
        library.bookShelf[3] = book3;
        library.bookShelf[4] = book4;

        System.out.println(library.bookShelf[0].equals(library.bookShelf[0]));
        System.out.println(library.bookShelf[0].equals(library.bookShelf[1]));
        System.out.println(library.bookShelf[1].equals(library.bookShelf[3]));
        System.out.println(library.bookShelf[2].equals(library.bookShelf[3]));
        System.out.println(library.bookShelf[2].equals(library.bookShelf[4]));


        library.showBookDetailsFromShelf(0);
        library.showBookDetailsFromShelf(1);
        library.showBookDetailsFromShelf(2);

    }

}
