package com.sujith.school.service;

import com.sujith.school.entity.School;
import com.sujith.school.repo.SchoolRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class SchoolService {

    @Autowired
    private SchoolRepo schoolRepo;
    public School saveSchool(School school) {
        return schoolRepo.save(school);
    }
    public List<School> getSchooltList(){
        return schoolRepo.findAll();
    }
}
