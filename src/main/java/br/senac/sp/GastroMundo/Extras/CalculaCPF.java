/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.GastroMundo.Extras;

/**
 *
 * @author Casa
 */
public class CalculaCPF {
    
    
    public boolean validarCPF(String cpf) {
         // O comando replaceALL remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) return false;

        // Cálculo do primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            // getNumericValue traz o cpf como um int para poder verificar como um valor de conta
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int resto = soma % 11;
        int primeiroDigito = (resto < 2) ? 0 : 11 - resto;

        // Cálculo do segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        soma += primeiroDigito * 2;
        resto = soma % 11;
        int segundoDigito = (resto < 2) ? 0 : 11 - resto;

        // Verifica se os dígitos calculados correspondem aos do CPF
        return primeiroDigito == Character.getNumericValue(cpf.charAt(9)) &&
               segundoDigito == Character.getNumericValue(cpf.charAt(10));
    }
    
}
