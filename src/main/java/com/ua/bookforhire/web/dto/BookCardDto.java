package com.ua.bookforhire.web.dto;

import java.math.BigDecimal;

public record BookCardDto(Long id, String title, String author,
                          BigDecimal price, String coverUrl) {
}
