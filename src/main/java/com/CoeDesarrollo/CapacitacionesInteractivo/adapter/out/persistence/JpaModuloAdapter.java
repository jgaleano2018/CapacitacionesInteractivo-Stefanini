package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence;


import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.ModuloRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.ModuloEntity;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.SpringDataModuloRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Modulo;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class JpaModuloAdapter implements ModuloRepository {


	private final SpringDataModuloRepository repository;
	
	
	public JpaModuloAdapter(SpringDataModuloRepository repository) {
	this.repository = repository;
	}
	
	
	private Modulo toDomain(ModuloEntity e) {
		return new Modulo(e.getIdModulo(), e.getIdCurso(), e.getNombre(), e.getDescripcion(), e.getOrden());
	}
	
	
	private ModuloEntity toEntity(Modulo d) {
		ModuloEntity e = new ModuloEntity();
		e.setIdModulo(d.getIdModulo());
		e.setIdCurso(d.getIdCurso());
		e.setNombre(d.getNombre());
		e.setDescripcion(d.getDescripcion());
		e.setOrden(d.getOrden());
		return e;
	}
	
	
	@Override
	public Modulo save(Modulo modulo) {
		ModuloEntity entity = toEntity(modulo);
		ModuloEntity saved = repository.save(entity);
		return toDomain(saved);
	}
	

	
	@Override
	public Optional<Modulo> findById(Integer id) {
		return repository.findById(id);
	}
	
	
	
	@Override
	public List<Modulo> findAll() {
		return repository.findAll().stream().collect(Collectors.toList());
	}
	
	
	@Override
	public void deleteById(Integer idModulo) {
		repository.deleteById(idModulo);
	}
}
