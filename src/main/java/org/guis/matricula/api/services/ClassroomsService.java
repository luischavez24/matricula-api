package org.guis.matricula.api.services;

import org.guis.matricula.api.entities.Classroom;
import org.guis.matricula.api.entities.Enrollment;
import org.guis.matricula.api.utils.PageWrapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClassroomsService {

    List<Classroom> findAllClassrooms();

    PageWrapper<Enrollment> findAllEnrollments(Classroom classroom, int academicPeriod, Pageable pageable);

}
