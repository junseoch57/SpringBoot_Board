package com.example.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity extends BoardEntity{
    @CreationTimestamp  // 생성될 때 시간
    @Column(updatable = false)
    private LocalDateTime createdTime;

    @UpdateTimestamp   // 수정될 때 시간
    @Column(insertable = false)  // 입력시 관여 X
    private LocalDateTime updatedTime;


}
