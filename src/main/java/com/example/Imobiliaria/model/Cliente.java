package com.example.Imobiliaria.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Cliente;

    private String name;
    private String phone;
    private String city;
    private String gender;
    public Long getId() {
        return id_Cliente;
    }

    public void setId(Long id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    // Getter e Setter para 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter e Setter para 'phone'
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter e Setter para 'city'
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter e Setter para 'gender'
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

