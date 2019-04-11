package com.example.controllers;

import com.example.dto.ExampleDto;
import com.example.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/fetchAll")
    public List<ExampleDto> fetchAll() {
        return exampleService.fetchAll();
    }
}
