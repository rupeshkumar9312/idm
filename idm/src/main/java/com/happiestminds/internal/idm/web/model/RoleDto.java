package com.happiestminds.internal.idm.web.model;

import com.happiestminds.internal.idm.dataaccess.entities.Permission;
import com.happiestminds.internal.idm.dataaccess.entities.RolePermission;
import com.happiestminds.internal.idm.dataaccess.entities.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto implements Serializable {

  private Long id;

  private String name;

  private String description;

  private char status;

  private String enterpriseCode;

  private List<PermissionDto> permissions = new ArrayList<>();

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

  public List<PermissionDto> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionDto> permissions) {
    this.permissions = permissions;
  }
}
