package xyz.boox.freeboox.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date dateOfBirth;
    private Boolean isAlive;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Author(String name, Date dateOfBirth, Boolean isAlive, List<Book> books) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.isAlive = isAlive;
        this.books = books;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return name;
    }
}
