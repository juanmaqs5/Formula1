package com.example;

public class SponsorContrato {
    private Sponsor sponsor;
    private String ubicacion;
    private String fechaDesde;
    private String fechaHasta;

    public SponsorContrato(Sponsor sponsor, String ubicacion, String fechaDesde, String fechaHasta) {
        this.sponsor = sponsor;
        this.ubicacion = ubicacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
