package ccom.idat.tareaexoneracion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccom.idat.tareaexoneracion.dto.AlumnoDTORequest;
import ccom.idat.tareaexoneracion.dto.AlumnoDTOResponse;
import ccom.idat.tareaexoneracion.model.Alumno;
import ccom.idat.tareaexoneracion.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository rep;
	
	@Override
	public List<AlumnoDTOResponse> listar() {
		List<AlumnoDTOResponse> list = new ArrayList<AlumnoDTOResponse>();
		
		for(Alumno alumno : rep.findAll()) {
			AlumnoDTOResponse a = new AlumnoDTOResponse();
			
			a.setIdAlumno(alumno.getIdAlumno());
			a.setNombres(alumno.getNombres());
			a.setApellidos(alumno.getApellidos());
			a.setEdad(alumno.getEdad());
			a.setFechaMatricula(alumno.getFechaMatricula());
			
			list.add(a);
		}
		
		return list;
	}

	@Override
	public AlumnoDTOResponse obtener(Integer id) {
		Alumno alumno = rep.findById(id).orElse(null);
		
		AlumnoDTOResponse a = new AlumnoDTOResponse();
		
		a.setIdAlumno(alumno.getIdAlumno());
		a.setNombres(alumno.getNombres());
		a.setApellidos(alumno.getApellidos());
		a.setEdad(alumno.getEdad());
		a.setFechaMatricula(alumno.getFechaMatricula());
		
		return a;
	}

	@Override
	public void guardar(AlumnoDTORequest alumno) {
		Alumno a = new Alumno();
		
		a.setIdAlumno(alumno.getIdAlumno());
		a.setNombres(alumno.getNombres());
		a.setApellidos(alumno.getApellidos());
		a.setEdad(alumno.getEdad());
		a.setFechaMatricula(alumno.getFechaMatricula());
		
		rep.save(a);
	}

	@Override
	public void actualizar(AlumnoDTORequest alumno) {
		Alumno a = new Alumno();
		
		a.setIdAlumno(alumno.getIdAlumno());
		a.setNombres(alumno.getNombres());
		a.setApellidos(alumno.getApellidos());
		a.setEdad(alumno.getEdad());
		a.setFechaMatricula(alumno.getFechaMatricula());
		
		rep.saveAndFlush(a);
	}

	@Override
	public void eliminar(Integer id) {
		rep.deleteById(id);
	}

}
