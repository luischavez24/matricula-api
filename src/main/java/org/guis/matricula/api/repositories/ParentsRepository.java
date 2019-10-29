package org.guis.matricula.api.repositories;

import org.guis.matricula.api.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParentsRepository extends JpaRepository<Parent, Integer> {

    Optional<Parent> findByDni(String dni);
}
