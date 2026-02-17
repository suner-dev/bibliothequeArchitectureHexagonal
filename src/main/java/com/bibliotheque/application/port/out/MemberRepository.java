package com.bibliotheque.application.port.out;

import com.bibliotheque.domain.model.Member;

import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
}
