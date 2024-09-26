package com.kpdev.redisexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BeanLister implements CommandLineRunner {

    @Autowired
    private org.springframework.context.ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        System.out.println("Beans defined in the application context:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}

