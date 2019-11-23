package org.guis.matricula.api.services.impl;

import org.guis.matricula.api.entities.Classroom;
import org.guis.matricula.api.entities.Enrollment;
import org.guis.matricula.api.repositories.ClassroomsRepository;
import org.guis.matricula.api.repositories.EnrollmentRepository;
import org.guis.matricula.api.services.ClassroomsService;
import org.guis.matricula.api.utils.PageWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
    public PageWrapper<Enrollment> findAllEnrollments(Classroom classroom, int academicYear, Pageable pageable) {
        return PageWrapper.of(enrollmentRepository.findAllByClassroomAndAcademicYear(
                pageable, classroom, academicYear));
    }
}
