package org.guis.matricula.api.services;

import org.guis.matricula.api.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentsService {

    List<Student> findAllStudents();
    
    Optional<Student> findByDni(String studentDni);

}
