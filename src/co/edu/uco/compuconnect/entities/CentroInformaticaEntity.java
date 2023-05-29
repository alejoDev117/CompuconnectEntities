package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilBoolean;
import co.edu.uco.compuconnect.crosscutting.utils.UtilNumeric;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class CentroInformaticaEntity {
	
	private static final CentroInformaticaEntity DEFAULT_OBJECT = new CentroInformaticaEntity();
	private UUID identificador;
	private String nombre;
	private String ubicacion;
	private boolean poseeVideoBeam;

	
	
	
	
	
	public CentroInformaticaEntity(UUID identificador, String nombre, String ubicacion, boolean poseeVideoBeam) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setUbicacion(ubicacion);
		setPoseeVideoBeam(poseeVideoBeam);
		
	
	}




	private  CentroInformaticaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setUbicacion(UtilText.getUtilText().getDefaultValue());
		setPoseeVideoBeam(UtilBoolean.getDefaultValue());
		
	}
	
	public static final CentroInformaticaEntity getDefaultObject() {
		
		return DEFAULT_OBJECT;
	
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	private final  void  setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
	}
	
	public final String getUbicacion() {
		return ubicacion;
	}
	private final  void  setUbicacion(final String ubicacion) {
		this.ubicacion = UtilText.getUtilText().applyTrim(ubicacion);
		
	}
	
	
	public final boolean isPoseeVideoBeam() {
		return poseeVideoBeam;
	}
	
	
	private final  void  setPoseeVideoBeam(boolean poseeVideoBeam) {
		this.poseeVideoBeam = UtilBoolean.getDefault(poseeVideoBeam);
		
		
	}
	



}
