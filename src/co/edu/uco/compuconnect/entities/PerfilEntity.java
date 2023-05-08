package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class PerfilEntity {
	
	private static final PerfilEntity DEFAULT_OBJECT = new PerfilEntity();
	private UUID identificador;
	private UsuarioEntity usuario;
	
	public PerfilEntity(UUID identificador, UsuarioEntity usuario) {
		super();
		setIdentificador(identificador);
		setUsuario(usuario);
	}
	
	public PerfilEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setUsuario(UsuarioEntity.getDeafaulObject());
	}
	
	public static final PerfilEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final UsuarioEntity getUsuario() {
		return usuario;
	}

	private final void setUsuario(UsuarioEntity usuario) {
		this.usuario = UtilObject.getDefault(usuario, UsuarioEntity.getDeafaulObject());
	}
	
	

}
