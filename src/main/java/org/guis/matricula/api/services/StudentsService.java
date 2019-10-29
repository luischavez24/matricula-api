package org.guis.matricula.api.services;

import org.guis.matricula.api.entities.Student;

import java.util.List;

public interface StudentsService {

    List<Student> findAllStudents();

}
