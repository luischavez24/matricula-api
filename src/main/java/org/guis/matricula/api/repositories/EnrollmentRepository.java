package org.guis.matricula.api.repositories;

import org.guis.matricula.api.entities.Classroom;
import org.guis.matricula.api.entities.Enrollment;
import org.guis.matricula.api.entities.EnrollmentPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EnrollmentRepository extends PagingAndSortingRepository<Enrollment, EnrollmentPK> {

    Page<Enrollment> findAllByClassroomAndAcademicYear(Pageable pageable, Classroom classroom, int academicYear);

}
