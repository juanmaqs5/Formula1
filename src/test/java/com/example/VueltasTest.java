package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VueltasTest {
    private Piloto piloto;
    private Equipo equipo;
    private Circuito circuito;
    private Vueltas vuelta;

    @BeforeEach
    public void setUp() {
        piloto = new Piloto("Juan", "Argentina");
        equipo = new Equipo("Equipo A");
        circuito = new Circuito("Circuito A", 5.0, 10);
        vuelta = new Vueltas(piloto, equipo, circuito, 90.5); // Crear la instancia de Vueltas
    }

    @Test
    public void testGetPiloto() {
        assertEquals(piloto, vuelta.getPiloto());
    }

    @Test
    public void testGetEquipo() {
        assertEquals(equipo, vuelta.getEquipo());
    }

    @Test
    public void testGetCircuito() {
        assertEquals(circuito, vuelta.getCircuito());
    }

    @Test
    public void testGetTiempo() {
        assertEquals(90.5, vuelta.getTiempo());
    }

    @Test
    public void testSetTiempo() {
        vuelta.setTiempo(85.0); // Cambiar el tiempo a un valor válido
        assertEquals(85.0, vuelta.getTiempo());
    }

    @Test
    public void testSetTiempoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            vuelta.setTiempo(-10.0); // Probar con un tiempo negativo
        });
        assertEquals("El tiempo debe ser mayor que cero.", exception.getMessage());
    }
}
