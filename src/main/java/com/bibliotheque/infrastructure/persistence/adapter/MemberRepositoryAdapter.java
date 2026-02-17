package com.bibliotheque.infrastructure.persistence.adapter;

import com.bibliotheque.application.port.out.MemberRepository;
import com.bibliotheque.domain.model.Member;
import com.bibliotheque.infrastructure.persistence.jpa.SpringDataMemberRepository;
import com.bibliotheque.infrastructure.persistence.mapper.MemberEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MemberRepositoryAdapter implements MemberRepository {

    private final SpringDataMemberRepository springDataMemberRepository;
    private final MemberEntityMapper memberEntityMapper;

    @Override
    public Member save(Member member) {
        // TODO
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        // TODO
        return Optional.empty();
    }
}
