package com.CoeDesarrollo.CapacitacionesInteractivo.application.service;

import org.springframework.stereotype.Service;

import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.MaterialRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Material;

import java.util.List;

@Service
public class MaterialService {
    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> getAllMaterial() {
        return materialRepository.findAll();
    }

    public Material getMaterialById(String id) {
        return materialRepository.findById(id).orElse(null);
    }

    public Material createMaterial(Material material) {
        return materialRepository.save(material);
    }

    public Material updateMaterial(String id, Material material) {
        return materialRepository.save(material);
    }

    public void deleteMaterial(String id) {
    	materialRepository.deleteById(id);
    }
}