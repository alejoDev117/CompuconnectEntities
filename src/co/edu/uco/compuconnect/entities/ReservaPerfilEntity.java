package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class ReservaPerfilEntity {
	
	private static final ReservaPerfilEntity DEFAULT_OBJECT = new ReservaPerfilEntity();
	private UUID identificador;
	private ReservaEntity reserva;
	private PerfilEntity perfil;
	
	public ReservaPerfilEntity(final UUID identificador, final ReservaEntity reserva, final PerfilEntity perfil) {
		setIdentificador(identificador);
		setReserva(reserva);
		setPerfil(perfil);
	}
	
	
	private ReservaPerfilEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setReserva(ReservaEntity.getDefaultObject());
		setPerfil(PerfilEntity.getDefaultObject());
	}
	
	public static final ReservaPerfilEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefaultUuid();
	}
	
	public final ReservaEntity getReserva() {
		return reserva;
	}
	
	private final void setReserva(ReservaEntity reserva) {
		this.reserva = UtilObject.getDefault(reserva, ReservaEntity.getDefaultObject());
	}
	
	public final PerfilEntity getPerfil() {
		return perfil;
	}
	
	private final void setPerfil(PerfilEntity perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
	}
	
	

}
