// Generated with g9.

package com.ddd.sample.domain;

import org.springframework.data.annotation.Id;

public class ClassificationType {




    private String nombres;
    @Id
    private int id;

    private CallsClasifitacion callsClasifitacion;

    private ClassificationSubtype classificationSubtype;

    /** Default constructor. */
    public ClassificationType() {
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

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for callsClasifitacion.
     *
     * @return the current value of callsClasifitacion
     */
    public CallsClasifitacion getCallsClasifitacion() {
        return callsClasifitacion;
    }

    /**
     * Setter method for callsClasifitacion.
     *
     * @param aCallsClasifitacion the new value for callsClasifitacion
     */
    public void setCallsClasifitacion(CallsClasifitacion aCallsClasifitacion) {
        callsClasifitacion = aCallsClasifitacion;
    }

    /**
     * Access method for classificationSubtype.
     *
     * @return the current value of classificationSubtype
     */
    public ClassificationSubtype getClassificationSubtype() {
        return classificationSubtype;
    }

    /**
     * Setter method for classificationSubtype.
     *
     * @param aClassificationSubtype the new value for classificationSubtype
     */
    public void setClassificationSubtype(ClassificationSubtype aClassificationSubtype) {
        classificationSubtype = aClassificationSubtype;
    }

}
