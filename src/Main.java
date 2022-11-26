public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Дюма");
        Author author2 = new Author("Иван", "Ефремов");
        Book book1 = new Book("Три мушкетёра", author1, 1975);
        Book book2 = new Book("Таис Афинская", author2, 1992);
        Book book3 = new Book("Таис Афинская", author2, 1994);

        System.out.println(book1);
        System.out.println(author1);

        System.out.println(book2);
        System.out.println("\nСравниваем книги book2 & book3");
        System.out.println("hashCode book2 = " + book2.hashCode());
        System.out.println("hashCode book3 = " + book3.hashCode());
        System.out.println("Результат сравнения equals: " + book2.equals(book3));
        book2.setPublicationYear(1994);
        System.out.println("\nЭту книгу переиздали, теперь:");
        System.out.println(book2);
        System.out.println("Сравниваем книги book2 & book3");
        System.out.println("hashCode book2 = " + book2.hashCode());
        System.out.println("hashCode book3 = " + book3.hashCode());
        System.out.println("Результат сравнения equals: " + book2.equals(book3));

        System.out.println("\n  *** Homework is ready ! ***");
    }
}