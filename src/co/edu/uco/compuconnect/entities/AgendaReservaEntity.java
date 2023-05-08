package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class AgendaReservaEntity {
	
	private static final AgendaReservaEntity DEFAULT_OBJECT = new AgendaReservaEntity();
	private UUID identificador;
	private AgendaEntity agenda;
	private ReservaEntity reserva;
	
	
	public AgendaReservaEntity(UUID identificador, AgendaEntity agenda, ReservaEntity reserva) {
		super();
		setIdentificador(identificador);
		setAgenda(agenda);
		setReserva(reserva);
	}
	
	private AgendaReservaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAgenda(AgendaEntity.getDefaultObject());
		setReserva(ReservaEntity.getDefaultObject());
	}
	
	public static final AgendaReservaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final AgendaEntity getAgenda() {
		return agenda;
	}

	private final void setAgenda(final AgendaEntity agenda) {
		this.agenda = UtilObject.getDefault(agenda, AgendaEntity.getDefaultObject());
	}

	public final ReservaEntity getReserva() {
		return reserva;
	}

	private final void setReserva(final ReservaEntity reserva) {
		this.reserva = UtilObject.getDefault(reserva, ReservaEntity.getDefaultObject());
	}
	
	
	
	

}
