package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class PersonaEncargadaEntity {
	
	private String numeroCelular;
	private UUID identificador;
	private String nombre;
	private String correoInstitucional;
	private static final PersonaEncargadaEntity DEFAULT_OBJECT = new PersonaEncargadaEntity();
	
	
	public PersonaEncargadaEntity(String numeroCelular, UUID identificador, String nombre, String correoInstitucional) {
		setNumeroCelular(numeroCelular);
		setIdentificador(identificador);
		setNombre(nombre);
		setCorreoInstitucional(correoInstitucional);
	}
	
	public PersonaEncargadaEntity() {
		setNumeroCelular(UtilText.getUtilText().getDefaultValue());
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
	}
	
	public static final PersonaEncargadaEntity getDeafaultObject() {
		return DEFAULT_OBJECT;
	}

	public final String getNumeroCelular() {
		return numeroCelular;
	}

	private final void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = UtilText.getUtilText().applyTrim(numeroCelular);
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}

	public final String getCorreoInstitucional() {
		return correoInstitucional;
	}

	public final void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.getUtilText().applyTrim(correoInstitucional);
	}
	
	
	
	
	
	
	
		
}
	
	
	
	
	


	
