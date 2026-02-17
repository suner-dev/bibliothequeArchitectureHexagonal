package com.bibliotheque.infrastructure.persistence.adapter;

import com.bibliotheque.application.port.out.LoanRepository;
import com.bibliotheque.domain.model.Loan;
import com.bibliotheque.infrastructure.persistence.jpa.SpringDataLoanRepository;
import com.bibliotheque.infrastructure.persistence.mapper.LoanEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LoanRepositoryAdapter implements LoanRepository {

    private final SpringDataLoanRepository springDataLoanRepository;
    private final LoanEntityMapper loanEntityMapper;

    @Override
    public Loan save(Loan loan) {
        // TODO
        return null;
    }

    @Override
    public List<Loan> findActiveByMemberId(Long memberId) {
        // TODO
        return null;
    }
}
