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
public class ModeloCarrinho {
    @Column(name = "id", columnDefinition = "varchar(50)", nullable = false)
    private String id;
    @Column(name = "prato", columnDefinition = "varchar(30)", nullable = false)
    private String prato;
    @Column(name = "qtd", columnDefinition = "int(30)", nullable = false)
    private double qtd;
    @Column(name = "valor", columnDefinition = "varchar(30)", nullable = false)
    private double valor;
}
