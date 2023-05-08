package co.edu.uco.compuconnect.entities;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class ExcepcionAgendaEntity {
	
	private static final ExcepcionAgendaEntity DEFAULT_OBJECT = new ExcepcionAgendaEntity();
	private UUID identificador;
	private ExcepcionEntity excepcion;
	private AgendaEntity agenda;
	
	
	public ExcepcionAgendaEntity(UUID identificador, ExcepcionEntity excepcion, AgendaEntity agenda) {
		super();
		setIdentificador(identificador);
		setExcepcion(excepcion);
		setAgenda(agenda);
		
	}


	private ExcepcionAgendaEntity() {
		super();	
		setIdentificador(UtilUUID.getDefaultUuid());
		setExcepcion(ExcepcionEntity.getDefaultObject());
		setAgenda(AgendaEntity.getDefaultObject());
		
		
		
		
		}
	
	 
	
	public static final ExcepcionAgendaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}
	
	public ExcepcionEntity getExcepcion() {
		return excepcion;
	}
	
	private void setExcepcion(final ExcepcionEntity excepcion) {
		this.excepcion = UtilObject.getDefault(excepcion,ExcepcionEntity.getDefaultObject());
		
		
	}
	
	public AgendaEntity getAgenda() {
		return agenda;
	}
	
	private void setAgenda(final AgendaEntity agenda) {
		this.agenda = UtilObject.getDefault(agenda, AgendaEntity.getDefaultObject());
		
	}
	
	

}
