package com.mycompany.poop8;

/**
 *
 * @author Urbano Meza Joseph Gael
 */
/**
 * implementa los métodos definidos en la clase
 * Poligono para calcular el área y el perímetro del cuadrilátero.
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta, gama; // Ángulos internos del cuadrilátero
    private int a, b, c; // Longitudes de los lados del cuadrilátero
    private int base, alt; // Base y altura del cuadrilátero
    
    /**
     * Constructor vacio de la clase Cuadrilatero.
     * 
     */
    public Cuadrilatero() {   
    }

    /**
     * Constructor lleno de la clase Cuadrilatero.
     * Crea un nuevo objeto Cuadrilatero con los valores proporcionados para los ángulos,
     * lados, base y altura del cuadrilátero.
     *
     * @param alfa Ángulo interno del cuadrilátero.
     * @param beta Ángulo interno del cuadrilátero.
     * @param gama Ángulo interno del cuadrilátero.
     * @param a Longitud del lado del cuadrilátero.
     * @param b Longitud del lado del cuadrilátero.
     * @param c Longitud del lado del cuadrilátero.
     * @param base Longitud de la base del cuadrilátero.
     * @param alt Longitud de la altura del cuadrilátero.
     */
    public Cuadrilatero(int alfa, int beta, int gama, int a, int b, int c, int base, int alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }

    /**
     * Obtiene el valor del ángulo interno alfa del cuadrilátero.
     *
     * @return El valor del ángulo alfa.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Establece el valor del ángulo interno alfa del cuadrilátero.
     *
     * @param alfa El valor del ángulo alfa a establecer.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    // Métodos getter y setter para beta, gama, a, b, c, base y alt se escribirían de manera similar.

    /**
     * Calcula el área del cuadrilátero.
     *
     * @return El área del cuadrilátero calculada usando su base y altura.
     */
    @Override
    public int area(){
        return (int)(base * alt / 2);
    }
    
    /**
     * Calcula el perímetro del cuadrilátero.
     *
     * @return El perímetro del cuadrilátero calculado sumando las longitudes de sus lados.
     */
    @Override
    public int perimetro(){
        return (int)(a + b + c);
    }
    
    /**
     * Devuelve una representación de cadena de este objeto Cuadrilatero.
     *
     * @return Una cadena que representa el objeto Cuadrilatero, incluyendo sus atributos.
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }

    void setBase(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setAlt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
