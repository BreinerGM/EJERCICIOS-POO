/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

/**
 *
 * @author brein
 */
public class Gerente extends Empleado {
    
    private int numeroDepersonalACargo;
    
    
    public Gerente(String nombre, String UID, float salario) {
        super(nombre, UID, salario);
    }

    public Gerente(int numeroDepersonalACargo, String nombre, String UID, float salario) {
        super(nombre, UID, salario);
        this.numeroDepersonalACargo = numeroDepersonalACargo;
    }

    @Override
    public String toString() {
        return "Gerente : "+ super.toString() + "numeroDepersonalACargo=" + getNumeroDepersonalACargo();
    }

    public int getNumeroDepersonalACargo() {
        return numeroDepersonalACargo;
    }

    public void setNumeroDepersonalACargo(int numeroDepersonalACargo) {
        this.numeroDepersonalACargo = numeroDepersonalACargo;
    }
    
}
