package org.guis.matricula.api.services.impl;

import org.guis.matricula.api.entities.Parent;
import org.guis.matricula.api.repositories.ParentsRepository;
import org.guis.matricula.api.services.ParentsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("parentsService")
public class ParentsServiceImpl implements ParentsService {

    private final ParentsRepository parentsRepository;

    public ParentsServiceImpl(ParentsRepository parentsRepository) {
        this.parentsRepository = parentsRepository;
    }

    @Override
    public List<Parent> findAllParents() {
        return parentsRepository.findAll();
    }

    @Override
    public Optional<Parent> findById(int parentId) {
        return parentsRepository.findById(parentId);
    }

    @Override
    public Optional<Parent> findByDni(String parentDni) {
        return parentsRepository.findByDni(parentDni);
    }
}
