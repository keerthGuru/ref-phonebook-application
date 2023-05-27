package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.ContactEntity;
import org.example.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/contact-info-development-project")
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PhoneBookController {

    private PhoneBookService phoneBookService;
//POST: => http://localhost:8080/contact-info-development-project/contact
    @PostMapping("/contact")
    public String saveContactInfo(@RequestBody ContactEntity contactEntity) {
        return phoneBookService.saveContactInfo(contactEntity);
    }

    //GET: => http://localhost:8080/contact-info-development-project/contacts
    @GetMapping("/contacts")
    public List<ContactEntity> getAllContacts() {
        return phoneBookService.getAllContacts();
    }

    //GET: => http://localhost:8080/contact-info-development-project/contact/{id}
    @GetMapping("/contact/{id}")
    public ContactEntity getContactById(@Valid @RequestParam("id") Integer id) {
        return phoneBookService.getContactInfoById(id);
    }

    //PUT: => http://localhost:8080/contact-info-development-project/contact
    @PutMapping("/contact")
    public String updateContactById(@RequestBody ContactEntity contactEntity) {
        return phoneBookService.updateContact(contactEntity);
    }

    //DELETE: => http://localhost:8080/contact-info-development-project/contact/{id}
    @DeleteMapping("/contact/{id}")
    public String delete(@PathVariable Integer id) {
        return phoneBookService.deleteById(id);
    }


}
