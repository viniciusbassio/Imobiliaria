package com.example.Imobiliaria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Edificio")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long Id_Edificio;
    @Column(name = "Categoria")

    private String Categoria_Edificio;
    @Column(name = "Valor_Aluguel")
    private float Valor_Aluguel;

    @Column(name="Endereco_Edifico")
    private String Endereco_Edificio;

}
