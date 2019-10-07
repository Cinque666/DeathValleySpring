package com.devincubator.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

@Configuration
@ComponentScan("com.devincubator")
class AccountRepositoryTest {

    @Test
    void findAll() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AccountRepositoryTest.class);

        AccountRepository accountRepository = context.getBean(AccountRepository.class);

        assertEquals(10, accountRepository.findAll().size());
    }
}