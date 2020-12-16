package com.happiestminds.internal.idm.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "status")
  private Status status;

  @Column(name = "enterprise_code")
  private String enterpriseCode;
}
