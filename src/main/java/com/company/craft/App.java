package com.company.craft;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World");

        MessageService service = new SimpleMessageService();
        System.out.println(service.getMessage());
    }

}