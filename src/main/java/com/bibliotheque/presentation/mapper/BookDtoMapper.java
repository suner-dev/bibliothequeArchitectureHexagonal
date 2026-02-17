package com.bibliotheque.presentation.mapper;

import com.bibliotheque.domain.model.Book;
import com.bibliotheque.presentation.dto.BookResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookDtoMapper {
    BookResponse toResponse(Book book);
}
