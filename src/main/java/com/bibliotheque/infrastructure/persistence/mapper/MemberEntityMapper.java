package com.bibliotheque.infrastructure.persistence.mapper;

import com.bibliotheque.domain.model.Member;
import com.bibliotheque.infrastructure.persistence.entity.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MemberEntityMapper {
    @Mapping(target = "activeLoansCount", ignore = true)
    Member toDomain(MemberEntity entity);
    MemberEntity toEntity(Member member);
}
