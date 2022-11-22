public class Main {

    public static void printBook(Book book) {
        System.out.println("--------------------------------");
        System.out.println("Автор: "+ book.authorName.getName()+" "+ book.authorName.getSurname());
        System.out.println("Книга: "+ book.getBookName());
        System.out.println("Год издания: "+ book.getPublicationYear());
    }

    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Дюма");
        Author author2 = new Author("Иван", "Ефремов");
        Book book1 = new Book("Три мушкетёра", author1, 1975);
        Book book2 = new Book("Таис Афинская", author2, 1992);

        printBook(book1);
        printBook(book2);
        book2.setPublicationYear(1994);
        System.out.println("\nЭту книгу переиздали, теперь:");
        printBook(book2);

        System.out.println("\n  *** Homework is ready ! ***");
    }
}