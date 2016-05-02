package com.note.components;

import org.springframework.stereotype.Component;

/**
 * Created by vladosby on 02.05.2016.
 */
@Component
public class HelloService {
    public String sayHello() {
        return "Hello world!";
    }
}
