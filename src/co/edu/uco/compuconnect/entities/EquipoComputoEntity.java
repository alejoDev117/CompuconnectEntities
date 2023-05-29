package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class EquipoComputoEntity {
	
	private static final EquipoComputoEntity DEFAULT_OBJECT = new EquipoComputoEntity();
	private UUID identificador;
	private String nombre;
	private EstadoEquipoComputoEntity estado;
	
	public EquipoComputoEntity(final UUID identificador,final String nombre,final EstadoEquipoComputoEntity estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setEstado(estado);
	
	}
	
	
	private EquipoComputoEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoEquipoComputoEntity.getDefaultObject());

	}
	
	
	
	
	
	
	
	public static final EquipoComputoEntity getDefaultObject() {
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
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;

	}
	
	
	public EstadoEquipoComputoEntity getEstado() {
		return estado;
	}
	
	
	private final void setEstado(final EstadoEquipoComputoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEquipoComputoEntity.getDefaultObject());
	
	}
	
	

}
