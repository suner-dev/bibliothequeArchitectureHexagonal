package com.bibliotheque.application.port.in;

import com.bibliotheque.domain.model.Loan;

public interface BorrowBookUseCase {
    Loan borrowBook(Long bookId, Long memberId);
}
