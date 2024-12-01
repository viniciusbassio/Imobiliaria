package com.example.Imobiliaria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.Imobiliaria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findybyNomeClienteModel(String name);


    @Query(value = "Select * from Clientes where Nome_Cliente = name",nativeQuery=true)
    Cliente FindById(long Id_Cliente);
}