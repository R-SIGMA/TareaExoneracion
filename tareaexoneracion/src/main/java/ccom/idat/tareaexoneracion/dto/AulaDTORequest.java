package ccom.idat.tareaexoneracion.dto;

import ccom.idat.tareaexoneracion.model.Aula;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AulaDTORequest {
	
	private Integer idAula;
	private String nombreAula;

}
