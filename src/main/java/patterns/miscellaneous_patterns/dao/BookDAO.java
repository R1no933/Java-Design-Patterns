package patterns.miscellaneous_patterns.dao;

import patterns.miscellaneous_patterns.dao.model.Books;

import java.util.List;

public interface BookDAO {

    List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void saveBook(Books book);

    void deleteBook(Books book);
}
