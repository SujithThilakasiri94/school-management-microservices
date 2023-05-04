package com.sujith.school.controller;

import com.sujith.school.entity.School;
import com.sujith.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("microservices-school/api/v1")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("save-school")
    @ResponseStatus(HttpStatus.CREATED)
    public School saveSchool(@RequestBody School school){
        return schoolService.saveSchool(school);
    }
    @GetMapping("get-school")
    public List<School> getSchooltList(){
        return schoolService.getSchooltList();
    }
}
