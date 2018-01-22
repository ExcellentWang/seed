package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "information_user")
public class InformationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "information_id")
    private Long informationId;

    @Column(name = "user_id")
    private Long userId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return information_id
     */
    public Long getInformationId() {
        return informationId;
    }

    /**
     * @param informationId
     */
    public void setInformationId(Long informationId) {
        this.informationId = informationId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}