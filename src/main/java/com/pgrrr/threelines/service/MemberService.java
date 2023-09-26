package com.pgrrr.threelines.service;

import com.pgrrr.threelines.domain.Member;
import com.pgrrr.threelines.repository.MemberRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> getMemberList() {
        return memberRepository.findAll();
    }
    
}
