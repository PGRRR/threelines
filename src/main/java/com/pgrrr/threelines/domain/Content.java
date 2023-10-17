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
    @Column(nullable = false)
    private Long contentNo;

    @Column
    private String contentAddr;

    @Enumerated(EnumType.STRING)
    @Column
    private LanguageCode contentLang;

    @Column
    private String contentTitle;

    @Column
    private String contentSummary;

    @Column
    private String contentType;

    @ManyToOne
    @JoinColumn
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