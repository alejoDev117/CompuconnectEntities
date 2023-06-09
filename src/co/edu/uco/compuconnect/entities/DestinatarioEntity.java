package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class DestinatarioEntity {
	
	private UUID identificador;
	private String correoInstitucional;
	private String nombre;
	private static final DestinatarioEntity DEFAULT_OBJECT = new DestinatarioEntity();
	
	public DestinatarioEntity(UUID identificador, String correoInstitucional, String nombre) {
		setIdentificador(identificador);
		setCorreoInstitucional(correoInstitucional);
		setNombre(nombre);
	}
	
	public DestinatarioEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		setNombre(UtilText.getUtilText().getDefaultValue());
	}
	
	public static final DestinatarioEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final String getCorreoInstitucional() {
		return correoInstitucional;
	}

	private final void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.getUtilText().applyTrim(correoInstitucional);
	}


	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}
	
	
	
	
	
		
	

}
