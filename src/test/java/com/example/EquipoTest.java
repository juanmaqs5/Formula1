package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EquipoTest {
    @Test
    void testAgregarYRemoverPiloto() {
        Equipo equipo = new Equipo("Red Bull");
        Piloto piloto = new Piloto("Max Verstappen", "Países Bajos");

        equipo.agregarPiloto(piloto);
        assertEquals(1, equipo.getPilotos().size());
        assertEquals(piloto, equipo.getPilotos().get(0));

        equipo.removerPiloto(piloto);
        assertEquals(0, equipo.getPilotos().size());
    }

    @Test
    void testAgregarYRemoverMecanico() {
        Equipo equipo = new Equipo("McLaren");
        Mecanico mecanico = new Mecanico("Daniel", "Inglaterra");

        equipo.agregarMecanico(mecanico);
        assertEquals(1, equipo.getMecanicos().size());
        assertEquals(mecanico, equipo.getMecanicos().get(0));

        equipo.removerMecanico(mecanico);
        assertEquals(0, equipo.getMecanicos().size());
    }

    @Test
    void testAgregarYRemoverSponsor() {
        Equipo equipo = new Equipo("Aston Martin");
        SponsorContrato contrato = new SponsorContrato(new Sponsor("Coca-Cola"), "Ubicación 1", "2024-01-01", null);

        equipo.agregar(contrato);
        assertEquals(1, equipo.getSponsors().size());
        assertEquals(contrato, equipo.getSponsors().get(0));

        equipo.remover(contrato);
        assertEquals(0, equipo.getSponsors().size());
    }
}
