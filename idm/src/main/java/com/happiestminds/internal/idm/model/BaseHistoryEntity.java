package com.happiestminds.internal.idm.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

@Getter
@Setter
@MappedSuperclass
public class BaseHistoryEntity {

  @Column(name = "create_date")
  private Instant createdDate;

  @Column(name = "last_update_date")
  private Instant lastUpdateDate;

  @PrePersist
  public void beforeInsert() {
    createdDate = Instant.now();
  }

  @PreUpdate
  public void beforeUpdate() {
    lastUpdateDate = Instant.now();
  }
}
