package com.aliciaspringframework.mypetclinic.services;

import com.aliciaspringframework.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
