package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class Test {

    @org.junit.jupiter.api.Test
    void testSuma() {
        OperacionAritmetica suma = new OperacionAritmetica(new Sumar());
        assertEquals(7, suma.procesar(3, 4));
    }

    @org.junit.jupiter.api.Test
    void testResta() {
        OperacionAritmetica resta = new OperacionAritmetica(new Resta());
        assertEquals(5, resta.procesar(10, 5));
        assertEquals(-2, resta.procesar(5, 10));
    }

    @org.junit.jupiter.api.Test
    void testMultiplicacion() {
        OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(20, multiplicacion.procesar(5, 4));
    }

    @org.junit.jupiter.api.Test
    void testDivision() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
        assertEquals(2, division.procesar(10, 5));
        assertEquals(-3, division.procesar(5, 0));
    }

    @org.junit.jupiter.api.Test
    void testNumerosNegativos() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Sumar());
        assertEquals(-1, operacion.procesar(-3, 4));
        assertEquals(-1, operacion.procesar(3, -4));
        assertEquals(-1, operacion.procesar(-3, -4));
    }

}
