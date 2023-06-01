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
		setIdentificador(identificador);
		setNombre(nombre);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
		setDiaFestivo(diaFestivo);
		setEstado(estado);
	}


	private PeriodoFuncionamientoEntity() {	
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setDiaFestivo(DiaFestivoEntity.getDefaultObject());
		setEstado(EstadoPeriodoFuncionamientoEntity.getDefaultObject());

		}
	

	public static final PeriodoFuncionamientoEntity create() {
		return new PeriodoFuncionamientoEntity();
	}
	
	
	public static final PeriodoFuncionamientoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public UUID getIdentificador() {
		return identificador;
	}
	
	
	public final PeriodoFuncionamientoEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public final PeriodoFuncionamientoEntity setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
		
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	
	public final PeriodoFuncionamientoEntity setFechaInicio(final Date fechaInicio) {
		this.fechaInicio = UtilDateTime.getDefaultDate(fechaInicio);
		return this;
		
	}
	
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	public final PeriodoFuncionamientoEntity setFechaFin(final Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		return this;
		
	}
	
	
	public DiaFestivoEntity getDiaFestivo() {
		return diaFestivo;
	}
	
	
	public PeriodoFuncionamientoEntity setDiaFestivo(final DiaFestivoEntity diaFestivo) {
		this.diaFestivo = UtilObject.getDefault(diaFestivo, DiaFestivoEntity.getDefaultObject());
		return this;
		
	
	}
	
	
	public EstadoPeriodoFuncionamientoEntity getEstado() {
		return estado;
	}
	
	
	public  PeriodoFuncionamientoEntity setEstado(EstadoPeriodoFuncionamientoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPeriodoFuncionamientoEntity.getDefaultObject());
		return this;
		
	}
	
	
}
