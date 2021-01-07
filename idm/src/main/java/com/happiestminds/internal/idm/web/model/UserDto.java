package com.happiestminds.internal.idm.web.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.happiestminds.internal.idm.dataaccess.entities.UserType;

import javax.annotation.PostConstruct;
import java.util.List;

public class UserDto {

  private String name;

  private String username;

  private String email;

  private String enterpriseCode;

  private char status;

  private UserType userType;

  //  @JsonIgnore
  private List<RoleDto> role;

  public UserDto() {
  }

  public UserDto(String name, String username, String email, String enterpriseCode, char status, UserType userType, List<RoleDto> role) {
    this.name = name;
    this.username = username;
    this.email = email;
    this.enterpriseCode = enterpriseCode;
    this.status = status;
    this.userType = userType;
    this.role = role;
  }

  public String getEnterpriseCode() {
    return enterpriseCode;
  }

  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
  }

  public char getStatus() {
    return status;
  }

  public void setStatus(char status) {
    this.status = status;
  }

  public UserType getUserType() {
    return userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<RoleDto> getRole() {
    return role;
  }

  public void setRole(List<RoleDto> role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "UserDto{"
            + "name='"
            + name
            + '\''
            + ", username='"
            + username
            + '\''
            + ", emailId='"
            + email
            + '\''
            + ", roles="
            + role
            + '}';
  }
}
