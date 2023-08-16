package patterns.miscellaneous_patterns.dao.daoImpl;

import patterns.miscellaneous_patterns.dao.BookDAO;
import patterns.miscellaneous_patterns.dao.model.Books;

import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    private List<Books> books;

    public BookDAOImpl() {
        books = new ArrayList<>();
        books.add(new Books(1, "Java"));
        books.add(new Books(2, "Python"));
        books.add(new Books(3, "Android"));
        books.add(new Books(4, "Swift"));
    }

    @Override
    public List<Books> getAllBooks() {
        return books;
    }

    @Override
    public Books getBookByIsbn(int isbn) {
        return books.get(isbn);
    }

    @Override
    public void saveBook(Books book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Books book) {
        books.remove(book);
    }
}
