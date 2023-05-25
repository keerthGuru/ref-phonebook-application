package org.example.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.ContactEntity;
import org.example.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PhoneBookServiceImpl implements PhoneBookService {

    @Autowired
    private PhoneBookRepository phoneBookRepository;

    @Override
    public String saveContactInfo(ContactEntity contactEntity) {
        contactEntity = phoneBookRepository.save(contactEntity);
        if (contactEntity.getId() != null) {
            return "Contact Saved";
        } else {
            return "Contact Failed To Save";
        }
    }

    @Override
    public List<ContactEntity> getAllContacts() {
        return phoneBookRepository.findAll();
    }

    @Override
    public ContactEntity getContactInfoById(Integer id) {
        Optional<ContactEntity> findById;
        findById = phoneBookRepository.findById(id);
        return findById.orElse(null);
    }

    @Override
    public String updateContact(ContactEntity contactEntity) {
        if (phoneBookRepository.existsById(contactEntity.getId())) {
            phoneBookRepository.save(contactEntity);
            return "Saved success";
        } else
            return "No Record Found";
    }

    @Override
    public String deleteById(Integer id) {
        if (phoneBookRepository.existsById(id)) {
            phoneBookRepository.deleteById(id);
            return "Deleted Record success";
        } else
            return "No Record Found";
    }
}
