package co.edu.uco.compuconnect.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class RespuestaEntity {
	
	private static final RespuestaEntity DEFAULT_OBJECT = new RespuestaEntity();
	private UUID identificador;
	private CoordinadorEntity autor;
	private String observacion;
	private Date fecha;

	
	public RespuestaEntity(final UUID identificador, final CoordinadorEntity autor, final String observacion, final Date fecha ) {
		setIdentificador(identificador);
		setAutor(autor);
		setObservacion(observacion);
		setFecha(fecha);
		
	}
	
	
	private RespuestaEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(CoordinadorEntity.getDefaultObject());
		setObservacion(UtilText.getUtilText().getDefaultValue());
		setFecha(UtilDateTime.getDefaultValueDate());
	}
	
	
	public static final RespuestaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public final UUID getIdentificador() {
		return identificador;
	}


	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}


	public final CoordinadorEntity getAutor() {
		return autor;
	}


	private final void setAutor(CoordinadorEntity autor) {
		this.autor = UtilObject.getDefault(autor, CoordinadorEntity.getDefaultObject());
	}


	public final String getObservacion() {
		return observacion;
	}


	private final void setObservacion(String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
	}


	public final Date getFecha() {
		return fecha;
	}


	private final void setFecha(Date fecha) {
		this.fecha = UtilDateTime.getDefaultDate(fecha);
	}
	

}
