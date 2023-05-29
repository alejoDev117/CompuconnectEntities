package co.edu.uco.compuconnect.entities;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class ExcepcionEntity {
	
	
	private static final ExcepcionEntity DEFAULT_OBJECT = new ExcepcionEntity();
	private UUID identificador;
	private Date fechaInicio;
	private Date fechaFin;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	private FrecuenciaEntity frecuencia;
	private String motivo;
	
	public ExcepcionEntity(UUID identificador, Date fechaInicio, Date fechaFin, LocalTime horaInicio, LocalTime horaFin, FrecuenciaEntity frecuencia, String motivo) {
		super();
		setIdentificador(identificador);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
		setHoraInicio(horaInicio);
		setHoraFin(horaFin);
		setFrecuencia(frecuencia);
		setMotivo(motivo);
		
	}


	private ExcepcionEntity() {
		super();	
		setIdentificador(UtilUUID.getDefaultUuid());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setHoraInicio(UtilDateTime.getDefaultValueLocaltime());
		setHoraFin(UtilDateTime.getDefaultValueLocaltime());
		setFrecuencia(FrecuenciaEntity.getDefaultObject());
		setMotivo(UtilText.getUtilText().getDefaultValue());
		
		}
	
	
	
	public static final ExcepcionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	private final void setFechaInicio(final Date fechaInicio) {
		this.fechaInicio = UtilDateTime.getDefaultDate(fechaInicio);
		
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	
	private final void setFechaFin(final Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		
	}
	
	
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	
	private void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = UtilDateTime.getDefaultLocalTime(horaInicio);
		
	}
	
	public LocalTime getHoraFin() {
		return horaFin;
	}
	
	private void setHoraFin(LocalTime horaFin) {
		this.horaFin = UtilDateTime.getDefaultLocalTime(horaFin);
		
	}
	
	public FrecuenciaEntity getFrecuencia() {
		return frecuencia;
	}
	
	private void setFrecuencia(FrecuenciaEntity frecuencia) {
		this.frecuencia = UtilObject.getDefault(frecuencia, FrecuenciaEntity.getDefaultObject());
		
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	private final void setMotivo(final String motivo) {
		this.motivo = UtilText.getUtilText().applyTrim(motivo);
	
	}
	
	
	
	

}
