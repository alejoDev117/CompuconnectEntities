package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;


public class BuzonSolicitudEntity {
	
	private static final BuzonSolicitudEntity DEFAULT_OBJECT = new BuzonSolicitudEntity();
	private UUID identificador;
	private SolicitudEntity solicitud;
	private RespuestaEntity respuesta;
	
	
	public BuzonSolicitudEntity(final UUID identificador, final SolicitudEntity solicitud, final RespuestaEntity respuesta) {
		super();
		setIdentificador(identificador);
		setSolicitud(solicitud);
		setRespuesta(respuesta);
		
	}
	
	private BuzonSolicitudEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setSolicitud(SolicitudEntity.getDefaultObject());
		setRespuesta(RespuestaEntity.getDefaultObject());
	}
	
	public static final BuzonSolicitudEntity getDefaultObject() {
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
	
	public final RespuestaEntity getRespuesta() {
		return respuesta;
	}
	
	private final void setRespuesta(RespuestaEntity respuesta) {
		this.respuesta = UtilObject.getDefault(respuesta, RespuestaEntity.getDefaultObject());
	}
	
	
}