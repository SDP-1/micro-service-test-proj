package com.micro.student.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)  // Add this line
@Data
public class GenaralModel {

    @Column(unique = true, nullable = false, updatable = false)
    private String uuid;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    @PrePersist
    public void generateUuid() {
        if (uuid == null) {
            this.uuid = UUID.randomUUID().toString();
        }
    }
}
