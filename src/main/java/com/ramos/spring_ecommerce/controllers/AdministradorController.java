package com.ramos.spring_ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
   
    @GetMapping("")
    public String home(){
        return "administrador/home";
    }
}
