package xyz.boox.freeboox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.boox.freeboox.models.Book;
import xyz.boox.freeboox.repositories.BookRepository;
import xyz.boox.freeboox.services.BookService;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookService bs;

    /*
    @Autowired
    private BookRepository br;
     */

    @GetMapping("/books/{bookid}")
    public String bookDetails(@PathVariable("bookid") long bookid, Model model) {
        //Optional<Book> book = br.findById(bookid);
        Book book = bs.findById(bookid);
        model.addAttribute("b", book);
        return "book";
    }
}
