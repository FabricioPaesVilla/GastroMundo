/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.GastroMundo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

/**
 *
 * @author Casa
 */
@Entity
@Data
public class ModeloCadastro {

    @Column(name = "nome", columnDefinition = "varchar(30)", nullable = false)
    private String nome;
    @Column(name = "senha", columnDefinition = "varchar(100)", nullable = false)
    private String senha;
    @Column(name = "cpf", columnDefinition = "varchar(100)", nullable = false)
    private String cpf;
    
}
