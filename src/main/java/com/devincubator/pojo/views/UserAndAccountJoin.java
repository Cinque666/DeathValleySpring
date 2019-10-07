package com.devincubator.pojo.views;


import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Immutable
public class UserAndAccountJoin {

    @Id
    @Column
    private String name;

    @Column
    private String surName;

    private int account;

    public UserAndAccountJoin() {
    }

    public UserAndAccountJoin(String name, String surName, int account) {
        this.name = name;
        this.surName = surName;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

}
