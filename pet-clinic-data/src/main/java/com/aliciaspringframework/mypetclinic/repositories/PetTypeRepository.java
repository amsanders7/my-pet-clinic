package com.aliciaspringframework.mypetclinic.repositories;

import com.aliciaspringframework.mypetclinic.models.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
