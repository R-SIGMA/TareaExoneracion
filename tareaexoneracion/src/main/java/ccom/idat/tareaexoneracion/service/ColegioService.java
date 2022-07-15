package ccom.idat.tareaexoneracion.service;

import java.util.List;

import ccom.idat.tareaexoneracion.dto.ColegioDTORequest;
import ccom.idat.tareaexoneracion.dto.ColegioDTOResponse;

public interface ColegioService {

	public List<ColegioDTOResponse> listar();
    public ColegioDTOResponse obtener(Integer id);
    public void guardar(ColegioDTORequest colegio);
    public void actualizar(ColegioDTORequest colegio);
    public void eliminar(Integer id);
	
}
