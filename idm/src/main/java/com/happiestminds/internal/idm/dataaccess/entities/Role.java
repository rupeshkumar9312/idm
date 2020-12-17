package com.happiestminds.internal.idm.dataaccess.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

  /*@ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
      name = "role_permissions",
      joinColumns = {@JoinColumn(name = "id", referencedColumnName = "id",insertable = false,updatable = false)},
      inverseJoinColumns = {@JoinColumn(name = "id", referencedColumnName = "id",insertable = false,updatable = false)})
  private List<Permission> permissions;
*/

  @OneToMany(mappedBy = "role")
  private List<RolePermission> rolePermissions = new ArrayList<>();

  @OneToMany(mappedBy = "role")
  private List<UserRole> userRoles = new ArrayList<>();
}
