package com.note;

import com.note.components.HelloService;
import com.note.configuration.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vladosby on 02.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        HelloService bean = context.getBean(HelloService.class);
        System.out.println(bean.sayHello());
    }
}
