package xyz.boox.freeboox.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.boox.freeboox.models.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
