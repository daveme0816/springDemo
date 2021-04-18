package com.how2java.service;

import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {
    public void doSomeService() throws InterruptedException {
        System.out.println("doSomeService");
        Thread.sleep(100);
    }
}
