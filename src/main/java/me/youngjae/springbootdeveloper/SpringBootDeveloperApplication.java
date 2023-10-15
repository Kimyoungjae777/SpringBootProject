package me.youngjae.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDeveloperApplication
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }

}
