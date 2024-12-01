package com.example.Imobiliaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Imobiliaria.repository.ClienteRepository;

@RestController
public class homeController {

        @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/")
    public ModelAndView RotaPrincipal() {
        ModelAndView mv = new ModelAndView("Inicio.html");/* Quando for chamar a rota precisa do tipo do arquivo */
        return mv;
    }

    @GetMapping("/Alugar")
    public ModelAndView RotaAluguel() {
        ModelAndView mv = new ModelAndView("Alugar.html");/* Quando for chamar a rota precisa do tipo do arquivo */
        return mv;
    }

    @GetMapping("/Apartamento")
    public ModelAndView RotaApartamento() {
        ModelAndView mv = new ModelAndView("Apartamento.html");
        return mv;
    }

    @GetMapping("/Casa")
    public ModelAndView listarEdificios() {
        ModelAndView mv = new ModelAndView("Casa.html");
        return mv;
    }

    @GetMapping("/Kitnet")
    public ModelAndView RotaKitnet() {
        ModelAndView mv = new ModelAndView("Kitnet.html");/* Quando for chamar a rota precisa do tipo do arquivo */
        return mv;
    }

    @GetMapping("/Inicio")
    public ModelAndView Rotainicio(){
        ModelAndView mv = new ModelAndView("Inicio.html");
        return mv;
    }

    @GetMapping("/Sobre")
    public ModelAndView RotaSobreNos(){
        ModelAndView mv = new ModelAndView("Sobre.html");
        return mv;
    }
    @GetMapping("/Comprar")
    public ModelAndView Rota_Comprar(){
        ModelAndView mv = new ModelAndView("Comprar.html");
        return mv;
    }

    @GetMapping("/Login")
    public ModelAndView Rota_Login(){
        ModelAndView mv = new ModelAndView("Login.html");
        return mv;
    }

    @PostMapping("/Edificio")
    public ModelAndView adicionarEdificio(@RequestParam("Categoria") String categoria,
            @RequestParam("Valor_Aluguel") Double valorAluguel,
            @RequestParam("Endereco_Edificio") String enderecoEdificio) {

        ModelAndView mv = new ModelAndView("ConfirmacaoEdificio.html");
        mv.addObject("categoria", categoria);
        mv.addObject("valorAluguel", valorAluguel);
        mv.addObject("enderecoEdificio", enderecoEdificio);
        return mv;
    }

    @GetMapping("/Proprietario")
    public ModelAndView listarProprietarios() {
        ModelAndView mv = new ModelAndView("Proprietario.html");
        return mv;
    }

    @PostMapping("/Proprietario")
    public ModelAndView adicionarProprietario(@RequestParam("Nome_Proprietario") String nomeProprietario,
            @RequestParam("Endereco_Proprietario") String enderecoProprietario,
            @RequestParam("Telefone") String telefone) {

        ModelAndView mv = new ModelAndView("ConfirmacaoProprietario.html");
        mv.addObject("nomeProprietario", nomeProprietario);
        mv.addObject("enderecoProprietario", enderecoProprietario);
        mv.addObject("telefone", telefone);
        return mv;
    }

    @GetMapping("/Contrato")
    public ModelAndView listarContratos() {
        ModelAndView mv = new ModelAndView("Contrato.html");
        return mv;
    }

    @PostMapping("/Contrato")
    public ModelAndView adicionarContrato(@RequestParam("id_Contrato") Long idContrato,
            @RequestParam("Data") String data) {
        // Lógica para salvar contrato
        ModelAndView mv = new ModelAndView("ConfirmacaoContrato.html");
        mv.addObject("idContrato", idContrato);
        mv.addObject("data", data);
        return mv;
    }

    @GetMapping("/Cliente")
    public ModelAndView listarClientes() {
        ModelAndView mv = new ModelAndView("Cliente.html");
        return mv;
    }

    @PostMapping("/Cliente")
    public ModelAndView adicionarCliente(@RequestParam("nomeCliente") String nomeCliente,
            @RequestParam("email") String email,
            @RequestParam("telefone") String telefone) {
        // Lógica para salvar cliente
        ModelAndView mv = new ModelAndView("ConfirmacaoCliente.html");
        mv.addObject("nomeCliente", nomeCliente);
        mv.addObject("email", email);
        mv.addObject("telefone", telefone);
        return mv;
    }
    

}
