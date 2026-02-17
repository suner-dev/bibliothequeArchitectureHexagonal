package com.bibliotheque.infrastructure.persistence.mapper;

import com.bibliotheque.domain.model.Loan;
import com.bibliotheque.infrastructure.persistence.entity.LoanEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BookEntityMapper.class, MemberEntityMapper.class})
public interface LoanEntityMapper {
    Loan toDomain(LoanEntity entity);
    LoanEntity toEntity(Loan loan);
}
