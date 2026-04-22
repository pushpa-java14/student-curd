package com.atlas.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atlas.studentservice.repository.entity.StudentEntity;

@Repository
/**
 * Repository interface for studentEntity Provides CRUD operations without
 * implementation
 */
public interface StudentEntityRepository extends JpaRepository<StudentEntity, Long> {

}