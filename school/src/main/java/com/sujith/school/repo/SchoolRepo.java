package com.sujith.school.repo;
import com.sujith.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School,Integer> {
}
