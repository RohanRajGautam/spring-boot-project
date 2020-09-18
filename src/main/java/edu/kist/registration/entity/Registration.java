package edu.kist.registration.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "registration")
@Data
public class Registration implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "registered_by", nullable = false)
    private Integer registeredBy;

    @Column(name = "registration_type_id", nullable = false)
    private Integer registrationTypeId;

    @Column(name = "registration_person_first_name")
    private String registrationPersonFirstName;

    @Column(name = "registration_person_middle_name")
    private String registrationPersonMiddleName;

    @Column(name = "registration_person_last_name")
    private String registrationPersonLastName;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "photo")
    private String photo;

}
