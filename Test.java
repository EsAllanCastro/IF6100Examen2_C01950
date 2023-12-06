package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class Test {

    //Prueba con suma
    @org.junit.jupiter.api.Test
    void testSuma() {
        OperacionAritmetica suma = new OperacionAritmetica(new Sumar());
        //Las sumas siempre van a funcionar
        assertEquals(7, suma.procesar(3, 4));
        assertEquals(11, suma.procesar(5, 6));
        //Se hace una suma con un numero negativo
        assertEquals(-1, suma.procesar(-7, 4));
    }

    //Prueba con resta
    @org.junit.jupiter.api.Test
    void testResta() {
        OperacionAritmetica resta = new OperacionAritmetica(new Resta());
        //Se resta un numero mayor a uno menor
        assertEquals(5, resta.procesar(10, 5));
        //Se resta un numero menor a uno mayor
        assertEquals(-2, resta.procesar(5, 10));
        //Se hace una resta con un numero negativo
        assertEquals(-1, resta.procesar(-2, 9));
    }

    //Prueba con multiplicacion
    @org.junit.jupiter.api.Test
    void testMultiplicacion() {
        OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());
        //Una multiplicacion al igual que la suma siempre va a resultar
        assertEquals(20, multiplicacion.procesar(5, 4));
        //Se hace una multiplicacion con un numero negativo
        assertEquals(-1, multiplicacion.procesar(-5, 2));
    }

    //Prueba con division
    @org.junit.jupiter.api.Test
    void testDivision() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
        //Se hace una division comun
        assertEquals(2, division.procesar(10, 5));
        //Se hace una division entre cero
        assertEquals(-3, division.procesar(5, 0));
        //Se hace una division con un numero negativo
        assertEquals(-1, division.procesar(-6, 8));
    }


}
