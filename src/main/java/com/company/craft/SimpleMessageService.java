package com.company.craft;

public class SimpleMessageService implements MessageService {

    private MessageRepository repository = new SimpleMessageRepository();

    public String getMessage() {
        return repository.getMessage();
    }
    
}