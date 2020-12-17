package com.happiestminds.internal.idm.model;

import javax.persistence.*;

@Entity
@Table(name = "role_permission")
public class RolePermission extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @ManyToOne
  @JoinColumn(name = "role_id", referencedColumnName = "id")
  private Role role;

  @ManyToOne
  @JoinColumn(name = "permission_id", referencedColumnName = "id")
  private Permission permission;
}
