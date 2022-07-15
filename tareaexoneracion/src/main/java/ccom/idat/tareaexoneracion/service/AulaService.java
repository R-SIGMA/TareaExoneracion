package ccom.idat.tareaexoneracion.service;

import java.util.List;

import ccom.idat.tareaexoneracion.dto.AulaDTORequest;
import ccom.idat.tareaexoneracion.dto.AulaDTOResponse;



public interface AulaService {
	
	public List<AulaDTOResponse> listar();
	public AulaDTOResponse obtener(Integer id);
	public void guardar(AulaDTORequest aula);
	public void actualizar(AulaDTORequest aula);
	public void eliminar(Integer id);
	

}
