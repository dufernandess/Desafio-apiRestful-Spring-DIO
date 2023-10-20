package api.project.projectdioapi.repository;

import api.project.projectdioapi.model.Suplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuplierRepository extends JpaRepository<Suplier, Long> {
         boolean existsByDocument (String document);


}

