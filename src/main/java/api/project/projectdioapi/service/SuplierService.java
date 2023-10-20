package api.project.projectdioapi.service;

import api.project.projectdioapi.model.Suplier;

public interface SuplierService {
    Iterable<Suplier> findAll();

    Suplier findById(Long id);

    Suplier create(Suplier suplier);

    Suplier uptade(Long id, Suplier suplier);

    void delete(Long id);
}
