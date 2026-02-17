package com.bibliotheque.application.port.in;

import com.bibliotheque.domain.model.Book;

import java.util.List;

public interface GetBookUseCase {
    Book getBookById(Long id);
    List<Book> getAllBooks();
}
