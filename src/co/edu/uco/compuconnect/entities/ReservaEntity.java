package co.edu.uco.compuconnect.entities;

import java.util.Date;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class ReservaEntity{
	
	private static final ReservaEntity DEFAULT_OBJECT = new ReservaEntity();
	private TipoReservaEntity tipoReserva;
	private Date fechaInicio;
	private Date fechaFin;
	private FrecuenciaEntity frecuencia;
	private CentroInformaticaEntity centroInformatica;
	private UUID identificador;
	private UsuarioEntity autor;
	private String descripcion;
	private Date horaCreacion;
	
	

	public ReservaEntity(UUID identificador, UsuarioEntity autor, TipoReservaEntity tipoReserva, Date FechaInicio, Date FechaFin,FrecuenciaEntity frecuencia, CentroInformaticaEntity centroInformatica,String descripcion, Date horaCreacion) {
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
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(UsuarioEntity.getDeafaulObject());
		setTipoReserva(TipoReservaEntity.getDefaultObject());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setFrecuencia(FrecuenciaEntity.getDefaultObject());
		setCentroInformatica(CentroInformaticaEntity.getDefaultObject());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueDate());
	}
	
	public static final ReservaEntity create() {
		return new ReservaEntity();
	}
	
	
	public static final ReservaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public UUID getIdentificador() {
		return identificador;
	}


	public final ReservaEntity  setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}
	

	
	public UsuarioEntity getAutor() {
		return autor;
	}


	public final  ReservaEntity setAutor(UsuarioEntity autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioEntity.getDeafaulObject());
		return this;
		
	}


	public String getDescripcion() {
		return descripcion;
	}

	
	public final ReservaEntity  setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
		
	}


	public Date getHoraCreacion() {
		return horaCreacion;
	}


	public final ReservaEntity   setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultDate(horaCreacion);
		return this;
		
	}

	
	
	public final TipoReservaEntity getTipoReserva() {
		return tipoReserva;
	}

	public final ReservaEntity setTipoReserva(TipoReservaEntity tipoReserva) {
		this.tipoReserva = UtilObject.getDefault(tipoReserva, TipoReservaEntity.getDefaultObject());
		return this;
		
	}

	public final Date getFechaInicio() {
		return fechaInicio;
	}

	public final ReservaEntity setFechaInicio(Date fechaInicio) {
		this.fechaInicio = UtilDateTime.getDefaultDate(fechaInicio);
		return this;
		
	}

	public final Date getFechaFin() {
		return fechaFin;
	}

	public final ReservaEntity setFechaFin(Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		return this;
		
	}

	public final FrecuenciaEntity getFrecuencia() {
		return frecuencia;
	}

	public final ReservaEntity setFrecuencia(FrecuenciaEntity frecuencia) {
		this.frecuencia = UtilObject.getDefault(frecuencia, FrecuenciaEntity.getDefaultObject());
		return this;
	
	}

	public final CentroInformaticaEntity getCentroInformatica() {
		return centroInformatica;
	}

	public final ReservaEntity setCentroInformatica(CentroInformaticaEntity centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaEntity.getDefaultObject());
		return this;
		
	}
	
	

}
