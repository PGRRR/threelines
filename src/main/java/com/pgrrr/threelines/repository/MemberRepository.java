package com.pgrrr.threelines.repository;

import com.pgrrr.threelines.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String>{}