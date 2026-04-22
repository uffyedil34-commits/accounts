package com.microservices.account.entity;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@MappedSuperclass // tells Spring that this is base class for all entity class extending this class
public class BaseEntity {
    @Column(updatable=false)
    private LocalDateTime createdAt; // column name will be 'created_at'
    @Column(updatable=false)
    private String createdBy;
    @Column(insertable=false)
    private LocalDateTime updatedAt;
    @Column(insertable=false)
    private String updatedBy;
}
