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
 * La clase InstrumentoViento representa un instrumento musical de viento.
 * Esta clase implementa la interfaz InstrumentoMusical, proporcionando
 * implementaciones para los métodos definidos en esa interfaz.
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

    /**
     * Constructor por defecto de la clase InstrumentoViento.
     * Crea un nuevo objeto InstrumentoViento.
     */
    public InstrumentoViento() {
    }

    /**
     * Obtiene el tipo de este instrumento musical.
     *
     * @return Una cadena que representa el tipo del instrumento (en este caso, "InstrumentoViento").
     */
    @Override
    public String tipoInstrumento() {
        return "InstrumentoViento";
    }

    /**
     * Método para tocar el instrumento de viento.
     * Imprime un mensaje indicando que se está tocando el instrumento de viento.
     */
    public void tocar() {
        System.out.println("Tocar instrumento de viento");
    }

    /**
     * Método para afinar el instrumento de viento.
     * Imprime un mensaje indicando que se está afinando el instrumento de viento.
     */
    @Override
    public void afinar() {
        System.out.println("Afinar instrumento de viento");
    }

    /**
     * Devuelve una representación de cadena de este objeto InstrumentoViento.
     *
     * @return Una cadena que representa el objeto InstrumentoViento.
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
}
