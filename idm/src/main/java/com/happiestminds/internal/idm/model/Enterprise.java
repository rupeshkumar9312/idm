package com.happiestminds.internal.idm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "enterprise")
@ToString
@Getter
@Setter
public class Enterprise extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "status")
  private Status status;

  @Column(name = "enterprise_code")
  private String code;

  @Column(name = "enterprise_type")
  private EnterpriseType type;
}
