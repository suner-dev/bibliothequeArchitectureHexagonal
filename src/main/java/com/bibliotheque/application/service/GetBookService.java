package com.bibliotheque.application.service;

import com.bibliotheque.application.port.in.GetBookUseCase;
import com.bibliotheque.application.port.out.BookRepository;
import com.bibliotheque.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetBookService implements GetBookUseCase {

    private final BookRepository bookRepository;

    @Override
    public Book getBookById(Long id) {
        // TODO
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        // TODO
        return null;
    }
}
