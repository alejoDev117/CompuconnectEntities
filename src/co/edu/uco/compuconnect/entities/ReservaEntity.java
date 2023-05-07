package co.edu.uco.compuconnect.entities;



import java.time.LocalTime;
import java.util.Date;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class ReservaEntity{
	
	private static final ReservaEntity DEFAULT_OBJECT = new ReservaEntity();
	private UUID identificador;
	private UsuarioEntity autor;
	private String descripcion;
	private LocalTime horaCreacion;
	private TipoReservaEntity tipoReserva;
	private Date fechaInicio;
	private Date fechaFin;
	private FrecuenciaEntity frecuencia;
	private CentroInformaticaEntity centroInformatica;
	

	public ReservaEntity(UUID identificador, UsuarioEntity autor, TipoReservaEntity tipoReserva, Date FechaInicio, Date FechaFin,FrecuenciaEntity frecuencia, CentroInformaticaEntity centroInformatica,String descripcion, LocalTime horaCreacion) {
		setIdentificador(identificador);
		setAutor(autor);
		setTipoReserva(tipoReserva);
		setFechaInicio(FechaInicio);
		setFechaFin(FechaFin);
		setFrecuencia(frecuencia);
		setCentroInformatica(centroInformatica);
		setDescripcion(descripcion);
		setHoraCreacion(horaCreacion);
	}
	
	private ReservaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(UsuarioEntity.getDeafaulObject());
		setTipoReserva(TipoReservaEntity.getDefaultObject());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setFrecuencia(FrecuenciaEntity.getDefaultObject());
		setCentroInformatica(CentroInformaticaEntity.getDefaultObject());
		setDescripcion(UtilText.getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueLocaltime());
	}
	
	
	
	
	public static final ReservaEntity getDefaultObject() {
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


	private final  void setAutor(UsuarioEntity autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioEntity.getDeafaulObject());
		
	}


	public String getDescripcion() {
		return descripcion;
	}

	
	private final void  setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
		
	}


	public LocalTime getHoraCreacion() {
		return horaCreacion;
	}


	private final void   setHoraCreacion(LocalTime horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultLocalTime(horaCreacion);
		
	}

	
	
	public final TipoReservaEntity getTipoReserva() {
		return tipoReserva;
	}

	private final void setTipoReserva(TipoReservaEntity tipoReserva) {
		this.tipoReserva = UtilObject.getDefault(tipoReserva, TipoReservaEntity.getDefaultObject());
		
	}

	public final Date getFechaInicio() {
		return fechaInicio;
	}

	private final void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = UtilDateTime.getDefaultDate(fechaInicio);
		
	}

	public final Date getFechaFin() {
		return fechaFin;
	}

	private final void setFechaFin(Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		
	}

	public final FrecuenciaEntity getFrecuencia() {
		return frecuencia;
	}

	private final void setFrecuencia(FrecuenciaEntity frecuencia) {
		this.frecuencia = UtilObject.getDefault(frecuencia, FrecuenciaEntity.getDefaultObject());
	
	}

	public final CentroInformaticaEntity getCentroInformatica() {
		return centroInformatica;
	}

	private final void setCentroInformatica(CentroInformaticaEntity centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaEntity.getDefaultObject());
		
	}
	
	

}
