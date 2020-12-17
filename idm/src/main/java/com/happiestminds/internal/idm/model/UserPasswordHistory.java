package com.happiestminds.internal.idm.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_password_history")
public class UserPasswordHistory extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "history_id")
  private long id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "id")
  private User user;

  @Column(name = "password")
  private String password;

  @Column(name = "salt")
  private String salt;
}
