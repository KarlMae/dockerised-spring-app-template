package com.example.services;

import com.example.dao.ExampleMapper;
import com.example.dto.ExampleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    @Autowired
    private ExampleMapper dao;

    public List<ExampleDto> fetchAll() {
        return dao.fetchAll();
    }
}
