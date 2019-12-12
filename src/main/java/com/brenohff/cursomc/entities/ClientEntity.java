package com.brenohff.cursomc.entities;

import com.brenohff.cursomc.enums.ClientType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "CLIENT")
public class ClientEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String name;
    private String cpfOrCnpj;
    private ClientType clientType;

    @JsonManagedReference
    @OneToMany(mappedBy = "client")
    private List<AddressEntity> addresses = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "PHONES")
    private Set<String> phones = new HashSet<>();

    @OneToMany(mappedBy = "client")
    private List<OrderEntity> orders = new ArrayList<>();
}
