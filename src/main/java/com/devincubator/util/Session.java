package com.devincubator.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Session {

    private org.hibernate.Session session;

    public Session(){
        this.session = HibernateUtil.getInstance().getSession();
    }

    public org.hibernate.Session getSession(){
        return session;
    }
}
