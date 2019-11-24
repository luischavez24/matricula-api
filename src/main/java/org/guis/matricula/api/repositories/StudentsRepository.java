package org.guis.matricula.api.repositories;

import java.util.Optional;

import org.guis.matricula.api.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {
	
	Optional<Student> findByDni(String dni);
	
}
