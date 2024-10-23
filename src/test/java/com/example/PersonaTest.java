package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PersonaTest {
    @Test
    void testGettersYSetters() {
        Persona persona = new Piloto("Juan", "Argentina") {}; // Creación de un objeto anónimo de Piloto

        assertEquals("Juan", persona.getNombre());
        assertEquals("Argentina", persona.getNacionalidad());

        persona.setNombre("Pedro");
        persona.setNacionalidad("Chile");

        assertEquals("Pedro", persona.getNombre());
        assertEquals("Chile", persona.getNacionalidad());
    }
}
