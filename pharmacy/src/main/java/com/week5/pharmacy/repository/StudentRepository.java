package com.week5.pharmacy.repository;
import com.week5.pharmacy.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<student, Long>{

}