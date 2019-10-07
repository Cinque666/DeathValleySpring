package com.devincubator.repository;

import com.devincubator.pojo.views.UserAndAccountJoin;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Configuration
@ComponentScan("com.devincubator")
class UserAndAccountJoinRepositoryTest {

    @Test
    void findMaxAccount() {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserAndAccountJoinRepositoryTest.class);

        UserAndAccountJoinRepository userAndAccountJoinRepository = context.getBean(UserAndAccountJoinRepository.class);
        assertEquals(1, userAndAccountJoinRepository.findMaxAccount().size());

    }

    @Test
    void findAll(){
        ApplicationContext context = new AnnotationConfigApplicationContext(UserAndAccountJoinRepositoryTest.class);

        UserAndAccountJoinRepository userAndAccountJoinRepository = context.getBean(UserAndAccountJoinRepository.class);

        List<UserAndAccountJoin> list = userAndAccountJoinRepository.findAll();

        assertEquals(10, list.size());
    }
}