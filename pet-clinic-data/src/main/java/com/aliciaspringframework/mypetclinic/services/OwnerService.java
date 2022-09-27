package com.aliciaspringframework.mypetclinic.services;

import com.aliciaspringframework.mypetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

//    List<Owner> findAllByLastNameLike(String lastname);

}
