package com.happiestminds.internal.idm.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "permission")
public class Permission extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "feature")
  private String feature;

  @Column(name = "type")
  private int type;

  @Column(name = "status")
  private Status status;

  @OneToMany(mappedBy = "permission")
  private List<RolePermission> rolePermissions = new ArrayList<>();
}
