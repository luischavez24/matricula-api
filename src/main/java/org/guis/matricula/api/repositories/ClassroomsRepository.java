package org.guis.matricula.api.repositories;

import org.guis.matricula.api.entities.Classroom;
import org.guis.matricula.api.entities.ClassroomPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomsRepository extends JpaRepository<Classroom, ClassroomPK> {
}
