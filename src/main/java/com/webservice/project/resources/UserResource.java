package com.webservice.project.resources;

import com.webservice.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Rui", "lagos@gmail.com", "phone","123456" );
        return ResponseEntity.ok().body(u);
    }
}


// Iniciar a aula 300