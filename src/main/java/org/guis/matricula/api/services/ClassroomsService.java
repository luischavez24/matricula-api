package org.guis.matricula.api.services;

import org.guis.matricula.api.entities.Classroom;
import org.guis.matricula.api.entities.Enrollment;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ClassroomsService {

    List<Classroom> findAllClassrooms();

    Page<Enrollment> findAllEnrollments(Classroom classroom, int academicPeriod, int page, int size);

}
