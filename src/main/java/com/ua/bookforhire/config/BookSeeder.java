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
        repository.save(new Book(null, "Тіні забутих предків", "Михайло Коцюбинський",
                new BigDecimal("180.00"), 1911, "/covers/tini.jpg",
                "Повість про кохання на Гуцульщині.", "Проза"));
        repository.save(new Book(null, "Лісова пісня", "Леся Українка",
                new BigDecimal("160.00"), 1911, "/covers/lisova-pisnia.jpg",
                "Драма-феєрія за мотивами волинських легенд.", "Драма"));
        repository.save(new Book(null, "Intermezzo", "Михайло Коцюбинський",
                new BigDecimal("150.00"), 1908, "/covers/intermezzo.jpg",
                "Імпресіоністична новела.", "Проза"));
        repository.save(new Book(null, "Захар Беркут", "Іван Франко",
                new BigDecimal("200.00"), 1883, "/covers/zakhar-berkut.jpg",
                "Історична повість про боротьбу карпатської громади.", "Історична проза"));
    }
}
