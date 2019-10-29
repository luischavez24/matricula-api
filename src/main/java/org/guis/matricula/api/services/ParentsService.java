package org.guis.matricula.api.services;

import org.guis.matricula.api.entities.Parent;

import java.util.List;
import java.util.Optional;

public interface ParentsService {
    List<Parent> findAllParents();
    Optional<Parent> findById(int parentId);
    Optional<Parent> findByDni(String parentDni);
}
