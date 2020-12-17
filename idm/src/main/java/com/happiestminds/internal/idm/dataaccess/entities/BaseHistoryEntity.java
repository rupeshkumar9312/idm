package com.happiestminds.internal.idm.dataaccess.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

@MappedSuperclass
public class BaseHistoryEntity {

    @Column(name = "create_date")
    private Instant createdDate;

    @Column(name = "last_update_date")
    private Instant lastUpdateDate;

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Instant lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @PrePersist
    public void beforeInsert() {
        createdDate = Instant.now();
        lastUpdateDate = Instant.now();
    }

    @PreUpdate
    public void beforeUpdate() {
        lastUpdateDate = Instant.now();
  }
}
