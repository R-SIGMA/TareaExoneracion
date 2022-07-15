package ccom.idat.tareaexoneracion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccom.idat.tareaexoneracion.dto.AulaDTORequest;
import ccom.idat.tareaexoneracion.dto.AulaDTOResponse;
import ccom.idat.tareaexoneracion.model.Aula;
import ccom.idat.tareaexoneracion.repository.AulaRepository;


@Service
public class AulaServiceImpl implements AulaService {

	@Autowired
	private AulaRepository repository;
	
	@Override
	public List<AulaDTOResponse> listar() {
		// TODO Auto-generated method stub
		List<AulaDTOResponse> lista = new ArrayList<AulaDTOResponse>();
		
		for(Aula aula: repository.findAll()) {
			AulaDTOResponse au = new AulaDTOResponse();
			au.setIdAula(aula.getIdAula());
			au.setNombreAula(aula.getNombreAula());
			
			lista.add(au);
		}
		return lista;
	}

	@Override
	public AulaDTOResponse obtener(Integer id) {
		Aula aula = repository.findById(id).orElse(null);
		
		AulaDTOResponse au = new AulaDTOResponse();
		
		au.setIdAula(aula.getIdAula());
		au.setNombreAula(aula.getNombreAula());
		
		return au;
	}

	@Override
	public void guardar(AulaDTORequest aula) {
		Aula au = new Aula();
		
		au.setIdAula(aula.getIdAula());
		au.setNombreAula(aula.getNombreAula());
		
		repository.save(au);
		
		
	}

	@Override
	public void actualizar(AulaDTORequest aula) {
		Aula au = new Aula();
		
		au.setIdAula(aula.getIdAula());
		au.setNombreAula(aula.getNombreAula());
		
		repository.saveAndFlush(au);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
		
	}
	
	

}
