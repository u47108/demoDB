// Generated with g9.

package com.ddd.sample.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE, onConstructor = @__(@PersistenceConstructor))
public class Users {
  
  private final @Id @With Long id;
  private String lenguage;
  private String nombres;

  public Users(String lenguage, String nombres) {
    this.id = null;
    this.lenguage = lenguage;
    this.nombres = nombres;
  }


  /**
   * Access method for lenguage.
   *
   * @return the current value of lenguage
   */
  public String getLenguage() {
    return lenguage;
  }

  /**
   * Setter method for lenguage.
   *
   * @param aLenguage the new value for lenguage
   */
  public void setLenguage(String aLenguage) {
    lenguage = aLenguage;
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
