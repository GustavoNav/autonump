package com.example.autonump;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.autonump.menu.Menu;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private Menu menu;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        menu.runMenu();
    }
}
