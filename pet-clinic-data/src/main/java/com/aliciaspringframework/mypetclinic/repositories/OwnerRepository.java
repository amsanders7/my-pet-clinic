package com.aliciaspringframework.mypetclinic.repositories;

import com.aliciaspringframework.mypetclinic.models.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
