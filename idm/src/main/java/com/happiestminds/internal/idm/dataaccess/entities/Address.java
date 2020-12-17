package com.happiestminds.internal.idm.dataaccess.entities;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address extends BaseHistoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "enterprise_id", referencedColumnName = "id")
  private Enterprise enterprise;

  @Column(name = "house_name")
  private String houseName;

  @Column(name = "street")
  private String street;

  @Column(name = "city")
  private String city;

  @Column(name = "county")
  private String county;

  @Column(name = "postal_code")
  private String postalCode;

  @Column(name = "country")
  private String country;
}
