package com.example.api.controller;

import com.example.api.entities.GreetingEntity;
import com.example.api.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    private GreetingRepository repository;

    @RequestMapping(value = "/hello")
    public String hello(
            @RequestParam String lang
    ) {
        GreetingEntity entity = this.repository.findFirstByLang(lang);
        return entity.text;
    }
}
