/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop8;

/**
 *
 * @author poo08alu06
 */
/**
 * La interfaz InstrumentoMusical representa un contrato para todos los instrumentos
 * musicales. 
 */
public interface InstrumentoMusical {
    
    /**
     * Método para tocar el instrumento musical. 
    void tocar();
    
    /**
     * Método para afinar el instrumento musical. 
     */
    void afinar();
    
    /**
     * Método que devuelve el tipo de instrumento.
     *
     * @return Una cadena que representa el tipo del instrumento (por ejemplo, "Piano", "Guitarra").
     */
    String tipoInstrumento();
}

