package com.happiestminds.internal.idm.dataaccess.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "username")
  private String username;

  @Column(name = "email_id")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "salt")
  private String salt;

  @Column(name = "passwd_created")
  private String passwordCreateAt;

  @Column(name = "change_passwd")
  private int changePassword;

  @Column(name = "login_fail_count")
  private int loginFailedCount;

  @Column(name = "enterprise_code")
  private String enterpriseCode;

  @Column(name = "status")
  private char status;

  @Column(name = "user_type")
  private UserType userType;

  @Column(name = "password_expiry")
  private Instant passwordExpiry;

  @Column(name = "last_login_date")
  private Instant lastLoginDate;

  @Column(name = "name")
  private String name;

  @OneToMany(fetch = FetchType.EAGER)
  @JoinTable(
          name = "user_roles",
          joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
          inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
  private List<Role> role;

  /*
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<UserRole> userRoles = new ArrayList<>();
  */

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getPasswordCreateAt() {
    return passwordCreateAt;
  }

  public void setPasswordCreateAt(String passwordCreateAt) {
    this.passwordCreateAt = passwordCreateAt;
  }

  public int getChangePassword() {
    return changePassword;
  }

  public void setChangePassword(int changePassword) {
    this.changePassword = changePassword;
  }

  public int getLoginFailedCount() {
    return loginFailedCount;
  }

  public void setLoginFailedCount(int loginFailedCount) {
    this.loginFailedCount = loginFailedCount;
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

  public Instant getPasswordExpiry() {
    return passwordExpiry;
  }

  public void setPasswordExpiry(Instant passwordExpiry) {
    this.passwordExpiry = passwordExpiry;
  }

  public Instant getLastLoginDate() {
    return lastLoginDate;
  }

  public void setLastLoginDate(Instant lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /*public List<UserRole> getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(List<UserRole> userRoles) {
    this.userRoles = userRoles;
  }*/

  public List<Role> getRole() {
    return role;
  }

  public void setRole(List<Role> role) {
    this.role = role;
  }
}
