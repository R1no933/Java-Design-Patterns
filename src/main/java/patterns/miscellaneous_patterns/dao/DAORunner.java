package patterns.miscellaneous_patterns.dao;

import patterns.miscellaneous_patterns.dao.daoImpl.BookDAOImpl;
import patterns.miscellaneous_patterns.dao.model.Books;

public class DAORunner {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();

        for (Books book : bookDAO.getAllBooks()) {
            System.out.println("Book ISBN: " + book.getIsbn() + ". Book name: " + book.getBookName());
        }

        Books book = bookDAO.getAllBooks().get(1);
        book.setBookName("Algoritm's");
        bookDAO.saveBook(book);
    }
}
