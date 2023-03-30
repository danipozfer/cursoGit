package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/c1")
public class Controlador1 {

    @Autowired
    Herramienta herramienta;

    @GetMapping("/a")
    public String getHola(){
        return "hola mundo";
    }

    @GetMapping("/b")
    public String getHola2(){
        return "prueba 2";
    }

    @GetMapping("/ejemplo/{id}")
    public String ejemplo(@PathVariable String id){
        return "Id: "+id;
    }

    @PostMapping("/addCadena")//http://localhost:8080/addCadena?cadena=jesus
    public String addCadena (@RequestParam String cadena){
        return "la cadena es "+cadena;
    }

    @PostMapping("/persona")//http://localhost:8080/persona
    public Persona persona(@RequestBody Persona persona){
        persona.setEdad(String.valueOf(Integer.parseInt(persona.getEdad())+100));
        return persona;
    }

    @GetMapping("/herramienta/{s}")
    public String devuelveHerramienta(@PathVariable String s){
        return herramienta.getHerramienta(s);

    }

}
