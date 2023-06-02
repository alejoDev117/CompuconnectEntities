package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DiaSemanalEntity {
	
	private static final DiaSemanalEntity DEFAULT_OBJECT = new DiaSemanalEntity();
	private UUID identificador;
	private String nombre;
	
	
	public DiaSemanalEntity(UUID identificador, String nombre) {
		setIdentificador(identificador);
		setNombre(nombre);
	}
	
	private  DiaSemanalEntity() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
	}
	
	public static DiaSemanalEntity create() {
		return new DiaSemanalEntity();
	}
	
	
	public static final DiaSemanalEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final DiaSemanalEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;

	}
	public final String getNombre() {
		return nombre;
	}
	
	public final DiaSemanalEntity setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	
	}
	
}

