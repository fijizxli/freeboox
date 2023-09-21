package xyz.boox.freeboox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.boox.freeboox.models.Book;
import xyz.boox.freeboox.repositories.BookRepository;

@Service
public class BookService {
    @Autowired
    BookRepository br;

    public Book findById(Long id){
        return br.findById(id).get();
    }
}
