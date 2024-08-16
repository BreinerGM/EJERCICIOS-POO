/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

/**
 *
 * @author Breiner
 */
class DisponibilidadException extends Exception{
   
    public DisponibilidadException(String el_vehiculo_no_esta_disponible) {
        super(el_vehiculo_no_esta_disponible);
    }
    
}
