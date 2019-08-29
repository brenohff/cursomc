package com.brenohff.cursomc.entities;

import com.brenohff.cursomc.enums.ClientType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table(name = "CLIENT")
@Entity
public class ClientEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String name;
    private String cpf;
    private ClientType clientType;

    private List<AddressEntity> addresses;
    private Set<String> phones = new HashSet<>();
}
