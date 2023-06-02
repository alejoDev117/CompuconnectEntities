package co.edu.uco.compuconnect.entities;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DetalleReservaEntity {
	
	private static final DetalleReservaEntity DEFAULT_OBJECT = new DetalleReservaEntity();
	private UUID identificador;
	private DiaSemanalEntity dia;
	private LocalTime horainicio;
	private LocalTime horafin;
	
	
	public DetalleReservaEntity(UUID identificador, DiaSemanalEntity dia, LocalTime horainicio, LocalTime horafin) {
		setIdentificador(identificador);
		setDia(dia);
		setHorainicio(horainicio);
		setHorafin(horafin);
	}
	
	public DetalleReservaEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setDia(DiaSemanalEntity.getDefaultObject());
		setHorainicio(UtilDateTime.getDefaultValueLocaltime());
		setHorafin(UtilDateTime.getDefaultValueLocaltime());
	}
	
	public static final DetalleReservaEntity create() {
		return new DetalleReservaEntity();
	}
	public static final DetalleReservaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final DetalleReservaEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final DiaSemanalEntity getDia() {
		return dia;
	}

	public final DetalleReservaEntity setDia(DiaSemanalEntity dia) {
		this.dia = UtilObject.getDefault(dia, DiaSemanalEntity.getDefaultObject());
		return this;
	}

	public final LocalTime getHorainicio() {
		return horainicio;
	}

	public final DetalleReservaEntity setHorainicio(LocalTime horainicio) {
		this.horainicio = UtilDateTime.getDefaultLocalTime(horainicio);
		return this;
	}

	public final LocalTime getHorafin() {
		return horafin;
	}

	public final DetalleReservaEntity setHorafin(LocalTime horafin) {
		this.horafin = UtilDateTime.getDefaultLocalTime(horafin);
		return this;
	}
	
	
	
	

}
