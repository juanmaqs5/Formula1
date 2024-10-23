package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class CarreraTest {
    @Test
    public void testCarreraCreacion() {
        Circuito circuito = new Circuito("Monaco", 3.34, 78);
        Carrera carrera = new Carrera("2024-05-29", circuito);
        assertNotNull(carrera);
    }

    @Test
    public void testCircuitoNoNulo() {
        Circuito circuito = new Circuito("Monaco", 3.34, 78);
        Carrera carrera = new Carrera("2024-05-29", circuito);
        assertNotNull(circuito);
    }
}
