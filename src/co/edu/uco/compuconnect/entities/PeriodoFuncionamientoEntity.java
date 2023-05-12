package co.edu.uco.compuconnect.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class PeriodoFuncionamientoEntity {
	
    private static final PeriodoFuncionamientoEntity DEFAULT_OBJECT = new PeriodoFuncionamientoEntity();
	private UUID identificador;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private DiaFestivoEntity diaFestivo;
	private EstadoPeriodoFuncionamientoEntity estado;
	
	
	
	public PeriodoFuncionamientoEntity(UUID identificador, String nombre, Date fechaInicio, Date fechaFin, DiaFestivoEntity diaFestivo, EstadoPeriodoFuncionamientoEntity estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
		setDiaFestivo(diaFestivo);
		setEstado(estado);
	}


	public PeriodoFuncionamientoEntity() {
		super();	
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getDefaultValue());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setDiaFestivo(DiaFestivoEntity.getDefaultObject());
		setEstado(EstadoPeriodoFuncionamientoEntity.getDefaultObject());

		}
	

	
	
	
	public static final PeriodoFuncionamientoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public UUID getIdentificador() {
		return identificador;
	}
	
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
		
	}

	public String getNombre() {
		return nombre;
	}
	
	private final void setNombre(final String nombre) {
		this.nombre = UtilText.applyTrim(nombre);
		
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
	
	private final void setFechaFin(final Date fechaInicio) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		
	}
	
	
	public DiaFestivoEntity getDiaFestivo() {
		return diaFestivo;
	}
	
	
	private void setDiaFestivo(final DiaFestivoEntity diaFestivo) {
		this.diaFestivo = UtilObject.getDefault(diaFestivo, DiaFestivoEntity.getDefaultObject());
		
	
	}
	
	
	public EstadoPeriodoFuncionamientoEntity getEstado() {
		return estado;
	}
	
	
	private  void setEstado(EstadoPeriodoFuncionamientoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPeriodoFuncionamientoEntity.getDefaultObject());
		
	}
	
	
}
