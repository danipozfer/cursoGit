package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class HerramientaImple implements Herramienta{


    @Override
    public String getHerramienta(String s) {
        return "esta herramienta es "+s;
    }
}
