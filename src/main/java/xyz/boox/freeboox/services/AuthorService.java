package xyz.boox.freeboox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.boox.freeboox.models.Author;
import xyz.boox.freeboox.repositories.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository ar;

    public Author findById(Long id){
        return ar.findById(id).get();
    }
}
