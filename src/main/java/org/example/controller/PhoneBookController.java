package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.ContactEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/contact-info-development-project/functionalSpecification")
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PhoneBookController {

    @PostMapping(value = "contact/initiation")
    public String saveContactInfo(@RequestBody ContactEntity contactEntity){
        return null;
    }
}
