package com.example.Imobiliaria.model;
import jakarta.persistence.*;;

    @Entity 
    @Table(name = "Cidades")

public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id_Cidade;

    @Column(name = "CEP")
    private int CEP;

    @Column(name = "Nome_Cidade")
    private String NomeCidadeModel;

    @Column(name = "UF")
    private String UF;
    public int getCep(){
        return CEP;
    }

}
