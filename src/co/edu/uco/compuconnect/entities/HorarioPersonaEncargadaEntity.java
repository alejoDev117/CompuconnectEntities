package co.edu.uco.compuconnect.entities;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class HorarioPersonaEncargadaEntity {
	
	private static final HorarioPersonaEncargadaEntity DEFAULT_OBJECT = new HorarioPersonaEncargadaEntity();
	private UUID identificador;
	private TiempoFuncionamientoCentroInformaticaEntity tiempoFuncionamiento;
	private PersonaEncargadaEntity personaEncargada;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	
	public HorarioPersonaEncargadaEntity(UUID identificador, TiempoFuncionamientoCentroInformaticaEntity tiempoFuncionamiento, PersonaEncargadaEntity personaEncargada, LocalTime horaInicio, LocalTime horaFin) {
		super();
		setIdentificador(identificador);
		setTiempoFuncionamiento(tiempoFuncionamiento);
		setPersonaEncargada(personaEncargada);
		setHoraInicio(horaInicio);
		setHoraFin(horaFin);
		
	}
	
	private HorarioPersonaEncargadaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setTiempoFuncionamiento(TiempoFuncionamientoCentroInformaticaEntity.getDefaultObject());
		setPersonaEncargada(PersonaEncargadaEntity.getDeafaultObject());
		setHoraInicio(UtilDateTime.getDefaultValueLocaltime());
		setHoraFin(UtilDateTime.getDefaultValueLocaltime());
	}
	
	
	public static final HorarioPersonaEncargadaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	public final TiempoFuncionamientoCentroInformaticaEntity getTiempoFuncionamiento() {
		return tiempoFuncionamiento;
	}
	
	private final void setTiempoFuncionamiento(TiempoFuncionamientoCentroInformaticaEntity tiempoFuncionamiento) {
		this.tiempoFuncionamiento = UtilObject.getDefault(tiempoFuncionamiento, TiempoFuncionamientoCentroInformaticaEntity.getDefaultObject());
	}
	
	public final PersonaEncargadaEntity getPersonaEncargada() {
		return personaEncargada;
	}
	
	private final void setPersonaEncargada(PersonaEncargadaEntity personaEncargada) {

		this.personaEncargada = UtilObject.getDefault(personaEncargada, PersonaEncargadaEntity.getDeafaultObject());
	}
	
	public final LocalTime getHoraInicio() {
		return horaInicio;
	}
	
	private final void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = UtilDateTime.getDefaultLocalTime(horaInicio);
	}
	
	public final LocalTime getHoraFin() {
		return horaFin;
	}
	
	private final void setHoraFin(LocalTime horaFin) {
		this.horaFin = UtilDateTime.getDefaultLocalTime(horaFin);
	}
	
	

}
