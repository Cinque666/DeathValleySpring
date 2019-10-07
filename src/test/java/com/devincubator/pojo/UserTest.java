package com.devincubator.pojo;

import com.devincubator.pojo.entity.User;
import com.devincubator.util.HibernateUtilTest;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class UserTest {
    private static User createTestData(){
        return new User("Raman", "Zamoiski");
    }



    @Test
    public void testSave(){
        Session session = HibernateUtilTest.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        User user = createTestData();

        session.save(user);

        transaction.commit();
        session.close();

        session = HibernateUtilTest.getInstance().getSession();
        transaction = session.beginTransaction();

        user = session.get(User.class, 1L);
        assertNotNull(user);
        transaction.commit();
        session.close();
    }
}