package com.example.dao;

import com.example.dto.ExampleDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExampleMapper {

    List<ExampleDto> fetchAll();
}
