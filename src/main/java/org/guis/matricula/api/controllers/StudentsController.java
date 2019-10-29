package org.guis.matricula.api.controllers;

import org.guis.matricula.api.entities.Parent;
import org.guis.matricula.api.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentsController {

    private final StudentsService studentsService;

    @Autowired
    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @GetMapping("")
    public ResponseEntity<?> findAllStudents() {
        return ResponseEntity.ok(studentsService.findAllStudents());
    }

    @GetMapping("/{studentDni}")
    public ResponseEntity<?> findStudentByDni(@PathVariable String studentDni) {

        Optional<Parent> requestParent = Optional.empty(); //studentsService.findByDni(studentDni);

        if(requestParent.isPresent()) {
            return ResponseEntity.ok(requestParent.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
