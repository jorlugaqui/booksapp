package books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;


@RestController
public class BooksController {


    private static final Book[] books = {
        new Book(1L, "Nemesis", "Isaac Asimov"),
        new Book(2L, "Great Expectations", "Charles Dickens"),
        new Book(3L, "The Chronicles of Narnia", "C.S. Lewis")
    };

    @GetMapping("/books")
    public Book[] books() {
        return books;
    }

    @GetMapping("/books/{id}")
    public Book book(@PathVariable int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
			
        } 
        throw new ResponseStatusException(
            HttpStatus.NOT_FOUND, "Entity not found"
        );        
    }

}