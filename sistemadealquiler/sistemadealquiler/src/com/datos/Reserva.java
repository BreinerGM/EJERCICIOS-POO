/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

/**
 *
 * @author brein
 */
public class Reserva implements Descuento {
    
    private Vehiculo vehiculo;
    private AsesorDeResevas asesor;
    private Cliente cliente;
    private float horas;
    private float valor;

    public Reserva(Vehiculo vehiculo, AsesorDeResevas asesor, Cliente cliente, float horas) throws HorasException {
        this.vehiculo = vehiculo;
        this.asesor = asesor;
        this.cliente = cliente;
        this.horas = horas;
        if(horas < 0){
            throw new HorasException("No se pueden tener horas menor a 0");
        }
        this.valor = costoAlquiler();
    }
    
    
    public float valorVehiculoXHora(){
        if(vehiculo instanceof Moto && vehiculo.getCc()>=100){
            return 15;
        }else if(vehiculo instanceof Moto && vehiculo.getCc()>=150){
            return 20;
        }
        
        if(vehiculo instanceof Carro && vehiculo.getCc()>100){
            return 30;
        }else if(vehiculo instanceof Carro && vehiculo.getCc()>=150){
            return 40;
        }
        
        return 0;
        
    }
    
    public float costoAlquiler(){
        return valorVehiculoXHora()*this.horas;
    }
    
    
    
        @Override
    public float comisionAsesor() {
        float comi = costoAlquiler()*0.10f;
        asesor.setComision(comi);
        return comi;
    }

    @Override
    public float descuentoNacionalidad() {
       float desc = 0;
       if(cliente.getNacionalidad().equalsIgnoreCase("COLOMBIANA")){
           desc = this.valor*0.10f;
           this.valor = this.valor-desc;
       }
       return desc;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the asesor
     */
    public AsesorDeResevas getAsesor() {
        return asesor;
    }

    /**
     * @param asesor the asesor to set
     */
    public void setAsesor(AsesorDeResevas asesor) {
        this.asesor = asesor;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the horas
     */
    public float getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(float horas) {
        this.horas = horas;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }


   
    
}
