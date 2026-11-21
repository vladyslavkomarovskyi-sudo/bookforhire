package com.ua.bookforhire.service.mapper;

import com.ua.bookforhire.domain.Book;
import com.ua.bookforhire.web.dto.BookCardDto;
import com.ua.bookforhire.web.dto.BookDetailDto;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookCardDto toCard(Book b) {
        return new BookCardDto(b.getId(), b.getTitle(), b.getAuthor(),
                b.getPrice(), b.getCoverUrl());
    }

    public BookDetailDto toDetail(Book b) {
        return new BookDetailDto(b.getId(), b.getTitle(), b.getAuthor(), b.getPrice(),
                b.getYear(), b.getCoverUrl(), b.getDescription(), b.getGenre());
    }
}
