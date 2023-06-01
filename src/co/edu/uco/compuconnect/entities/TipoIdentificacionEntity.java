package co.edu.uco.compuconnect.entities;

import java.util.UUID;


import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;


public class TipoIdentificacionEntity {
	
	private static final TipoIdentificacionEntity DEFAULT_OBJECT = new TipoIdentificacionEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public TipoIdentificacionEntity(UUID identificador, String nombre, String descripcion) {
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	private TipoIdentificacionEntity() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	
	public static final TipoIdentificacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public static final TipoIdentificacionEntity create(){
		return new TipoIdentificacionEntity();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoIdentificacionEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoIdentificacionEntity setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final TipoIdentificacionEntity setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	
	}
	
	

}
