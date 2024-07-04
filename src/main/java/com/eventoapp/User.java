package com.eventoapp;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {

    @NotEmpty(message = "O campo nome não pode estar vazio.")
    @Size(min = 2, max = 100, message = "O nome deve ter no mínimo 2 caractere e no máximo 100.")
    private String nome;

    @NotEmpty(message = "O campo nome não estar vazio.")
    @Email(message = "O campo email precisa estar no formato correcto de email. ex.: nome@dominio.com")
    private String email;

    public @NotEmpty(message = "O campo nome não pode estar vazio.") @Size(min = 2, max = 100, message = "O nome deve ter no mínimo 2 caractere e no máximo 100.") String getNome() {
        return nome;
    }

    public void setNome(@NotEmpty(message = "O campo nome não pode estar vazio.") @Size(min = 2, max = 100, message = "O nome deve ter no mínimo 2 caractere e no máximo 100.") String nome) {
        this.nome = nome;
    }

    public @NotEmpty(message = "O campo nome não estar vazio.") @Email(message = "O campo email precisa estar no formato correcto de email. ex.: nome@dominio.com") String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "O campo nome não estar vazio.") @Email(message = "O campo email precisa estar no formato correcto de email. ex.: nome@dominio.com") String email) {
        this.email = email;
    }
}
