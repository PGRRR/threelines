package com.pgrrr.threelines.domain;

import javax.persistence.*;

import com.pgrrr.threelines.dto.ContentResponseDto;

import com.pgrrr.threelines.enums.LanguageCode;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Builder
@AllArgsConstructor
public class Content extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTENT_NO", nullable = false)
    private Long contentNo;

    @Column(name = "CONTENT_ADDR")
    private String contentAddr;

    @Enumerated(EnumType.STRING)
    @Column(name = "CONTENT_LANG")
    private LanguageCode contentLang;

    @Column(name = "CONTENT_TITLE")
    private String contentTitle;

    @Column(name = "CONTENT_SUMMARY")
    private String contentSummary;

    @Column(name = "CONTENT_TYPE")
    private String contentType;

    @ManyToOne
    @JoinColumn(name = "SUB_NO")
    private Subscription subscription;

    public ContentResponseDto toDto(){
        return ContentResponseDto.builder()
        .contentAddr(this.contentAddr)
        .contentSummary(this.contentSummary)
        .contentTitle(this.contentTitle)
        .contentType(this.contentType)
        .build();
    }
}