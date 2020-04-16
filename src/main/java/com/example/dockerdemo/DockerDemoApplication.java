package com.example.dockerdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.dockerdemo.modal.User;
import com.example.dockerdemo.modal.UserRepository;

@SpringBootApplication
public class DockerDemoApplication {

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> repository.save(new User("Lokesh malwiya", "abc@abc.com"));
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

}
