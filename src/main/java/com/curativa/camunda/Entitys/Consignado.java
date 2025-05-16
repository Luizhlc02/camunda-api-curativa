package com.curativa.camunda.Entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consignado {
    private String nome;
    private String email;
    private String telefone;
}
