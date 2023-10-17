package com.pgrrr.threelines.domain;

import java.util.ArrayList;
import java.util.List;

import com.pgrrr.threelines.dto.SubscriptionResponseDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "subscription")
    private List<Content> contents = new ArrayList<>();

    public SubscriptionResponseDto toDto(){
        return SubscriptionResponseDto.builder()
        .subTitle(this.subTitle)
        .subType(this.subType)
        .build();
    }
}
