package com.curativa.camunda.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cadastro")
public class CadastroController {
    @PostMapping("consignado")
    public ResponseEntity cadastrarConsignado() {
        return ResponseEntity.ok("Consignado cadastrado com sucesso!");
    }
}
