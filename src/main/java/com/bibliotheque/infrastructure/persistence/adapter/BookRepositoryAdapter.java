package com.bibliotheque.infrastructure.persistence.adapter;

import com.bibliotheque.application.port.out.BookRepository;
import com.bibliotheque.domain.model.Book;
import com.bibliotheque.infrastructure.persistence.jpa.SpringDataBookRepository;
import com.bibliotheque.infrastructure.persistence.mapper.BookEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookRepositoryAdapter implements BookRepository {

    private final SpringDataBookRepository springDataBookRepository;
    private final BookEntityMapper bookEntityMapper;

    @Override
    public Book save(Book book) {
        // TODO
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        // TODO
        return Optional.empty();
    }

    @Override
    public List<Book> findAll() {
        // TODO
        return null;
    }
}
