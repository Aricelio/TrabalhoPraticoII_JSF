/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.tads.MeuPrimeiroJSF.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author celio
 */
@Named(value = "testeController")
@SessionScoped
public class Teste implements Serializable {

    private String valor;
    private int operandoA, operandoB, soma;
    
      
    /**
     * Creates a new instance of Teste
     */
    public Teste() {
    }

    public void somar(){
        soma = operandoA + operandoB;
    }
    
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getOperandoA() {
        return operandoA;
    }

    public void setOperandoA(int operandoA) {
        this.operandoA = operandoA;
    }

    public int getOperandoB() {
        return operandoB;
    }

    public void setOperandoB(int operandoB) {
        this.operandoB = operandoB;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
    
    
    
    
    
}
