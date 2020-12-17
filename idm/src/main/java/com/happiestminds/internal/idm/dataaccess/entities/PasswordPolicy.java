package com.happiestminds.internal.idm.dataaccess.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "password_policy")
public class PasswordPolicy extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @Column(name = "enterprise_code")
  private String enterpriseCode;

  @Column(name = "policy_name")
  private String policyName;

  @Column(name = "description")
  private String description;

  @Column(name = "status")
  private Status status;
}
