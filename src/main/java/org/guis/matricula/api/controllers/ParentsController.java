package org.guis.matricula.api.controllers;
import org.guis.matricula.api.entities.Parent;
import org.guis.matricula.api.services.ParentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/parents")
public class ParentsController {

    private final ParentsService parentsService;

    @Autowired
    public ParentsController(ParentsService parentsService) {
        this.parentsService = parentsService;
    }

    @GetMapping("")
    public ResponseEntity<?> findAllStudents() {
        return ResponseEntity.ok(parentsService.findAllParents());
    }

    @GetMapping("/{parentDni}")
    public ResponseEntity<?> findStudentByDni(@PathVariable String parentDni) {

        Optional<Parent> requestParent = parentsService.findByDni(parentDni);

        if(requestParent.isPresent()) {
            return ResponseEntity.ok(requestParent.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
