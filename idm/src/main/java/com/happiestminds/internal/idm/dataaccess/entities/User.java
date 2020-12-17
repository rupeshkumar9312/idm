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
  @GeneratedValue(strategy = GenerationType.AUTO)
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
  private Status status;

  @Column(name = "user_type")
  private UserType userType;

  @Column(name = "password_expiry")
  private Instant passwordExpiry;

  @Column(name = "last_login_date")
  private Instant lastLoginDate;

  @Column(name = "name")
  private String name;

  /*  @OneToMany(fetch = FetchType.EAGER)
  @JoinTable(
      name = "user_roles",
      joinColumns = {
        @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
      },
      inverseJoinColumns = {
        @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
      })
  private List<Role> role;*/

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
  private List<UserRole> userRoles = new ArrayList<>();
}
