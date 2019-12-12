package com.brenohff.cursomc.entities;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class CardPaymentEntity extends PaymentEntity{

    private Integer numberOfInstallments;

}
