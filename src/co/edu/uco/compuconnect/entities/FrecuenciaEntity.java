package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class FrecuenciaEntity {
	
	private static final FrecuenciaEntity DEFAULT_OBJECT = new FrecuenciaEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public FrecuenciaEntity(UUID identificador, String nombre, String descripcion) {
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	private FrecuenciaEntity() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	public static FrecuenciaEntity create(){
		return new FrecuenciaEntity();
	}
	
	public static final FrecuenciaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final FrecuenciaEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final FrecuenciaEntity setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final FrecuenciaEntity setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	
	}
	
	

}
