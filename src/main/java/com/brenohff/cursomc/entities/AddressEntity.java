package com.brenohff.cursomc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "ADDRESS")
@Entity
public class AddressEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String street;
    private String streetNumber;
    private String zipCode;

    private ClientEntity clientEntity;
}
