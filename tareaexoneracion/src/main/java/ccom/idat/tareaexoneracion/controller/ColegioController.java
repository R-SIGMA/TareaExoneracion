package ccom.idat.tareaexoneracion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ccom.idat.tareaexoneracion.dto.ColegioDTORequest;
import ccom.idat.tareaexoneracion.dto.ColegioDTOResponse;
import ccom.idat.tareaexoneracion.service.ColegioService;

@Controller
@RequestMapping("/tarea/colegio")
public class ColegioController {

	@Autowired
    private ColegioService serv;

    @GetMapping("/listar")
    public @ResponseBody List<ColegioDTOResponse> listar(){
        return serv.listar();
    }

    @GetMapping("/listar/{id}")
    public @ResponseBody ColegioDTOResponse obtener(@PathVariable Integer id) {
        return serv.obtener(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody ColegioDTORequest colegio) {
        serv.guardar(colegio);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actualizar(@RequestBody ColegioDTORequest colegio) {
        serv.actualizar(colegio);
    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminar(@PathVariable Integer id) {
        serv.eliminar(id);
    }
	
}
