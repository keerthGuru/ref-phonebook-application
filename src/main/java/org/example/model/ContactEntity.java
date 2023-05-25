package org.example.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
public class ContactEntity {

    @Id
    @GeneratedValue
    Integer id;
    String name;
    String email;
    Long phoneNo;
}
