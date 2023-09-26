package com.pgrrr.threelines.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.pgrrr.threelines.dto.SubscriptionResponseDto;

import lombok.Builder;

@Entity
@Builder
public class Subscription extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SUB_NO", nullable = false)
    private Long subNo;

    @Column(name = "SUB_TITLE")
    private String subTitle;

    @Column(name = "SUB_TYPE")
    private String subType;

    @ManyToOne
    @JoinColumn(name = "MEMBER_NO")
    private Member member;

    public SubscriptionResponseDto toDto(){
        return SubscriptionResponseDto.builder()
        .subTitle(this.subTitle)
        .subType(this.subType)
        .build();
    }
}
