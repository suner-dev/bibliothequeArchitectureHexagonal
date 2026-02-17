package com.bibliotheque.infrastructure.persistence.jpa;

import com.bibliotheque.infrastructure.persistence.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataMemberRepository extends JpaRepository<MemberEntity, Long> {
}
