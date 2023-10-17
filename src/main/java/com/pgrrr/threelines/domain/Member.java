package com.pgrrr.threelines.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "member")
    private List<Subscription> subscriptions = new ArrayList<>();

}
