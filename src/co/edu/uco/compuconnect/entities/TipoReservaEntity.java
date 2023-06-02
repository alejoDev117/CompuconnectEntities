package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;


public class TipoReservaEntity {
	
	private static final TipoReservaEntity DEFAULT_OBJECT = new TipoReservaEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public TipoReservaEntity(UUID identificador, String nombre, String descripcion) {
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	private TipoReservaEntity() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	public static TipoReservaEntity create() {
		return new TipoReservaEntity();
	}
	
	
	public static final TipoReservaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoReservaEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoReservaEntity setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final TipoReservaEntity setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
		
	}


}
