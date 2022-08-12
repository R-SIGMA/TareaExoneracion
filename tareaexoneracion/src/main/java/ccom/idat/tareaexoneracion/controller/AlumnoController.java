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

import ccom.idat.tareaexoneracion.dto.AlumnoDTORequest;
import ccom.idat.tareaexoneracion.dto.AlumnoDTOResponse;
import ccom.idat.tareaexoneracion.model.Alumno;
import ccom.idat.tareaexoneracion.service.AlumnoService;

@Controller
@RequestMapping("/tarea/alumno")
public class AlumnoController {

	@Autowired
	private AlumnoService serv;
	
	@GetMapping("/listar2")
	public @ResponseBody List<AlumnoDTOResponse> listar(){
		return serv.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody AlumnoDTOResponse obtener(@PathVariable Integer id) {
		return serv.obtener(id);
	}
	
	@PostMapping("/guardar2")
	public @ResponseBody void guardar(@RequestBody AlumnoDTORequest alumno) {
		serv.guardar(alumno);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody AlumnoDTORequest alumno) {
		serv.actualizar(alumno);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		serv.eliminar(id);
	}
	
}
