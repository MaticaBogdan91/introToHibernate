package app;

import com.github.javafaker.Book;
import com.github.javafaker.Faker;
import dao.BookDao;
import org.apache.log4j.Logger;

public class App {

    static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Faker faker = new Faker();
        BookDao bookDao = new BookDao();

//       bookDao.insertIntoTable(new Book(faker.book().author()));
//        bookDao.deleteFromTable(6L);
//      bookDao.updateBook("TIBI", 5L);
        System.out.println(bookDao.getAllBooks());

//        log.info(bookDao.getAllBooks());
//        log.info(bookDao.getBookById(6L));
//        log.trace("Trace Message!");
//        log.debug("Debug Message!");
//        log.info("Info Message!");
//        log.warn("Warn Message!");
//        log.error("Error Message!");
//        log.fatal("Fatal Message!");
    }
}