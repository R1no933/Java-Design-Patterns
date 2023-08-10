package patterns.miscellaneous_patterns.dao.model;

public class Books {

    private int isbn;
    private String bookName;

    public Books() {}

    public Books(int isbn, String bookName) {
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
