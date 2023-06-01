package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;


public class TipoUsuarioEntity {
	
	
	private static final TipoUsuarioEntity DEFAULT_OBJECT = new TipoUsuarioEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public TipoUsuarioEntity(UUID identificador, String nombre, String descripcion) {
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	private TipoUsuarioEntity() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	public static final TipoUsuarioEntity create(){
		return new TipoUsuarioEntity();
	}
	
	public static final TipoUsuarioEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoUsuarioEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoUsuarioEntity setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final TipoUsuarioEntity setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	
	

}
