package com.example.Digital.Class.repository;

import com.example.Digital.Class.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StudentDao extends CrudRepository<Student, Integer> {
}
