package ccom.idat.tareaexoneracion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColegioDTORequest {

	private Integer idColegio;
    private String nombre;
    private String direccion;
	
}
