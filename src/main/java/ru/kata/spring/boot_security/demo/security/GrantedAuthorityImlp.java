package ru.kata.spring.boot_security.demo.security;

import org.springframework.security.core.GrantedAuthority;
import ru.kata.spring.boot_security.demo.models.Role;

public class GrantedAuthorityImlp implements GrantedAuthority {

    public GrantedAuthorityImlp(Role role) {
        this.role = role;
    }

    private final Role role;
    @Override
    public String getAuthority() {
        return role.getName();
    }
}
