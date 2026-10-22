package br.com.sp.awsmodelo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class MvcModeloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
