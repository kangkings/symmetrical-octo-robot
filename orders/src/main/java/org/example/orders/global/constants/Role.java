package org.example.orders.global.constants;


import lombok.Getter;

@Getter
public enum Role {
    ROLE_USER("ROLE_USER"),
    ROLE_COMPANY("ROLE_COMPANY");

    private final String role;

    Role(String role) {
        this.role = role;
    }
}
