package ccom.idat.tareaexoneracion.service;

import java.util.List;

import ccom.idat.tareaexoneracion.dto.AlumnoDTORequest;
import ccom.idat.tareaexoneracion.dto.AlumnoDTOResponse;

public interface AlumnoService {

	public List<AlumnoDTOResponse> listar();
	public AlumnoDTOResponse obtener(Integer id);
	public void guardar(AlumnoDTORequest alumno);
	public void actualizar(AlumnoDTORequest alumno);
	public void eliminar(Integer id);
	
}
