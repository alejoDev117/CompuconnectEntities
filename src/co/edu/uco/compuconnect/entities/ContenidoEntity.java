package co.edu.uco.compuconnect.entities;


import java.util.Date;
import java.util.UUID;

public abstract class ContenidoEntity {

	protected UUID identificador;
	protected UsuarioEntity autor;
	protected String descripcion;
	protected Date horaCreacion;
	
	
	
	
}
