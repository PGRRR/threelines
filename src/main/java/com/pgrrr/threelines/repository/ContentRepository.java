package com.pgrrr.threelines.repository;

import com.pgrrr.threelines.domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, String>{}