package com.happiestminds.internal.idm.web.model;

import java.util.List;

public class UserDto {

  private String name;

  private String username;

  private String email;

  private List<RoleDto> role;

  public UserDto() {
  }

  public UserDto(String name, String username, String email, List<RoleDto> role) {
    this.name = name;
    this.username = username;
    this.email = email;
    this.role = role;
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
