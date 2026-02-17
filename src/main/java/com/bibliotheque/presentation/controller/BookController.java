package com.bibliotheque.presentation.controller;

import com.bibliotheque.application.port.in.CreateBookUseCase;
import com.bibliotheque.application.port.in.GetBookUseCase;
import com.bibliotheque.presentation.dto.BookRequest;
import com.bibliotheque.presentation.dto.BookResponse;
import com.bibliotheque.presentation.mapper.BookDtoMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final CreateBookUseCase createBookUseCase;
    private final GetBookUseCase getBookUseCase;
    private final BookDtoMapper bookDtoMapper;

    @PostMapping
    public ResponseEntity<BookResponse> createBook(@Valid @RequestBody BookRequest request) {
        // TODO
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getBook(@PathVariable Long id) {
        // TODO
        return null;
    }

    @GetMapping
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        // TODO
        return null;
    }
}
