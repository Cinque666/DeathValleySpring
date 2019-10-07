package com.devincubator.pojo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Account implements Serializable {

    private static final long serialVersionUID = -775192584512958803L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long accountId;

    @Column
    private int account;

    @OneToOne
    private User user;

    public Account() {
    }

    public Account(int account, User user) {
        this.account = account;
        this.user = user;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account1 = (Account) o;

        if (accountId != account1.accountId) return false;
        if (account != account1.account) return false;
        return Objects.equals(user, account1.user);
    }

    @Override
    public int hashCode() {
        int result = (int) (accountId ^ (accountId >>> 32));
        result = 31 * result + account;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
