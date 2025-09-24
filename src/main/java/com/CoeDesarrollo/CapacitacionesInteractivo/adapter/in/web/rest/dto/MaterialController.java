
package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.in.web.rest.dto;

import org.springframework.web.bind.annotation.*;

import com.CoeDesarrollo.CapacitacionesInteractivo.application.service.MaterialService;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Material;

import java.util.List;

@RestController
@RequestMapping("/api/materiales")
public class MaterialController {
    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping
    public List<Material> getAllProgreso() {
        return materialService.getAllMaterial();
    }

    @GetMapping("/{id}")
    public Material getMaterialById(@PathVariable String id) {
        return materialService.getMaterialById(id);
    }

    @PostMapping
    public Material createMaterial(@RequestBody Material material) {
        return materialService.createMaterial(material);
    }

    @PutMapping("/{id}")
    public Material updateMaterial(@PathVariable String id, @RequestBody Material material) {
        return materialService.updateMaterial(id, material);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable String id) {
    	materialService.deleteMaterial(id);
    }
}