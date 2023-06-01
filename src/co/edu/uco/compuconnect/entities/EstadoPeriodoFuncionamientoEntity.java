package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class EstadoPeriodoFuncionamientoEntity {
	
	private static final EstadoPeriodoFuncionamientoEntity DEFAULT_OBJECT = new EstadoPeriodoFuncionamientoEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public EstadoPeriodoFuncionamientoEntity(UUID identificador, String nombre, String descripcion) {
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	private EstadoPeriodoFuncionamientoEntity() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	public static final EstadoPeriodoFuncionamientoEntity create(){
		return new EstadoPeriodoFuncionamientoEntity();
	}
	
	public static final EstadoPeriodoFuncionamientoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final EstadoPeriodoFuncionamientoEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final EstadoPeriodoFuncionamientoEntity setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final EstadoPeriodoFuncionamientoEntity setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	

}
