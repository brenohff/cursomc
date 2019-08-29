package com.brenohff.cursomc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClientType {
    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private int code;
    private String description;

    public static ClientType toEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (ClientType client : ClientType.values()) {
            if (client.code == code) {
                return client;
            }
        }

        throw new IllegalArgumentException("Invalid code: " + code);
    }
}
