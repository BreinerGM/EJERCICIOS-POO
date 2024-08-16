/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

import java.util.ArrayList;

/**
 *
 * @author brein
 */
public class TiendaDeAlquiler {
    
    private String nombre;
    private String eslogan;
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Reserva> reservas;

    public TiendaDeAlquiler(String nombre, String eslogan, ArrayList<Cliente> clientes, ArrayList<Empleado> empleados, ArrayList<Vehiculo> vehiculos, ArrayList<Reserva> reservas) {
        this.nombre = nombre;
        this.eslogan = eslogan;
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "TiendaDeAlquiler{" + "nombre=" + getNombre() + ", eslogan=" + getEslogan() + ", clientes=" + getClientes() + ", empleados=" + getEmpleados() + ", vehiculos=" + getVehiculos() + '}';
    }
    
    public void addCarro(Carro carro){
        vehiculos.add(carro);
    }
    
    public void addMoto(Moto moto){
        vehiculos.add(moto);
    }
    
    
    public boolean reservarCarro(int horas, Cliente cliente, AsesorDeResevas asesorDeResevas, Carro carro){
     
        if(carro.isOcupado()){
            return false;
        }else{
            Reserva reserva = new Reserva(carro, asesorDeResevas, cliente, horas);
            carro.setOcupado(true);
            reservas.add(reserva);
            return true;
        }

    }
    
    public boolean reservarMoto(int horas, Cliente cliente, AsesorDeResevas asesorDeResevas, Moto moto){
        if(moto.isOcupado()){
            return false;
        }else{
            Reserva reserva = new Reserva(moto, asesorDeResevas, cliente, horas);
            moto.setOcupado(true);
            reservas.add(reserva);
            return true;
        }
    }
    
    public String listarVehiculosDisponibles(){
        String list = "";
        for (Vehiculo veh : vehiculos) {
            if(veh.isOcupado()==false && veh instanceof Carro){
                Carro carro = (Carro) veh;
                list+=" "+carro.detallesDeVeh();
            }else if(veh.isOcupado()==false && veh instanceof Moto){
                Moto moto = (Moto) veh;
                list+=" "+moto.detallesDeVeh();
            }
        }
        return list;
    }
   

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the eslogan
     */
    public String getEslogan() {
        return eslogan;
    }

    /**
     * @param eslogan the eslogan to set
     */
    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the empleados
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * @return the vehiculos
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * @param vehiculos the vehiculos to set
     */
    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * @return the reservas
     */
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    /**
     * @param reservas the reservas to set
     */
    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
}
