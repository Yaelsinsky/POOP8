package com.mycompany.poop8;

/**
 *
 * @author poo08alu06
 */
/**
 * La clase POOP8 contiene el método principal `main` para ejecutar el programa.
 * Este programa ilustra el uso de clases y objetos relacionados con polígonos y música.
 * También demuestra el uso de interfaces y enumeraciones.
 */
public class POOP8 {

    /**
     * Método principal del programa. Aquí se crean instancias de diferentes clases,
     * se invocan métodos y se demuestra el polimorfismo y la manipulación de objetos.
     *
     * @param args Los argumentos pasados al programa (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Creación de instancias de diferentes clases relacionadas con polígonos y música.
        Poligono poligono = new Triangulo();
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Flauta flauta = new Flauta();

        // Imprime representaciones de cadena de los objetos Triangulo y Cuadrilatero.
        System.out.println(triangulo);
        System.out.println(cuadrilatero);

        // Establece valores para la base y altura del Triángulo y Cuadrilátero.
        triangulo.setBase(5);
        triangulo.setAlt(3);
        cuadrilatero.setBase(4);
        cuadrilatero.setAlt(6);

        // Imprime las representaciones de cadena actualizadas de Triángulo y Cuadrilátero.
        System.out.println(triangulo);
        System.out.println(cuadrilatero);

        // Calcular y mostrar el área del Triángulo y Cuadrilátero.
        System.out.println("Área del Triángulo: " + triangulo.area());
        System.out.println("Área del Cuadrilátero: " + cuadrilatero.area());

        // Polimorfismo: asigna una nueva instancia de Triangulo a la variable poligono.
        poligono = new Triangulo();
        System.out.println(poligono);

        // Llama al método getPoligono para determinar el tipo de polígono.
        getPoligono(poligono);

        // Polimorfismo: asigna una nueva instancia de Cuadrilatero a la variable poligono.
        poligono = new Cuadrilatero();
        getPoligono(poligono);

        // Muestra el tipo de instrumento de la flauta y el valor de PI y el nombre del primer mes.
        System.out.println(flauta.tipoInstrumento());
        System.out.println(Math.PI);
        System.out.println(Meses.NOMBRE_MESES[Meses.UNO]);
    }

    /**
     * Método que permite determinar el tipo de polígono y lo imprime.
     *
     * @param poligono El polígono del cual se determina el tipo.
     */
    private static void getPoligono(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Es un triángulo");
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("Es un cuadrilátero");
        } else {
            System.out.println("Es un polígono");
        }
    }
}

