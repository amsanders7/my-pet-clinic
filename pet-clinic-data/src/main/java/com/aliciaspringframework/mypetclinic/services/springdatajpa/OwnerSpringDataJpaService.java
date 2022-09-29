package com.aliciaspringframework.mypetclinic.services.springdatajpa;

import com.aliciaspringframework.mypetclinic.models.Owner;
import com.aliciaspringframework.mypetclinic.repositories.OwnerRepository;
import com.aliciaspringframework.mypetclinic.repositories.PetRepository;
import com.aliciaspringframework.mypetclinic.repositories.PetTypeRepository;
import com.aliciaspringframework.mypetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSpringDataJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSpringDataJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                                     PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
//        System.out.println("#####################");
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

}
