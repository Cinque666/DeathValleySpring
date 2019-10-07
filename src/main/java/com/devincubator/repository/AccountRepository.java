package com.devincubator.repository;

import com.devincubator.pojo.entity.Account;
import com.devincubator.util.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountRepository {

    private Session session;

    @Autowired
    public AccountRepository(Session session){
        this.session = session;
    }

    public List<Account> findAll(){
        return session
                .getSession()
                .createQuery("from Account ", Account.class)
                .list();
    }

    public Long findSumAccountValue(){
        return (Long)session
                .getSession()
                .createQuery("SELECT SUM(account) from Account as a")
                .getSingleResult();
    }
}
