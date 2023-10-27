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
 * La clase abstracta Poligono es una clase base que representa una figura geométrica poligonal.
 * 
 */
public abstract class Poligono extends Object {

    /**
     * Constructor vacio de la clase abstracta Poligono.
     * 
     */
    public Poligono() {
    }
    
    /**
     * Método abstracto para calcular el área de un polígono.
    
     * @return El área del polígono, cuyo tipo dependerá de la implementación que realizemos..
     */
    public abstract int area();
    
    /**
     * Método abstracto para calcular el perímetro de un polígono.
     
     *
     * @return El perímetro del polígono, cuyo tipo dependerá de la implementación concreta.
     */
    public abstract int perimetro();

    /**
     * Devuelve una representación de cadena de este objeto Poligono.
     *
     * @return Una cadena que representa el objeto Poligono.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}

