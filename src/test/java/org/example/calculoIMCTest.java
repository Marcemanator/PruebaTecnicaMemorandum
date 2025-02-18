package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculoIMCTest {

    @Test
    void calculoIMC() {
        double peso=78;
        double altura=1.80;
        String resultado= calculoIMC.CalculoIMC(peso,altura);
        assertEquals("Estás en peso normal",resultado,"Debería devolver Estás peso normal");
    }
}