package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilBoolean;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class CentroInformaticaEntity {
	
	private static final CentroInformaticaEntity DEFAULT_OBJECT = new CentroInformaticaEntity();
	private UUID identificador;
	private String nombre;
	private String ubicacion;
	private boolean poseeVideoBeam;

	
	public CentroInformaticaEntity(UUID identificador, String nombre, String ubicacion, boolean poseeVideoBeam) {
		setIdentificador(identificador);
		setNombre(nombre);
		setUbicacion(ubicacion);
		setPoseeVideoBeam(poseeVideoBeam);
		
	
	}




	private  CentroInformaticaEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setUbicacion(UtilText.getUtilText().getDefaultValue());
		setPoseeVideoBeam(UtilBoolean.getDefaultValue());
		
	}
	
	public static final CentroInformaticaEntity create() {
		return new CentroInformaticaEntity();
	}
	
	public static final CentroInformaticaEntity getDefaultObject() {
		
		return DEFAULT_OBJECT;
	
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final CentroInformaticaEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final  CentroInformaticaEntity  setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	
	public final String getUbicacion() {
		return ubicacion;
	}
	public final  CentroInformaticaEntity  setUbicacion(final String ubicacion) {
		this.ubicacion = UtilText.getUtilText().applyTrim(ubicacion);
		return this;
		
	}
	
	
	public final boolean isPoseeVideoBeam() {
		return poseeVideoBeam;
	}
	
	
	public final  CentroInformaticaEntity  setPoseeVideoBeam(boolean poseeVideoBeam) {
		this.poseeVideoBeam = UtilBoolean.getDefault(poseeVideoBeam);
		return this;
		
		
	}
	



}
