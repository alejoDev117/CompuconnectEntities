package co.edu.uco.compuconnect.entities;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DetalleReservaEntity {
	
	private static final DetalleReservaEntity DEFAULT_OBJECT = new DetalleReservaEntity();
	private UUID identificador;
	private ReservaEntity reserva;
	private DiaSemanalEntity dia;
	private LocalTime horainicio;
	private LocalTime horafin;
	
	
	public DetalleReservaEntity(UUID identificador, ReservaEntity reserva, DiaSemanalEntity dia, LocalTime horainicio, LocalTime horafin) {
		setIdentificador(identificador);
		setReserva(reserva);
		setDia(dia);
		setHorainicio(horainicio);
		setHorafin(horafin);
	}
	
	public DetalleReservaEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setReserva(ReservaEntity.getDefaultObject());
		setDia(DiaSemanalEntity.getDefaultObject());
		setHorainicio(UtilDateTime.getDefaultValueLocaltime());
		setHorafin(UtilDateTime.getDefaultValueLocaltime());
	}
	
	public static final DetalleReservaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final ReservaEntity getReserva() {
		return reserva;
	}

	public final void setReserva(ReservaEntity reserva) {
		this.reserva = UtilObject.getDefault(reserva, ReservaEntity.getDefaultObject());
	}

	public final DiaSemanalEntity getDia() {
		return dia;
	}

	public final void setDia(DiaSemanalEntity dia) {
		this.dia = UtilObject.getDefault(dia, DiaSemanalEntity.getDefaultObject());
	}

	public final LocalTime getHorainicio() {
		return horainicio;
	}

	public final void setHorainicio(LocalTime horainicio) {
		this.horainicio = UtilDateTime.getDefaultLocalTime(horainicio);
	}

	public final LocalTime getHorafin() {
		return horafin;
	}

	public final void setHorafin(LocalTime horafin) {
		this.horafin = UtilDateTime.getDefaultLocalTime(horafin);
	}
	
	
	
	

}
