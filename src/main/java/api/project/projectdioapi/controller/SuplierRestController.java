package api.project.projectdioapi.controller;

import api.project.projectdioapi.model.Suplier;
import api.project.projectdioapi.service.SuplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("suplier")
public class SuplierRestController {
    @Autowired
    private SuplierService suplierService;

    @GetMapping
    public ResponseEntity<Iterable<Suplier>> findAll() {
        return ResponseEntity.ok(suplierService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Suplier> findById(@PathVariable Long id) {
        return ResponseEntity.ok(suplierService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Suplier> create(@RequestBody Suplier suplier) {
        suplierService.create(suplier);
        return ResponseEntity.ok(suplier);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Suplier> uptade(@PathVariable Long id, @RequestBody Suplier suplier) {
        suplierService.uptade(id, suplier);
        return ResponseEntity.ok(suplier);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        suplierService.delete(id);
        return ResponseEntity.ok().build();
    }
}
