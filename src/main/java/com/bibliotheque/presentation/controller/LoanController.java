package com.bibliotheque.presentation.controller;

import com.bibliotheque.application.port.in.BorrowBookUseCase;
import com.bibliotheque.presentation.dto.BorrowBookRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Validated
@RestController
@RequestMapping("/api/loans")
@RequiredArgsConstructor
public class LoanController {

    private final BorrowBookUseCase borrowBookUseCase;

    @PostMapping("/borrow/{bookId}")
    public ResponseEntity<Map<String, Object>> borrowBook(
            @PathVariable Long bookId,
            @Valid @RequestBody BorrowBookRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED).body(LoanResponse);
    }

    @DeleteMapping("borrow/{bookId}")
    public ResponseEntity<Void> deleteLoans(@PathVariable long bookId) {
        LoanService.deleteLoan(bookId);
        return ResponseEntity.ok().build();
    }
}
