package com.example.Imobiliaria.model;
import jakarta.persistence.*;
@Table(name="Clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id_Cliente;
}
