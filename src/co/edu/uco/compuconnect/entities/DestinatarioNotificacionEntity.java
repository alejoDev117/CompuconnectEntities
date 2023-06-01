package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DestinatarioNotificacionEntity {
	
	private static final DestinatarioNotificacionEntity DEFAULT_OBJECT = new DestinatarioNotificacionEntity();
	private UUID identificador;
	private DestinatarioEntity destinatario;
	private NotificacionEntity notificacion;
	private EstadoNotificacionEntity estado;
	
	public DestinatarioNotificacionEntity(final UUID identificador, final DestinatarioEntity destinatario, final NotificacionEntity notificacion, final EstadoNotificacionEntity estado) {
		setIdentificador(identificador);
		setDestinatario(destinatario);
		setNotificacion(notificacion);
		setEstado(estado);
	}
	
	private DestinatarioNotificacionEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());

		setDestinatario(DestinatarioEntity.getDefaultObject());
		setNotificacion(NotificacionEntity.getDefaultObject());
		setEstado(EstadoNotificacionEntity.getDefaultObject());
	}
	
	
	public static final DestinatarioNotificacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	public final DestinatarioEntity getDestinatario() {
		return destinatario;
	}
	
	private final void setDestinatario(DestinatarioEntity destinatario) {
		this.destinatario = UtilObject.getDefault(destinatario, DestinatarioEntity.getDefaultObject());

	}
	
	public final NotificacionEntity getNotificacion() {
		return notificacion;
	}
	
	private final void setNotificacion(NotificacionEntity notificacion) {
		this.notificacion = UtilObject.getDefault(notificacion, NotificacionEntity.getDefaultObject());
	}
	
	public final EstadoNotificacionEntity getEstado() {
		return estado;
	}
	
	private final void setEstado(EstadoNotificacionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoNotificacionEntity.getDefaultObject());
	}
	
	

}
