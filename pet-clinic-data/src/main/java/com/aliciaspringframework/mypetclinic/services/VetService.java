package com.aliciaspringframework.mypetclinic.services;

import com.aliciaspringframework.mypetclinic.model.Owner;
import com.aliciaspringframework.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
