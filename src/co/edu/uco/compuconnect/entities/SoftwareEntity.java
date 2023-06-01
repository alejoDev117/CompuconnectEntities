package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class SoftwareEntity {
	
	private static final SoftwareEntity DEFAULT_OBJECT = new SoftwareEntity();
	private UUID identificador;
	private String nombre;
	private String version;
	
	
	public SoftwareEntity(UUID identificador, String nombre, String version) {
		setIdentificador(identificador);
		setNombre(nombre);
		setVersion(version);
	}

	

	private SoftwareEntity() {	
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setVersion(UtilText.getUtilText().getDefaultValue());
		}
	
	public static final SoftwareEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	

	

	public final UUID getIdentidicador() {
		return identificador;
	}

	

	private final void setIdentificador(final UUID identidicador) {
		this.identificador = UtilUUID.getDefault(identidicador);
	
	}

	

	public final String getNombre() {
		return nombre;
	}

	

	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
	}


	
	public final String getVersion() {
		return version;
	}


	
	private final void setVersion(final String version) {
		this.version = UtilText.getUtilText().applyTrim(version);
	
	}
	

	
	
}
