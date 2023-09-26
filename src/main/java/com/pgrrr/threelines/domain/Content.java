package com.pgrrr.threelines.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.pgrrr.threelines.dto.ContentResponseDto;

import lombok.Builder;

@Entity
@Builder
public class Content extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTENT_NO", nullable = false)
    private Long contentNo;

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
        .contentNo(this.contentNo)
        .contentSummary(this.contentSummary)
        .contentTitle(this.contentTitle)
        .contentType(this.contentType)
        .build();
    }
}