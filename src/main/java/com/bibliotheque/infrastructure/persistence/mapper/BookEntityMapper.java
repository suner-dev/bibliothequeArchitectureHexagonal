package com.bibliotheque.infrastructure.persistence.mapper;

import com.bibliotheque.domain.model.Book;
import com.bibliotheque.infrastructure.persistence.entity.BookEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookEntityMapper {
    Book toDomain(BookEntity entity);
    BookEntity toEntity(Book book);
}
