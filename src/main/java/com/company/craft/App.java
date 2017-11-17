package com.company.craft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService service = context.getBean(MessageService.class);;
        System.out.println(service.getMessage());
    }

}