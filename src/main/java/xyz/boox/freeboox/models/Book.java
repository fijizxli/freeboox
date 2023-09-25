package xyz.boox.freeboox.models;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(length = 3000)
    private String description;
    @ManyToOne
    private Author author;
    private Integer numberOfPages;
    private String coverPath;
    private String downloadPath;

    private String qrCodePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getDownloadPath() {
        return downloadPath;
    }

    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
    }

    public String getQrCodePath() {
        return qrCodePath;
    }

    public void setQrCodePath(String qrCodePath) {
        this.qrCodePath = qrCodePath;
    }


    public Book(String title, Author author, String downloadPath, String qrCodePath) {
        this.title = title;
        this.author = author;
        this.downloadPath = downloadPath;
        this.qrCodePath = qrCodePath;
    }

    public Book(String title, Author author, String coverPath, String downloadPath, String qrCodePath) {
        this.title = title;
        this.author = author;
        this.coverPath = coverPath;
        this.downloadPath = downloadPath;
        this.qrCodePath = qrCodePath;
    }

    public Book(String title, Author author, Integer numberOfPages, String downloadPath, String qrCodePath) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.downloadPath = downloadPath;
        this.qrCodePath = qrCodePath;
    }

    public Book(String title, String description, String coverPath, String downloadPath, String qrCodePath) {
        this.title = title;
        this.description = description;
        this.coverPath = coverPath;
        this.downloadPath = downloadPath;
        this.qrCodePath = qrCodePath;
    }

    public Book(String title, String description, Author author, Integer numberOfPages, String downloadPath) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.downloadPath = downloadPath;
        this.qrCodePath = qrCodePath;
    }

    public Book(String title, String description, Author author, String coverPath, String downloadPath, String qrCodePath) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.coverPath = coverPath;
        this.downloadPath = downloadPath;
        this.qrCodePath = qrCodePath;
    }

    public Book(String title, String description, Integer numberOfPages, Author author, String coverPath, String downloadPath, String qrCodePath) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.coverPath = coverPath;
        this.downloadPath = downloadPath;
        this.qrCodePath = qrCodePath;
    }
    public Book() {
    }

    @Override
    public String toString() {
        return title;
    }
}
