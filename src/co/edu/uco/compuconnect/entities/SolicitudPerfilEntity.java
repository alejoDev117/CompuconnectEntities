package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;


public class SolicitudPerfilEntity {
	
	private static final SolicitudPerfilEntity DEFAULT_OBJECT = new SolicitudPerfilEntity();
	private UUID identificador;
	private SolicitudEntity solicitud;
	private PerfilEntity perfil;
	
	public SolicitudPerfilEntity(UUID identificador, SolicitudEntity solicitud, PerfilEntity perfil) {
		super();
		setIdentificador(identificador);
		setSolicitud(solicitud);
		setPerfil(perfil);
	}
	
	public SolicitudPerfilEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setSolicitud(SolicitudEntity.getDefaultObject());
		setPerfil(PerfilEntity.getDefaultObject());
	}
	
	public static final SolicitudPerfilEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final SolicitudEntity getSolicitud() {
		return solicitud;
	}

	private final void setSolicitud(SolicitudEntity solicitud) {
		this.solicitud = UtilObject.getDefault(solicitud, SolicitudEntity.getDefaultObject());
	}

	public final PerfilEntity getPerfil() {
		return perfil;
	}

	private final void setPerfil(PerfilEntity perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
	}
	
	
	
	

}
