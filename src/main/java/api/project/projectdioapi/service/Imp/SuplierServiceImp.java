package api.project.projectdioapi.service.Imp;

import api.project.projectdioapi.model.Suplier;
import api.project.projectdioapi.repository.SuplierRepository;
import api.project.projectdioapi.service.SuplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SuplierServiceImp implements SuplierService {

    private final SuplierRepository suplierRepository;

    public SuplierServiceImp(SuplierRepository suplierRepository) {
        this.suplierRepository = suplierRepository;
    }

    @Override
    public Iterable<Suplier> findAll() {
        return suplierRepository.findAll();
    }

    @Override
    public Suplier findById(Long id) {
        Optional<Suplier> suplier = suplierRepository.findById(id);
        if (suplier.isPresent()) {
            return suplier.get();
        } else {
            throw new IllegalArgumentException("This Suplier is not exists.");
        }
    }

    @Override
    public Suplier create(Suplier suplierToCreate) {
        if (suplierRepository.existsByDocument(suplierToCreate.getDocument())){
        throw new IllegalArgumentException("This Suplier already exists.");
        }
        return suplierRepository.save(suplierToCreate);
    }

    @Override
    public Suplier uptade(Long id, Suplier suplierUpdate) {
        Optional<Suplier> suplierUpd = suplierRepository.findById(id);
        if (suplierUpd.isPresent()) {
            return suplierRepository.save(suplierUpdate);
        } else {
            throw new IllegalArgumentException("This Suplier is not exists.");
        }
    }
    @Override
    public void delete(Long id) {
        Optional<Suplier> suplierdlt = suplierRepository.findById(id);
        Suplier dbSuplier = this.findById(id);
        this.suplierRepository.delete(dbSuplier);
    }
}