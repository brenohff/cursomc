package com.brenohff.cursomc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CityEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private StateEntity state;
}
