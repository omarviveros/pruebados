
package com.example.pruebanube.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laprueba")
public class Pruebas {
    
    @GetMapping("/seve")
    public String metodoPrueba(){
        return "Hola si jalo yes";
    }
}
