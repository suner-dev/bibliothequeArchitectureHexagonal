package com.bibliotheque.presentation.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BorrowBookRequest {

    @NotNull(message = "memberId is required")
    private Long memberId;
}
