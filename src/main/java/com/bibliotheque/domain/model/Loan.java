package com.bibliotheque.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    private Long id;
    private Book book;
    private Member member;
    private LocalDate borrowedAt;
    private LocalDate returnedAt;
    private boolean returned;
}
