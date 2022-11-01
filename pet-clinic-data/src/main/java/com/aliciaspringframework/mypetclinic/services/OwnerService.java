package com.aliciaspringframework.mypetclinic.services;

import com.aliciaspringframework.mypetclinic.models.Owner;
import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
