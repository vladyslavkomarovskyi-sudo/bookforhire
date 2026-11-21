package com.ua.bookforhire.domain;

import java.math.BigDecimal;

public class Book {
    private Long id;
    private String title;
    private String author;
    private BigDecimal price;
    private Integer year;
    private String coverUrl;       // обкладинка (для картки)
    private String description;    // опис (для сторінки книги)
    private String genre;

    public Book() {
    }

    public Book(Long id, String title, String author, BigDecimal price,
                Integer year, String coverUrl, String description, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.coverUrl = coverUrl;
        this.description = description;
        this.genre = genre;
    }

    // гетери і сетери для всіх полів — згенеруйте в IDE
    // (Code → Generate → Getter and Setter)
}
