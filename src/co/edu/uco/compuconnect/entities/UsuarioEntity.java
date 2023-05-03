package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class UsuarioEntity extends DestinatarioEntity {
	
	private TipoUsuarioEntity tipoUsuario;
	private static final UsuarioEntity DEAFAUL_OBJECT  = new UsuarioEntity();
	

	public UsuarioEntity(UUID identificador, TipoUsuarioEntity tipoUsuario, String nombre, TipoIdentificacionEntity tipoIdentificacion, String numeroIdentificacion, String correoInstitucional ) {
		setIdentificador(identificador);
		setTipoUsuario(tipoUsuario);
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(numeroIdentificacion);
		setCorreoInstitucional(correoInstitucional);
		
	}
	
	private  UsuarioEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setTipoUsuario(TipoUsuarioEntity.getDefaultObject());
		setNombre(UtilText.getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
		setIdentificacion(UtilText.getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		
	}
	
	
	
	
	
	public static final UsuarioEntity getDeafaulObject() {
		return DEAFAUL_OBJECT;
	}

	public final TipoUsuarioEntity getTipoUsuario() {
		return tipoUsuario;
	}




	private final void setTipoUsuario(TipoUsuarioEntity tipoUsuario) {
		this.tipoUsuario = UtilObject.getDefault(tipoUsuario, TipoUsuarioEntity.getDefaultObject());
		
	}




	
	public UUID getIdentificador() {
		return identificador;
	}

	
	private void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}

	
	public String getCorreoInstitucional() {
		return correoInstitucional;
	}


	private void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.applyTrim(correoInstitucional);
		
	}

	
	public String getIdentificacion() {
		
		return identificacion;
	}

	
	private void setIdentificacion(String identificacion) {
		this.identificacion = UtilText.applyTrim(identificacion);
		
	}

	
	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	
	private void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.getDefaultObject());
	}
	


	public String getNombre() {
		return nombre;
	}

	
	private final void   setNombre(String nombre) {
		this.nombre = UtilText.applyTrim(nombre);
	
	}

	
}
