package xyz.boox.freeboox.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.boox.freeboox.models.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    @Override
    List<Book> findAll();

    @Override
    Optional<Book> findById(Long id);
}
