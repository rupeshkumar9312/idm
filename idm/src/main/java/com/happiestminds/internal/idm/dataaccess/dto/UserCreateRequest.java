package com.happiestminds.internal.idm.dataaccess.dto;

import com.happiestminds.internal.idm.dataaccess.entities.UserType;

import java.util.ArrayList;
import java.util.List;

public class UserCreateRequest {

  private String name;

  private String username;

  private String email;

  private char status;

  private String enterpriseCode;

  private List<IdMapping> role = new ArrayList<>();

  private UserType userType;

  public UserType getUserType() {
    return userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }

  public String getEnterpriseCode() {
    return enterpriseCode;
  }

  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
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

  public char getStatus() {
    return status;
  }

  public void setStatus(char status) {
    this.status = status;
  }

  public List<IdMapping> getRole() {
    return role;
  }

  public void setRole(List<IdMapping> role) {
    this.role = role;
  }
}
