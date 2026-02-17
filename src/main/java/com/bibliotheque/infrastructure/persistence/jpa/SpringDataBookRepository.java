package com.bibliotheque.infrastructure.persistence.jpa;

import com.bibliotheque.infrastructure.persistence.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataBookRepository extends JpaRepository<BookEntity, Long> {
}
