package com.bibliotheque.application.port.out;

import com.bibliotheque.domain.model.Loan;

import java.util.List;

public interface LoanRepository {
    Loan save(Loan loan);
    List<Loan> findActiveByMemberId(Long memberId);
}
