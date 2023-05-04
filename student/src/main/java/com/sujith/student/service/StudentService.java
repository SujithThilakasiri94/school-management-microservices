package com.sujith.student.service;

import com.sujith.student.entity.Student;
import com.sujith.student.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }
    public List<Student> getStudentList() {
        return studentRepo.findAll();
    }
}
