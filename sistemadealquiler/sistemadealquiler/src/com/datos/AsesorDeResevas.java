/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

/**
 *
 * @author brein
 */
public class AsesorDeResevas extends Empleado {
    
    private int horasTrabajadas;
    private float comision;

    public AsesorDeResevas(int horasTrabajadas, String nombre, String UID, float salario) {
        super(nombre, UID, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.comision = 0;
    }
    
    
    public AsesorDeResevas(String nombre, String UID, float salario) {
        super(nombre, UID, salario);
    }

    @Override
    public String toString() {
        return "AsesorDeVentas: "+ super.toString() + "horasTrabajadas=" + horasTrabajadas + ", comision=" + comision;
    }
    
    

    /**
     * @return the horasTrabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * @param horasTrabajadas the horasTrabajadas to set
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * @return the comision
     */
    public float getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(float comision) {
        this.comision = comision;
    }
    
    
    
}
