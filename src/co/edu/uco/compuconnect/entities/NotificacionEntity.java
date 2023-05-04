package co.edu.uco.compuconnect.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class NotificacionEntity {

	private static final NotificacionEntity DEFAULT_OBJECT = new NotificacionEntity();
	private UUID identificador;
	private ContenidoEntity contenido;
	private Date fecha;
	private TipoNotificacionEntity tipo;
	
	public NotificacionEntity(final UUID identificador, final ContenidoEntity contenido, final Date fecha, final TipoNotificacionEntity tipo) {
		super();
		setIdentificador(identificador);
		setContenido(contenido);
		setFecha(fecha);
		setTipo(tipo);
		
	}
	
	private NotificacionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setContenido(ReservaEntity.getDefaultObject());
		setFecha(UtilDateTime.getDefaultValueDate());
		setTipo(TipoNotificacionEntity.getDefaultObject());
	}
	
	public static final NotificacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	public final ContenidoEntity getContenido() {
		return contenido;
	}
	
	private final void setContenido(ContenidoEntity contenido) {
		this.contenido = UtilObject.getDefault(contenido, ReservaEntity.getDefaultObject());
	}

	public final Date getFecha() {
		return fecha;
	}
	
	private final void setFecha(Date fecha) {
		this.fecha = UtilDateTime.getDefaultDate(fecha);
	}
	public final TipoNotificacionEntity getTipo() {
		return tipo;
	}
	private final void setTipo(TipoNotificacionEntity tipo) {
		this.tipo = UtilObject.getDefault(tipo, TipoNotificacionEntity.getDefaultObject());
	}
	
	
	
}
