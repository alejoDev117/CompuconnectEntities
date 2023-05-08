package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class MonitorEntity extends UsuarioEntity {
	
	
	private static final MonitorEntity DEFAULT_OBJECT = new MonitorEntity();

	private String numeroCelular;
	public MonitorEntity(UUID identificador, String nombre, TipoIdentificacionEntity tipoIdentificacion, String numeroIdentificacion, String correoInstitucional, String numeroCelular, TipoUsuarioEntity tipoUsuario) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(numeroIdentificacion);
		setCorreoInstitucional(correoInstitucional);
		setNumeroCelular(numeroCelular);
		setTipoUsuario(tipoUsuario);
	}
	
	
	
	public MonitorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
		setIdentificacion(UtilText.getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		setNumeroCelular(UtilText.getDefaultValue());
		setTipoUsuario(TipoUsuarioEntity.getDefaultObject());
		
	}
	

	
	
	
	public static final MonitorEntity getDeafaultObject() {
		return DEFAULT_OBJECT;
	}


	public UUID getIdentificador() {
		return identificador;
	}

	
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}

	
	public String getCorreoInstitucional() {
		return correoInstitucional;
	}

	
	private final void  setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.applyTrim(correoInstitucional);
		
	}

	
	public String getIdentificacion() {
		return identificacion;
	}

	
	private final void setIdentificacion(String identificacion) {
		this.identificacion = UtilText.applyTrim(identificacion);
		
	}

	
	public TipoIdentificacionEntity getTipoIdentificacion() {

		return tipoIdentificacion;
	}

	
	public final void  setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion,TipoIdentificacionEntity.getDefaultObject());
		
	}

	public String getNombre() {
		return nombre;
	}

	
	private final void setNombre(String nombre) {
		this.nombre = UtilText.applyTrim(nombre);
		
	}


	public String getNumeroCelular() {
		return numeroCelular;
	}



	private final void   setNumeroCelular(String numeroCelular) {
		this.numeroCelular = UtilText.applyTrim(numeroCelular);
		
	}


	public final TipoUsuarioEntity getTipoUsuario() {
		return tipoUsuario;
	}


	public final void setTipoUsuario(TipoUsuarioEntity tipoUsuario) {
		this.tipoUsuario = UtilObject.getDefault(tipoUsuario, TipoUsuarioEntity.getDefaultObject());
	}
	
}