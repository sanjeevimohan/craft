package com.company.craft;

import org.springframework.beans.factory.annotation.Autowired;

public class SimpleMessageService implements MessageService {

    @Autowired
    private MessageRepository repository;

    public SimpleMessageService() {}

    public SimpleMessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public String getMessage() {
        return repository.getMessage();
    }
    
}