package com.bibliotheque.application.service;

import com.bibliotheque.application.port.in.CreateBookUseCase;
import com.bibliotheque.application.port.out.BookRepository;
import com.bibliotheque.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateBookService implements CreateBookUseCase {

    private final BookRepository bookRepository;

    @Override
    public Book createBook(String title, String author, String isbn) {
        // TODO
        return null;
    }
}
