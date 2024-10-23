package com.example;

import java.util.List;

public interface ISponsoreable {
    List<SponsorContrato> getSponsors();
    void agregar(SponsorContrato contrato);
    void agregar(String sponsor, String ubicacion, String fechaDesde);
    void remover(String sponsor);
    void remover(SponsorContrato contrato);
    void remover(String sponsor, String ubicacion);
    List<SponsorContrato> sponsorsHabilitados();
}
