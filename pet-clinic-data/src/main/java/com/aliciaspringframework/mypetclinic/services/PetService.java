package com.aliciaspringframework.mypetclinic.services;

import com.aliciaspringframework.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
