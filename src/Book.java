public class Book {
    private final String bookName;
//    private
    final Author authorName;
    private int publicationYear;

    public Book(String bookName, Author authorName, int publicationYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getBookName(){
        return bookName;
    }
    public Author getAuthorName(){
        return authorName;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
}
