package com.devincubator.repository;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

@Configuration
@ComponentScan("com.devincubator")
class UserRepositoryTest {

    @Test
    void findAll() {
        ApplicationContext context = new  AnnotationConfigApplicationContext(UserRepositoryTest.class);

        UserRepository userRepository = context.getBean(UserRepository.class);

        assertEquals(12, userRepository.findAll().size());
    }
}