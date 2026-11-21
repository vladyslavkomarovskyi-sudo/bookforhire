package com.ua.bookforhire.service;

import com.ua.bookforhire.domain.Book;
import com.ua.bookforhire.repository.BookRepository;
import com.ua.bookforhire.service.mapper.BookMapper;
import com.ua.bookforhire.web.dto.BookCardDto;
import com.ua.bookforhire.web.dto.BookDetailDto;
import org.springframework.stereotype.Service;
import com.ua.bookforhire.exception.BookNotFoundException;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;
    private final BookMapper mapper;

    public BookServiceImpl(BookRepository repository, BookMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<BookCardDto> findAll() {
        return repository.findAll().stream().map(mapper::toCard).toList();
    }

    @Override
    public BookDetailDto findById(Long id) {
        Book book = repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
        return mapper.toDetail(book);
    }
}
