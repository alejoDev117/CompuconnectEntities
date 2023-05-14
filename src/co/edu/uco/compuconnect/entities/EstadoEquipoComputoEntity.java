package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class EstadoEquipoComputoEntity {
	
	
	private static final EstadoEquipoComputoEntity DEFAULT_OBJECT = new EstadoEquipoComputoEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public EstadoEquipoComputoEntity(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public EstadoEquipoComputoEntity() { 
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getDefaultValue());
		setDescripcion(UtilText.getDefaultValue());
	}
	
	

	public static final EstadoEquipoComputoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final void setNombre(final String nombre) {
		this.nombre = UtilText.applyTrim(nombre) ;
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
	
	}
	

}
