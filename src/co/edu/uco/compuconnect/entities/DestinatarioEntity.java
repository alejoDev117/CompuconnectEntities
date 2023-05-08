package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class DestinatarioEntity {
	
	private UUID identificador;
	private String correoInstitucional;
	private String identificacion;
	private TipoIdentificacionEntity tipoIdentificacion;
	private String nombre;
	private static final DestinatarioEntity DEFAULT_OBJECT = new DestinatarioEntity();
	
	public DestinatarioEntity(UUID identificador, String correoInstitucional, String identificacion,TipoIdentificacionEntity tipoIdentificacion, String nombre) {
		super();
		setIdentificador(identificador);
		setCorreoInstitucional(correoInstitucional);
		setIdentificacion(identificacion);
		setTipoIdentificacion(tipoIdentificacion);
		setNombre(nombre);
	}
	
	public DestinatarioEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		setIdentificacion(UtilText.getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
		setNombre(UtilText.getDefaultValue());
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
		this.correoInstitucional = UtilText.applyTrim(correoInstitucional);
	}

	public final String getIdentificacion() {
		return identificacion;
	}

	private final void setIdentificacion(String identificacion) {
		this.identificacion = UtilText.applyTrim(identificacion);
	}

	public final TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	private final void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion,TipoIdentificacionEntity.getDefaultObject());
	}

	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(String nombre) {
		this.nombre = UtilText.applyTrim(nombre);
	}
	
	
	
	
	
		
	

}