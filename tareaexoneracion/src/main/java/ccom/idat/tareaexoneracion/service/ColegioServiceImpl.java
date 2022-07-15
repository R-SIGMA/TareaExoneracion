package ccom.idat.tareaexoneracion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccom.idat.tareaexoneracion.dto.ColegioDTORequest;
import ccom.idat.tareaexoneracion.dto.ColegioDTOResponse;
import ccom.idat.tareaexoneracion.model.Colegio;
import ccom.idat.tareaexoneracion.repository.ColegioRepository;

@Service
public class ColegioServiceImpl implements ColegioService{

    @Autowired
    private ColegioRepository repository;

    @Override
    public List<ColegioDTOResponse> listar() {
        List<ColegioDTOResponse> lista = new ArrayList<ColegioDTOResponse>();

        for(Colegio colegio: repository.findAll()) {
        	ColegioDTOResponse c = new ColegioDTOResponse();
            c.setIdColegio(colegio.getIdColegio());
            c.setNombre(colegio.getNombre());
            c.setDireccion(colegio.getDireccion());

            lista.add(c);
        }
        return lista;
    }

    @Override
    public ColegioDTOResponse obtener(Integer id) {
        Colegio colegio = repository.findById(id).orElse(null);

        ColegioDTOResponse c = new ColegioDTOResponse();
        c.setIdColegio(colegio.getIdColegio());
        c.setNombre(colegio.getNombre());
        c.setDireccion(colegio.getDireccion());

        return c;
    }

    @Override
    public void guardar(ColegioDTORequest colegio) {
    	Colegio c = new Colegio();

        c.setIdColegio(colegio.getIdColegio());
        c.setNombre(colegio.getNombre());
        c.setDireccion(colegio.getDireccion());

        repository.save(c);

    }

    @Override
    public void actualizar(ColegioDTORequest colegio) {
    	Colegio c = new Colegio();

        c.setIdColegio(colegio.getIdColegio());
        c.setNombre(colegio.getNombre());
        c.setDireccion(colegio.getDireccion());

        repository.saveAndFlush(c);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);

    }

}