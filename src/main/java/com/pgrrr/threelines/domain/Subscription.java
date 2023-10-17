package com.pgrrr.threelines.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.pgrrr.threelines.dto.SubscriptionResponseDto;

import lombok.Builder;

@Entity
@Builder
public class Subscription extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long subNo;

    @Column
    private String subTitle;

    @Column
    private String subType;

    @ManyToOne
    @JoinColumn
    private Member member;

    @OneToMany(mappedBy = "content")
    private List<Content> contents;

    public SubscriptionResponseDto toDto(){
        return SubscriptionResponseDto.builder()
        .subTitle(this.subTitle)
        .subType(this.subType)
        .build();
    }
}
