package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Blog {

    public static void main(String[] args) {
        SpringApplication.run(Blog.class, args);
        // 1. Loads the default
        // 2. Starts the boot app
        // 3. Performs a class path scan
        // 4. Starts local tomcat

    }
}
