package com.exam.apiexam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.apiexam.models.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {

	Exam findById(long id);
}
