/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

/**
 *
 * @author Breiner
 */
public class HorasException extends Exception {

    public HorasException(String no_se_pueden_tener_horas_menor_a_0) {
        super(no_se_pueden_tener_horas_menor_a_0);
    }
    
}
