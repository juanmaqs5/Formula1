package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PilotoTest {
    @Test
    void testRegistrarYObtenerVueltas() {
        Piloto piloto = new Piloto("Lewis Hamilton", "Reino Unido");
        Circuito circuito = new Circuito("Silverstone", 5.891, 52);
        Equipo equipo = new Equipo("Mercedes");
        Vueltas vuelta = new Vueltas(piloto, equipo, circuito, 1.32);

        piloto.registrarVuelta(vuelta);
        assertEquals(1, piloto.getVueltas().size());
        assertEquals(vuelta, piloto.getVueltas().get(0));
    }
}
