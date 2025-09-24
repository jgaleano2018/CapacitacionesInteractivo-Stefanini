package com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence;


import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.entity.CapacitacionEntity;
import com.CoeDesarrollo.CapacitacionesInteractivo.adapter.out.persistence.repository.SpringDataCapacitacionRepository;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.model.Capacitacion;
import com.CoeDesarrollo.CapacitacionesInteractivo.domain.port.out.CapacitacionRepository;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class JpaCapacitacionAdapter implements CapacitacionRepository {

	private final SpringDataCapacitacionRepository jpaRepo;
	
	
	public JpaCapacitacionAdapter(SpringDataCapacitacionRepository jpaRepo) {
		this.jpaRepo = jpaRepo;
	}
	
	
	
	private Capacitacion toDomain(CapacitacionEntity e) {
		return new Capacitacion(e.getId(), e.getNombre(), e.getDescripcion(), e.getFechaInicio(), e.getFechaFin());
	}
	
	
	private CapacitacionEntity toEntity(Capacitacion c) {
		CapacitacionEntity e = new CapacitacionEntity();
		e.setId(c.getId());
		e.setNombre(c.getNombre());
		e.setDescripcion(c.getDescripcion());
		e.setFechaInicio(c.getFechaInicio());
		e.setFechaFin(c.getFechaFin());
		return e;
	}
	
	
	@Override
	public Capacitacion save(Capacitacion c) {
		CapacitacionEntity e = toEntity(c);
		CapacitacionEntity saved = jpaRepo.save(e);
		return toDomain(saved);
	}
	
	
	@Override
	public Optional<Capacitacion> findById(Integer id) {
		return jpaRepo.findById(id).map(this::toDomain);
	}
	
	
	@Override
	public List<Capacitacion> findAll() {
		return jpaRepo.findAll().stream().map(this::toDomain).collect(Collectors.toList());
	}
	
	
	@Override
	public void deleteById(Integer id) {
		jpaRepo.deleteById(id);
	}
}