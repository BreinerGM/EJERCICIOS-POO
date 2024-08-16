/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

/**
 *
 * @author brein
 */
public abstract class Vehiculo {
    private String placa;
    private int modelo;
    private String marca;
    private boolean ocupado;
    private float cc;

    public Vehiculo(String placa, int modelo, String marca, float cc) throws ModeloException {
        this.placa = placa;
        this.modelo = modelo;
        if(modelo <1905){
            throw new ModeloException("No se puede tener un modelo menor a 1905");
        }
        this.marca = marca;
        this.ocupado = false;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", ocupado=" + ocupado + ", cc=" + cc + '}';
    }

    public abstract String detallesDeVeh();
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado the ocupado to set
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    /**
     * @return the cc
     */
    public float getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(float cc) {
        this.cc = cc;
    }

}
