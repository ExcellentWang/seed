package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "information_user_del")
public class InformationUserDel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "information_id")
    private Long informationId;

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
}