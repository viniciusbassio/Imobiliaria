package com.example.Imobiliaria.model;

import java.sql.Date;

import jakarta.persistence.*;

@Table(name="Contratos")
public class Contratos {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id_Contrato;

    @Column(name="Data_Contrato")
    private Date Data;

    @Column(name ="Data_Vencimento")
    private Date Data_Vencimento;
}
