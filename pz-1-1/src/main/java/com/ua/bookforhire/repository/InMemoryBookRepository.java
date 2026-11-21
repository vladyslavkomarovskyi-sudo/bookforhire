package com.ua.bookforhire.repository;

import com.ua.bookforhire.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryBookRepository implements BookRepository {

    private final Map<Long, Book> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public Book save(Book book) {
        if (book.getId() == null) {
            book.setId(sequence.incrementAndGet());
        }
        storage.put(book.getId(), book);
        return book;
    }
}
