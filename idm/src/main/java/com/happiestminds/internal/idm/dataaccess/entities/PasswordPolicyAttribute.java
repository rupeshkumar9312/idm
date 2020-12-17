package com.happiestminds.internal.idm.dataaccess.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "password_policy_attr")
public class PasswordPolicyAttribute {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "attr_name")
  private String attributeName;

  @Column(name = "attr_value")
  private String attributeValue;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "policy_id", referencedColumnName = "id")
  //  @Column(name = "policy_id")
  private PasswordPolicy passwordPolicy;
}
