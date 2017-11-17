package com.company.craft;

public class SimpleMessageService implements MessageService {

    private MessageRepository repository;

    public SimpleMessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public String getMessage() {
        return repository.getMessage();
    }
    
}