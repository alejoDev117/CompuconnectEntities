package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class CoordinadorEntity{

	private static final CoordinadorEntity DEFAULT_OBJECT = new CoordinadorEntity();
	protected UUID identificador;
	protected String nombre;
	protected TipoIdentificacionEntity tipoIdentificacion;
	protected String identificacion;
	protected String correoInstitucional;
	protected String numeroCelular;
	protected TipoUsuarioEntity tipoUsuario;
	

	
	public CoordinadorEntity(UUID identificador, String nombre, TipoIdentificacionEntity tipoIdentificacion, String numeroIdentificacion, String correoInstitucional, String numeroCelular, TipoUsuarioEntity tipoUsuario) {
		setIdentificador(identificador);
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(numeroIdentificacion);
		setCorreoInstitucional(correoInstitucional);
		setNumeroCelular(numeroCelular);
		setTipoUsuario(tipoUsuario);
		
	}
	


	private CoordinadorEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
		setIdentificacion(UtilText.getUtilText().getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		setNumeroCelular(UtilText.getUtilText().getDefaultValue());
		setTipoUsuario(TipoUsuarioEntity.getDefaultObject());
		
	}
	
	

	public static final CoordinadorEntity getDefaultObject() {
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
		this.correoInstitucional = UtilText.getUtilText().applyTrim(correoInstitucional);
		
	}

	
	public String getIdentificacion() {
		return identificacion;
	}

	
	private final void setIdentificacion(String identificacion) {
		this.identificacion = UtilText.getUtilText().applyTrim(identificacion);
		
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
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
	}


	public String getNumeroCelular() {
		return numeroCelular;
	}



	private final void  setNumeroCelular(String numeroCelular) {
		this.numeroCelular = UtilText.getUtilText().applyTrim(numeroCelular);
		
	}
	
	public final TipoUsuarioEntity getTipoUsuario() {
		return tipoUsuario;
	}


	public final void setTipoUsuario(TipoUsuarioEntity tipoUsuario) {
		this.tipoUsuario = UtilObject.getDefault(tipoUsuario, TipoUsuarioEntity.getDefaultObject());
	}



}
