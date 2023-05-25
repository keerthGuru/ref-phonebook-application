package org.example.repository;


import org.example.model.ContactEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PhoneBookRepository extends MongoRepository<ContactEntity, Integer> {

    void createContactInfo(ContactEntity contactEntity);

    Optional<ContactEntity> findById(Integer id);

    List<ContactEntity> findAll(String contactEntity);

    List<ContactEntity> updateContactInfoById(Integer id);

    void deleteById(Integer id);

}
