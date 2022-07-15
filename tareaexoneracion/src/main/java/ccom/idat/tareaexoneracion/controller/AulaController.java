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

import ccom.idat.tareaexoneracion.dto.AulaDTORequest;
import ccom.idat.tareaexoneracion.dto.AulaDTOResponse;
import ccom.idat.tareaexoneracion.service.AulaService;

@Controller
@RequestMapping("/tarea/aula")
public class AulaController {
	
	@Autowired
	private AulaService servicio;
	
	@GetMapping("/listar")
	public @ResponseBody List<AulaDTOResponse> listar(){
		return servicio.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody AulaDTOResponse obtener(@PathVariable Integer id) {
		return servicio.obtener(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody AulaDTORequest aula) {
		servicio.guardar(aula);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody AulaDTORequest aula) {
		servicio.actualizar(aula);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		servicio.eliminar(id);
	}

}
