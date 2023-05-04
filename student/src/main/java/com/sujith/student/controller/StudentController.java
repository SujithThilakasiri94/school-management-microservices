package com.sujith.student.controller;

import com.sujith.student.entity.Student;
import com.sujith.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("microservices-student/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("save-student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("get-student")
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }
}
