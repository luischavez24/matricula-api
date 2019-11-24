package org.guis.matricula.api.services.impl;

import org.guis.matricula.api.entities.Student;
import org.guis.matricula.api.repositories.StudentsRepository;
import org.guis.matricula.api.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("studentsService")
public class StudentsServiceImpl implements StudentsService {

    private final StudentsRepository studentsRepository;

    @Autowired
    public StudentsServiceImpl(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentsRepository.findAll();
    }

	@Override
	public Optional<Student> findByDni(String studentDni) {
		return studentsRepository.findByDni(studentDni);
	}
}
