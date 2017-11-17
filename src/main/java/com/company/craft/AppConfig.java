package com.company.craft;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    MessageService getMessageService() {
        MessageService service = new SimpleMessageService();
        return service;
    }

}