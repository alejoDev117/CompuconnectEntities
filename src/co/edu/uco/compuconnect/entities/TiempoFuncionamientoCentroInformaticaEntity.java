package co.edu.uco.compuconnect.entities;

import java.time.LocalTime;

import java.util.UUID;


import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class TiempoFuncionamientoCentroInformaticaEntity {
	
	private static final TiempoFuncionamientoCentroInformaticaEntity DEFAULT_OBJECT = new TiempoFuncionamientoCentroInformaticaEntity();
	private UUID identificador;
	private PeriodoFuncionamientoEntity periodoFuncionamiento;
	private CentroInformaticaEntity centroInformatica;
	private DiaSemanalEntity dia;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	
	public TiempoFuncionamientoCentroInformaticaEntity(UUID identificador, PeriodoFuncionamientoEntity periodoFuncionamiento,CentroInformaticaEntity centroInformatica, DiaSemanalEntity dia,LocalTime horaInicio, LocalTime horaFin) {
		setIdentificador(identificador);
		setPeriodoFuncionamiento(periodoFuncionamiento);
		setCentroInformatica(centroInformatica);
		setDia(dia);
		setHoraInicio(horaInicio);
		setHoraFin(horaFin);
		
		
	}


	private TiempoFuncionamientoCentroInformaticaEntity() {	
		setIdentificador(UtilUUID.getDefaultUuid());
		setPeriodoFuncionamiento(PeriodoFuncionamientoEntity.getDefaultObject());
		setCentroInformatica(CentroInformaticaEntity.getDefaultObject());
		setDia(DiaSemanalEntity.getDefaultObject());
		setHoraInicio(UtilDateTime.getDefaultValueLocaltime());
		setHoraFin(UtilDateTime.getDefaultValueLocaltime());
		
		}
	
	
	
	
	
	
	
	public static final TiempoFuncionamientoCentroInformaticaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}




	public UUID getIdentificador() {
		return identificador;
	}
	
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}
	
	public PeriodoFuncionamientoEntity getPeriodoFuncionamiento() {
		return periodoFuncionamiento;
	}
	
	
	private final void setPeriodoFuncionamiento(final PeriodoFuncionamientoEntity periodoFuncionamiento) {
		this.periodoFuncionamiento = UtilObject.getDefault(periodoFuncionamiento, PeriodoFuncionamientoEntity.getDefaultObject());
		
	}
	
	
	public CentroInformaticaEntity getCentroInfomatica() {
		return centroInformatica;
		
	}
	
	
	private  final void setCentroInformatica(final CentroInformaticaEntity centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaEntity.getDefaultObject());
		
	}
	
	
	public DiaSemanalEntity getDia() {
		return dia;
	}
	
	
	private void setDia(final DiaSemanalEntity dia) {
		this.dia = UtilObject.getDefault(dia, DiaSemanalEntity.getDefaultObject());
		
	}
	
	
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	
	
	private void  setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = UtilDateTime.getDefaultLocalTime(horaInicio);
	
	}

	
	
	public LocalTime getHoraFin() {
		return horaFin;
	}
	
	private void setHoraFin(LocalTime horaFin) {
		this.horaFin = UtilDateTime.getDefaultLocalTime(horaFin);
	
	}
	
	
	
	
}
