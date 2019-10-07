package com.devincubator.repository;

import com.devincubator.pojo.entity.User;
import com.devincubator.util.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository {

    private Session session;

    @Autowired
    public UserRepository(Session session){
        this.session = session;
    }

    public List<User> findAll(){
        return session
                .getSession()
                .createQuery("from User", User.class)
                .list();
    }
}
