package com.example.Imobiliaria.model;
import jakarta.persistence.*;



@Table(name= "Proprietario")
public class Proprietarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_proprietario;

    @Column(name="Nome_Proprietario")
    private String Nome_Proprietario;
    @Column(name = "Telefone_Proprietario" )
    private int Telefone;

    @Column(name="Endereco_Proprietario")
    private String Endereco_Proprietario;
}
