package com.exam.apiexam.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.apiexam.models.Exam;
import com.exam.apiexam.repository.ExamRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping(value="/api")
@Api(value="API REST Busca Exames pelo id")
@CrossOrigin(origins="*")
public class ExamResource {

	@Autowired
	ExamRepository examRepository;
	
	@GetMapping("/exam/{id}")
	@ApiOperation(value="Retorna um único exame com base em seu ID")
	public Exam ListExamById(@PathVariable(value="id") long id){
		return examRepository.findById(id);
		
	}
	
	
}
