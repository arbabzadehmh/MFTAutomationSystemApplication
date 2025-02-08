package com.mftplus.mftautomationsystemapplication.correspondence.controller.api;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Paraph;
import com.mftplus.mftautomationsystemapplication.correspondence.service.ParaphService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/paraphs")
public class ParaphApi {

    private final ParaphService paraphService;

    public ParaphApi(ParaphService paraphService) {
        this.paraphService = paraphService;
    }

    @GetMapping
    public Object findAllParaphs() {
        return paraphService.findAll();
    }

    @GetMapping("/{id}")
    public Object findParaphById(@PathVariable Long id) {
        return paraphService.findById(id);
    }

    @PostMapping
    public void addParaph(@RequestBody Paraph paraph) {
        paraphService.save(paraph);
    }

    @PutMapping
    public void updateParaph(@RequestBody Paraph paraph) {
        paraphService.update(paraph);
    }

    @DeleteMapping("/{id}")
    public void deleteParaph(@PathVariable Long id) {
        paraphService.delete(id);
    }
}
