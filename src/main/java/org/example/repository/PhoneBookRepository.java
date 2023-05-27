package org.example.repository;

import org.example.model.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneBookRepository extends JpaRepository<ContactEntity, Integer> {

  /*  void createContactInfo(ContactEntity contactEntity);

    Optional<ContactEntity> findById(Integer id);

    List<ContactEntity> findAll(String contactEntity);

    List<ContactEntity> updateContactInfoById(Integer id);

    void deleteById(Integer id);
*/
}
