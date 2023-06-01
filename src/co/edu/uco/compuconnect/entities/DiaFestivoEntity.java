package co.edu.uco.compuconnect.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DiaFestivoEntity {
	
	private static final DiaFestivoEntity DEFAULT_OBJECT = new DiaFestivoEntity();
	private UUID identificador;
	private String nombre;
	private Date fecha;
	
	
	public DiaFestivoEntity(UUID identificador, String nombre, Date fecha) {
		setIdentificador(identificador);
		setNombre(nombre);
		setFecha(fecha);
	}
	
	private  DiaFestivoEntity() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setFecha(UtilDateTime.getDefaultValueDate());
	}
	
	
	
	
	public static final DiaFestivoEntity getDefaultObject() {
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
	
	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		
	}
	
	public final Date getFecha() {
		return fecha;
	}
	
	private final void setFecha(final Date fecha) {
		this.fecha = UtilDateTime.getDefaultDate(fecha);
	
	}
		
}

