package com.aliciaspringframework.mypetclinic.repositories;

import com.aliciaspringframework.mypetclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
