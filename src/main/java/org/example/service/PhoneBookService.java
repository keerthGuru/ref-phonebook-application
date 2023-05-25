package org.example.service;

import org.example.model.ContactEntity;

import java.util.List;

public interface PhoneBookService {

    public String saveContactInfo(ContactEntity contactEntity);

    public List<ContactEntity> getAllContacts();

    public ContactEntity getContactInfoById(Integer id);

    public String updateContact(ContactEntity contactEntity);
    public String deleteById(Integer id);
}
