package com.aliciaspringframework.mypetclinic.repositories;

import com.aliciaspringframework.mypetclinic.models.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
