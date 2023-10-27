/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop8;

/**
 *
 * @author Urbano Meza Joseph Gael
 */
/**
 */
public class Flauta extends InstrumentoViento {

    /**
     * Obtiene el tipo de este instrumento flauta.
     *
     * @return Una cadena que representa el tipo del instrumento (en este caso, "Flauta").
     */
    @Override
    public String tipoInstrumento() {
        return "Flauta";
    }

    /**
     * Devuelve una representación de cadena de del objeto Flauta.
     *
     * @return Una cadena que representa el objeto Flauta.
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }   
}

