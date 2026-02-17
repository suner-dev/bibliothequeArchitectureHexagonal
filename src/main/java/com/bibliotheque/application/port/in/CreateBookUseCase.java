package com.bibliotheque.application.port.in;

import com.bibliotheque.domain.model.Book;

public interface CreateBookUseCase {
    Book createBook(String title, String author, String isbn);
}
