package com.aliciaspringframework.mypetclinic.repositories;

import com.aliciaspringframework.mypetclinic.models.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
