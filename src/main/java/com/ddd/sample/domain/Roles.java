// Generated with g9.

package com.ddd.sample.domain;

import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.AccessType.Type;
import org.springframework.data.annotation.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@Data
@AccessType(Type.PROPERTY)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Roles {
  private final @Id @With Long id;
  private String nombres;

  public Roles(String nombres) {
    this.id = null;
    this.nombres = nombres;
  }

  /**
   * Access method for nombres.
   *
   * @return the current value of nombres
   */
  public String getNombres() {
    return nombres;
  }

  /**
   * Setter method for nombres.
   *
   * @param aNombres the new value for nombres
   */
  public void setNombres(String aNombres) {
    nombres = aNombres;
  }

}
