package com.company.craft;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    MessageService getMessageService() {
        MessageService service = new SimpleMessageService(getRepository());
        return service;
    }

    @Bean
    MessageRepository getRepository() {
        MessageRepository repository = new SimpleMessageRepository();
        return repository;
    }

}