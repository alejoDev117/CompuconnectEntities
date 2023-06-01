package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class UsuarioEntity {
	
	private TipoUsuarioEntity tipoUsuario;
	private UUID identificador;
	private String correoInstitucional;
	private String identificacion;
	private TipoIdentificacionEntity tipoIdentificacion;
	private String nombre;
	private static final UsuarioEntity DEFAULT_OBJECT  = new UsuarioEntity();
	

	public UsuarioEntity(UUID identificador, TipoUsuarioEntity tipoUsuario, String nombre, TipoIdentificacionEntity tipoIdentificacion, String numeroIdentificacion, String correoInstitucional ) {
		setIdentificador(identificador);
		setTipoUsuario(tipoUsuario);
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(numeroIdentificacion);
		setCorreoInstitucional(correoInstitucional);
		
	}
	
	private  UsuarioEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setTipoUsuario(TipoUsuarioEntity.getDefaultObject());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
		setIdentificacion(UtilText.getUtilText().getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		
	}
	
	
	public static final UsuarioEntity create() {
		return new UsuarioEntity();
	}
	
	
	public static final UsuarioEntity getDeafaulObject() {
		return DEFAULT_OBJECT;
	}

	public final TipoUsuarioEntity getTipoUsuario() {
		return tipoUsuario;
	}




	public final UsuarioEntity setTipoUsuario(TipoUsuarioEntity tipoUsuario) {
		this.tipoUsuario = UtilObject.getDefault(tipoUsuario, TipoUsuarioEntity.getDefaultObject());
		return this;
		
	}




	
	public UUID getIdentificador() {
		return identificador;
	}

	
	public UsuarioEntity setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}

	
	public String getCorreoInstitucional() {
		return correoInstitucional;
	}


	public UsuarioEntity setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.getUtilText().applyTrim(correoInstitucional);
		return this;
		
	}

	
	public String getIdentificacion() {
		
		return identificacion;
	}

	
	public UsuarioEntity setIdentificacion(String identificacion) {
		this.identificacion = UtilText.getUtilText().applyTrim(identificacion);
		return this;
		
	}

	
	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	
	public UsuarioEntity setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.getDefaultObject());
		return this;
	}
	


	public String getNombre() {
		return nombre;
	}

	
	public final UsuarioEntity   setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	
	}

	
}
