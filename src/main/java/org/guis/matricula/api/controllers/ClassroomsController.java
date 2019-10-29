package org.guis.matricula.api.controllers;

import org.guis.matricula.api.entities.Classroom;
import org.guis.matricula.api.services.ClassroomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/classrooms")
public class ClassroomsController {
    private final ClassroomsService classroomsService;

    @Autowired
    public ClassroomsController(ClassroomsService classroomsService) {
        this.classroomsService = classroomsService;
    }

    @GetMapping("")
    public ResponseEntity<?> index() {
        return ResponseEntity.ok(classroomsService.findAllClassrooms());
    }

    @GetMapping("/{gradeId}/{sectionId}/enrollments/{academicPeriod}")
    public ResponseEntity<?> findAllEnrollments(@PathVariable int gradeId,  @PathVariable int sectionId, @PathVariable int academicPeriod,
                                                @RequestParam Optional<Integer> page,  @RequestParam Optional<Integer> size) {

        Classroom classroom = new Classroom();
        classroom.setSectionId(sectionId);
        classroom.setGradeId(gradeId);

        return ResponseEntity.ok(classroomsService.findAllEnrollments(classroom, academicPeriod, page.orElse(0), size.orElse(20)));
    }
}
