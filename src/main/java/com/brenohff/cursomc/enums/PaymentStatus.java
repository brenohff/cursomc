package com.brenohff.cursomc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentStatus {
    PENDING(1, "Pendente"),
    SETTLED(2, "Quitado"),
    CANCELED(3, "Cancelado");

    private int code;
    private String description;

    public static PaymentStatus toEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (PaymentStatus client : PaymentStatus.values()) {
            if (client.code == code) {
                return client;
            }
        }

        throw new IllegalArgumentException("Invalid code: " + code);
    }
}
