package com.pgrrr.threelines.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;

@Getter
@MappedSuperclass
public abstract class BaseEntity {

    @Column
    private String createdBy;

    @Column
    private LocalDateTime createdAt;

    @Column
    private String modifiedBy;

    @Column
    private LocalDateTime modifiedAt;
}
