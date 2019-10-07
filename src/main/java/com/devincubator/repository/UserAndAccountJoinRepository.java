package com.devincubator.repository;

import com.devincubator.pojo.views.UserAndAccountJoin;
import com.devincubator.util.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAndAccountJoinRepository {

    private Session session;

    @Autowired
    public UserAndAccountJoinRepository(Session session){
        this.session = session;
    }

    public List<UserAndAccountJoin> findAll(){
        return session
                .getSession()
                .createQuery("from UserAndAccountJoin ", UserAndAccountJoin.class)
                .list();
    }

    public List<UserAndAccountJoin> findMaxAccount(){

        Integer maxAccount = (Integer)session
                                            .getSession()
                                            .createQuery("select max(u.account) from UserAndAccountJoin u")
                                            .getSingleResult();

        return session
                    .getSession()
                    .createQuery("select u from UserAndAccountJoin u Where u.account = :someValue", UserAndAccountJoin.class)
                    .setParameter("someValue", maxAccount)
                    .list();
    }
}
