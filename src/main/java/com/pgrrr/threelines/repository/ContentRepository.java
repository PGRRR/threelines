package com.pgrrr.threelines.repository;

import com.pgrrr.threelines.domain.Content;
import com.pgrrr.threelines.enums.LanguageCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContentRepository extends JpaRepository<Content, String>{
    Optional<Content> findByContentAddrAndContentLang(String contentAddr, LanguageCode contentLang);
}