package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumaDigitosTest {

    @Test
    void calcularTotal() {
        int num=12;
        int actual=sumaDigitos.calcularTotal(num);
        assertEquals(51,actual,"No coinciden los resultados, debería devolver 51");
    }
}