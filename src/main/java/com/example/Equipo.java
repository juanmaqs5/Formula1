package com.example;

import java.util.ArrayList;
import java.util.List;

public class Equipo implements ISponsoreable {
    private String nombre;
    private List<Piloto> pilotos = new ArrayList<>();
    private List<Mecanico> mecanicos = new ArrayList<>();
    private Ingeniero ingenieroPrincipal;
    private List<SponsorContrato> sponsors = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public List<SponsorContrato> getSponsors() {
        return sponsors;
    }

    @Override
    public void agregar(SponsorContrato contrato) {
        sponsors.add(contrato);
    }

    @Override
    public void agregar(String sponsor, String ubicacion, String fechaDesde) {
        sponsors.add(new SponsorContrato(new Sponsor(sponsor), ubicacion, fechaDesde, null));
    }

    @Override
    public void remover(String sponsor) {
        sponsors.removeIf(c -> c.getSponsor().getNombre().equals(sponsor));
    }

    @Override
    public void remover(SponsorContrato contrato) {
        sponsors.remove(contrato);
    }

    @Override
    public void remover(String sponsor, String ubicacion) {
        sponsors.removeIf(c -> c.getSponsor().getNombre().equals(sponsor) && c.getUbicacion().equals(ubicacion));
    }

    @Override
    public List<SponsorContrato> sponsorsHabilitados() {
        return sponsors;
    }

    // Métodos para gestionar pilotos
    public void agregarPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

    public void removerPiloto(Piloto piloto) {
        pilotos.remove(piloto);
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    // Métodos para gestionar mecánicos
    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    public void removerMecanico(Mecanico mecanico) {
        mecanicos.remove(mecanico);
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    // Métodos para gestionar el ingeniero principal
    public void setIngenieroPrincipal(Ingeniero ingenieroPrincipal) {
        this.ingenieroPrincipal = ingenieroPrincipal;
    }

    public Ingeniero getIngenieroPrincipal() {
        return ingenieroPrincipal;
    }
}
