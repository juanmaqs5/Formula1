package com.example;

import java.util.ArrayList;
import java.util.List;

public class Piloto extends Persona {
    private List<Vueltas> vueltas;

    public Piloto(String nombre, String nacionalidad) {
        super(nombre, nacionalidad);
        this.vueltas = new ArrayList<>();
    }

    // Método para registrar vuelta
    public void registrarVuelta(Vueltas vuelta) {
        vueltas.add(vuelta);
    }

    // Método para obtener todas las vueltas registradas
    public List<Vueltas> getVueltas() {
        return vueltas;
    }
}
