package xyz.boox.freeboox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.boox.freeboox.models.Author;
import xyz.boox.freeboox.repositories.AuthorRepository;
import xyz.boox.freeboox.services.AuthorService;

import java.util.Optional;

@Controller
public class AuthorController {
    @Autowired
    private AuthorService as;

    @GetMapping("/authors/{authorid}")
    public String AuthorDetails(@PathVariable("authorid") long authorid, Model model){
        Author author = as.findById(authorid);
        model.addAttribute("a", author);
        return "author";
    }
}
