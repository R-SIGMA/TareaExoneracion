package ccom.idat.tareaexoneracion.dto;

import ccom.idat.tareaexoneracion.model.Alumno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTORequest {

	private Integer idAlumno;
	private String nombres;
	private String apellidos;
	private Integer edad;
	private String fechaMatricula;
	
}
