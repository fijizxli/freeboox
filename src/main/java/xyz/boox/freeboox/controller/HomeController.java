package xyz.boox.freeboox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.boox.freeboox.models.Book;
import xyz.boox.freeboox.repositories.BookRepository;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    BookRepository br;
    @GetMapping("/")
    public String home(Model model) {
        List<Book> books = br.findAll();
        model.addAttribute("books", books);

        return "home";
    }
}
