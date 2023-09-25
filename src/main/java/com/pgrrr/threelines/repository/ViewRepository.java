package com.pgrrr.threelines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgrrr.threelines.domain.Member;

public interface ViewRepository extends JpaRepository<Member, String>{
    
}
