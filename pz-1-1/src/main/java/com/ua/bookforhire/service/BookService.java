package com.ua.bookforhire.service;

import com.ua.bookforhire.web.dto.BookCardDto;
import com.ua.bookforhire.web.dto.BookDetailDto;
import java.util.List;

public interface BookService {
    List<BookCardDto> findAll();
    BookDetailDto findById(Long id);
}
