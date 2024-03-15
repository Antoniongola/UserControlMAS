package com.ngolajr.userscontrol.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilizador {
    private String username;
    private String password;
    private String nomeRequerente;
    private String gabintete;
}