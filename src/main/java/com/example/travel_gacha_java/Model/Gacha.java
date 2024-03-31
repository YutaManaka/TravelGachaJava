package com.example.travel_gacha_java.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Gacha")
public class Gacha {
  @Id
  // @GeneratedValue(strategy=GenerationType.AUTO)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name", nullable = true)
  private String name;

  @Column(name = "used", nullable = false)
  private Integer used;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getUsed() {
    return used;
  }

  public void setUsed(Integer used) {
    this.used = used;
  }
}
