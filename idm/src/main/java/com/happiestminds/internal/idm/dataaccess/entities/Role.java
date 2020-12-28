package com.happiestminds.internal.idm.dataaccess.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "role")
public class Role extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name", unique = true)
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "status")
  private char status;

  @Column(name = "enterprise_code")
  private String enterpriseCode;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
          name = "role_permissions",
          joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
          inverseJoinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id")})
  private List<Permission> permissions;

  @OneToMany(mappedBy = "role")
  private List<UserRole> userRoles = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public char getStatus() {
    return status;
  }

  public void setStatus(char status) {
    this.status = status;
  }

  public String getEnterpriseCode() {
    return enterpriseCode;
  }

  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
  }

  public List<UserRole> getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(List<UserRole> userRoles) {
    this.userRoles = userRoles;
  }

  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }
}
