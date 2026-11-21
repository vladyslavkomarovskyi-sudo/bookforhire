package com.ua.bookforhire.config;

import com.ua.bookforhire.domain.Book;
import com.ua.bookforhire.repository.BookRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BookSeeder implements ApplicationRunner {

    private final BookRepository repository;

    public BookSeeder(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Book(null, "Кобзар", "Тарас Шевченко",
                new BigDecimal("250.00"), 1840, "/covers/kobzar.jpg",
                "Збірка поетичних творів.", "Поезія"));
        // додайте ще 3–4 свої книги з власними полями
    }
}
