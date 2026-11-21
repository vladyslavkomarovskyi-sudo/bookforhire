package com.ua.bookforhire.web;

import com.ua.bookforhire.service.BookService;
import com.ua.bookforhire.web.dto.BookCardDto;
import com.ua.bookforhire.web.dto.BookDetailDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookCardDto> list() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public BookDetailDto getOne(@PathVariable Long id) {
        return bookService.findById(id);
    }
}
