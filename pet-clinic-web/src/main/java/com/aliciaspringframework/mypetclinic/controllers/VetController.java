package com.aliciaspringframework.mypetclinic.controllers;

import com.aliciaspringframework.mypetclinic.model.Vet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";  //path in project folder
    }
}
