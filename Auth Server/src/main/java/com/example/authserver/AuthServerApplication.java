package com.example.authserver;

import com.example.authserver.model.Client;
import com.example.authserver.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AuthServerApplication {

    @Autowired
    private ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }

    @GetMapping("/home")
    public String index() {
        return "ok";
    }

    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable int id) {
        return clientRepository.findById(id);
    }
}
