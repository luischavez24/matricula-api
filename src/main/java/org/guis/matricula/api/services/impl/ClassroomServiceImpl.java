package org.guis.matricula.api.services.impl;

import org.guis.matricula.api.entities.Classroom;
import org.guis.matricula.api.entities.Enrollment;
import org.guis.matricula.api.repositories.ClassroomsRepository;
import org.guis.matricula.api.repositories.EnrollmentRepository;
import org.guis.matricula.api.services.ClassroomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classroomService")
public class ClassroomServiceImpl implements ClassroomsService {

    private final ClassroomsRepository classroomsRepository;

    private final EnrollmentRepository enrollmentRepository;
    @Autowired
    public ClassroomServiceImpl(ClassroomsRepository classroomsRepository, EnrollmentRepository enrollmentRepository) {
        this.classroomsRepository = classroomsRepository;
        this.enrollmentRepository = enrollmentRepository;
    }
    @Override
    public List<Classroom> findAllClassrooms() {
        return classroomsRepository.findAll();
    }

    @Override
    public Page<Enrollment> findAllEnrollments(Classroom classroom, int academicYear, int page, int size) {
        return enrollmentRepository.findAllByClassroomAndAcademicYear(PageRequest.of(page, size), classroom, academicYear);
    }
}
