package com.ua.bookforhire.repository;

import com.ua.bookforhire.domain.Book;
import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Book save(Book book);
}
