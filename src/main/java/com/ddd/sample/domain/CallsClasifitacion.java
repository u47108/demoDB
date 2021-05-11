// Generated with g9.

package com.ddd.sample.domain;

import java.time.LocalDateTime;


public class CallsClasifitacion  {



    private LocalDateTime createdAt;

    private String client;

    private String observations;

    private String userNumber;
    private ClassificationType classificationType;

    /** Default constructor. */
    public CallsClasifitacion() {
        super();
    }

    /**
     * Access method for createdAt.
     *
     * @return the current value of createdAt
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter method for createdAt.
     *
     * @param aCreatedAt the new value for createdAt
     */
    public void setCreatedAt(LocalDateTime aCreatedAt) {
        createdAt = aCreatedAt;
    }

    /**
     * Access method for client.
     *
     * @return the current value of client
     */
    public String getClient() {
        return client;
    }

    /**
     * Setter method for client.
     *
     * @param aClient the new value for client
     */
    public void setClient(String aClient) {
        client = aClient;
    }

    /**
     * Access method for observations.
     *
     * @return the current value of observations
     */
    public String getObservations() {
        return observations;
    }

    /**
     * Setter method for observations.
     *
     * @param aObservations the new value for observations
     */
    public void setObservations(String aObservations) {
        observations = aObservations;
    }

    /**
     * Access method for userNumber.
     *
     * @return the current value of userNumber
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * Setter method for userNumber.
     *
     * @param aUserNumber the new value for userNumber
     */
    public void setUserNumber(String aUserNumber) {
        userNumber = aUserNumber;
    }

    /**
     * Access method for classificationType.
     *
     * @return the current value of classificationType
     */
    public ClassificationType getClassificationType() {
        return classificationType;
    }

    /**
     * Setter method for classificationType.
     *
     * @param aClassificationType the new value for classificationType
     */
    public void setClassificationType(ClassificationType aClassificationType) {
        classificationType = aClassificationType;
    }

}
