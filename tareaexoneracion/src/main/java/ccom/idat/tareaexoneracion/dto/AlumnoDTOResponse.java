package ccom.idat.tareaexoneracion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTOResponse {

	private Integer idAlumno;
	private String nombres;
	private String apellidos;
	private Integer edad;
	private String fechaMatricula;
	
}
