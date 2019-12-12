package com.brenohff.cursomc.entities;

import com.brenohff.cursomc.enums.PaymentStatus;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PAYMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class PaymentEntity implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    private PaymentStatus status;

    @OneToOne
    @JoinColumn(name = "order_id")
    @MapsId
    private OrderEntity order;
}
