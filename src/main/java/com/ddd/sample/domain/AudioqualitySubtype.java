// Generated with g9.

package com.ddd.sample.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.relational.core.mapping.MappedCollection;


public class AudioqualitySubtype {


    private String nombres;
    @MappedCollection
    Set<AudioqualityType> audioqualityType = new HashSet<>();

    /** Default constructor. */
    public AudioqualitySubtype() {
        super();
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
