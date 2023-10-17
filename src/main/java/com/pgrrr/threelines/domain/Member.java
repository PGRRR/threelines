package com.pgrrr.threelines.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;

@Entity
@Builder
public class Member extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long memberNo;

    @Column
    private String memberEmail;

    @Column
    private String memberNm;

    @Column
    private String memberPw;

    @OneToMany(mappedBy = "subscription")
    private List<Subscription> subscriptions;

}
