package com.example;

public class Vueltas {
    private Piloto piloto;
    private Equipo equipo;
    private Circuito circuito;
    private double tiempo;

    public Vueltas(Piloto piloto, Equipo equipo, Circuito circuito, double tiempo) {
        if (tiempo <= 0) {
            throw new IllegalArgumentException("El tiempo debe ser mayor que cero.");
        }
        this.piloto = piloto;
        this.equipo = equipo;
        this.circuito = circuito;
        this.tiempo = tiempo;
    }

    // Getters
    public Piloto getPiloto() {
        return piloto;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public double getTiempo() {
        return tiempo;
    }

    // Setters
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public void setTiempo(double tiempo) {
        if (tiempo <= 0) {
            throw new IllegalArgumentException("El tiempo debe ser mayor que cero.");
        }
        this.tiempo = tiempo;
    }
}
