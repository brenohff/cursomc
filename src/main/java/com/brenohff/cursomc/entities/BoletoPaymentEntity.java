package com.brenohff.cursomc.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class BoletoPaymentEntity extends PaymentEntity {

    private Date expirateDate;
    private Date paymentDate;

}
