
package co.edu.uco.compuconnect.entities;


import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class SolicitudEntity extends ContenidoEntity {
	
	private static final SolicitudEntity DEFAULT_OBJECT = new SolicitudEntity();
	private TipoSolicitudEntity tipoSolicitud;
	private EstadoSolicitudEntity estadoSolicitud;
	
	public SolicitudEntity(UUID identificador, UsuarioEntity autor, TipoSolicitudEntity tipoSolicitud, String descripcion, Date horaCreacion, EstadoSolicitudEntity estadoSolicitud) {
		setIdentificador(identificador);
		setAutor(autor);
		setTipoSolicitud(tipoSolicitud);
		setDescripcion(descripcion);
		setHoraCreacion(horaCreacion);
		setEstadoSolicitud(estadoSolicitud);
		
	}
	
	
	public SolicitudEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(UsuarioEntity.getDeafaulObject());
		setTipoSolicitud(TipoSolicitudEntity.getDefaultObject());
		setDescripcion(UtilText.getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueDate());
		setEstadoSolicitud(EstadoSolicitudEntity.getDefaultObject());
		
	}
	
	
	


	public static final SolicitudEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public UUID getIdentificador() {
		return identificador;
	}


	private final void  setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}


	public UsuarioEntity getAutor() {
		return autor;
	}

	private final void  setAutor(UsuarioEntity autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioEntity.getDeafaulObject());
		
	}

	
	public String getDescripcion() {
		return descripcion;
	}

	
	private final void  setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
		
	}


	public Date getHoraCreacion() {
		return horaCreacion;
	}


	public final void setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultDate(horaCreacion);
		
	}

	public final TipoSolicitudEntity getTipoSolicitud() {
		return tipoSolicitud;
	}

	public final void setTipoSolicitud(TipoSolicitudEntity tipoSolicitud) {
		this.tipoSolicitud = UtilObject.getDefault(tipoSolicitud, TipoSolicitudEntity.getDefaultObject());

	}

	public final EstadoSolicitudEntity getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public final void setEstadoSolicitud(EstadoSolicitudEntity estadoSolicitud) {
		this.estadoSolicitud = UtilObject.getDefault(estadoSolicitud, EstadoSolicitudEntity.getDefaultObject());
	
	}


	
}
