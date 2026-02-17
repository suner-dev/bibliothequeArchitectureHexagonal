package com.bibliotheque.infrastructure.persistence.jpa;

import com.bibliotheque.infrastructure.persistence.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataLoanRepository extends JpaRepository<LoanEntity, Long> {
    List<LoanEntity> findByMemberIdAndReturnedFalse(Long memberId);
}
