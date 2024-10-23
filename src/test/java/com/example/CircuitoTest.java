package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CircuitoTest {
    @Test
    void testGettersYSetters() {
        Circuito circuito = new Circuito("Monza", 5.8, 53);

        assertEquals("Monza", circuito.getNombre());
        assertEquals(5.8, circuito.getLongitud());
        assertEquals(53, circuito.getVueltasCantidad());

        circuito.setNombre("Silverstone");
        circuito.setLongitud(5.891);
        circuito.setVueltasCantidad(52);

        assertEquals("Silverstone", circuito.getNombre());
        assertEquals(5.891, circuito.getLongitud());
        assertEquals(52, circuito.getVueltasCantidad());
    }
}
