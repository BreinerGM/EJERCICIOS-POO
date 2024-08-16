/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

/**
 *
 * @author brein
 */
public class Carro extends Vehiculo {
    
    private int numeroDePuertas;
    private boolean aireAcondicionado;
    private int numeroAsiento;

    public Carro(String placa, int modelo, String marca, float cc) {
        super(placa, modelo, marca, cc);
    }

    public Carro(int numeroDePuertas, boolean aireAcondicionado, int numeroAsiento, String placa, int modelo, String marca, float cc) {
        super(placa, modelo, marca, cc);
        this.numeroDePuertas = numeroDePuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.numeroAsiento = numeroAsiento;
    }
   

    @Override
    public String toString() {
        return "Carro: "+ super.toString() + "numeroDePuertas=" + numeroDePuertas + ", aireAcondicionado=" + aireAcondicionado + ", numeroAsiento=" + numeroAsiento;
    }
    
    

    /**
     * @return the numeroDePuertas
     */
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    /**
     * @param numeroDePuertas the numeroDePuertas to set
     */
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    /**
     * @return the aireAcondicionado
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * @param aireAcondicionado the aireAcondicionado to set
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * @return the numeroAsiento
     */
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * @param numeroAsiento the numeroAsiento to set
     */
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String detallesDeVeh() {
        return " ->"+toString();
    }
    
}
