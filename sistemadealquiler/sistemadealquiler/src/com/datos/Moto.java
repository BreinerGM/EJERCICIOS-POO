/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

/**
 *
 * @author brein
 */
public class Moto extends Vehiculo {
    
    float capacidadDelTanque;
    String tipo;

    public Moto(String placa, int modelo, String marca, float cc) {
        super(placa, modelo, marca, cc);
    }

    public Moto(float capacidadDelTanque, String tipo, String placa, int modelo, String marca, float cc) {
        super(placa, modelo, marca, cc);
        this.capacidadDelTanque = capacidadDelTanque;
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return "Moto : "+ super.toString() + "capacidadDelTanque=" + capacidadDelTanque + ", tipo=" + tipo;
    }
   

    public float getCapacidadDelTanque() {
        return capacidadDelTanque;
    }

    public void setCapacidadDelTanque(float capacidadDelTanque) {
        this.capacidadDelTanque = capacidadDelTanque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String detallesDeVeh() {
        return " -> "+toString();
    }
    
    
}
