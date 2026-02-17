package com.bibliotheque.application.service;

import com.bibliotheque.application.port.in.BorrowBookUseCase;
import com.bibliotheque.application.port.out.BookRepository;
import com.bibliotheque.application.port.out.LoanRepository;
import com.bibliotheque.application.port.out.MemberRepository;
import com.bibliotheque.domain.model.Loan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BorrowBookService implements BorrowBookUseCase {

    private final BookRepository bookRepository;
    private final MemberRepository memberRepository;
    private final LoanRepository loanRepository;

    @Override
    public Loan borrowBook(Long bookId, Long memberId) {
        // TODO
        return null;
    }
}
