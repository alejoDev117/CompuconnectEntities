package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class EstadoNotificacionEntity {
	
	private static final EstadoNotificacionEntity DEFAULT_OBJECT = new EstadoNotificacionEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public EstadoNotificacionEntity(UUID identificador, String nombre, String descripcion) {
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	private EstadoNotificacionEntity() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	
	
	public static final EstadoNotificacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	

	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}
	public final String getNombre() {
		return nombre;
	}
	
	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
	}
	

}
