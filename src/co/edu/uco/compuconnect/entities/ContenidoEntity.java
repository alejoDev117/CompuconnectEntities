package co.edu.uco.compuconnect.entities;


import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public  class ContenidoEntity {

	
	private static final ContenidoEntity DEFAULT_OBJECT = new ContenidoEntity();
	private UUID identificador;
	private UsuarioEntity autor;
	private String descripcion;
	private LocalTime horaCreacion;
	
	
	public ContenidoEntity(UUID identificador, UsuarioEntity usuario, String descripcion, LocalTime horaCreacion) {
		super();
		setIdentificador(identificador);
		setAutor(usuario);
		setDescripcion(descripcion);
		setHoraCreacion(horaCreacion);
	}
	
	private ContenidoEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(UsuarioEntity.getDeafaulObject());
		setDescripcion(UtilText.getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueLocaltime());
	}
	
	public static final ContenidoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	public final UsuarioEntity getAutor() {
		return autor;
	}
	
	public final void setAutor(UsuarioEntity autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioEntity.getDeafaulObject());
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final void setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
	}
	
	public final LocalTime getHoraCreacion() {
		return horaCreacion;
	}
	
	public final void setHoraCreacion(LocalTime horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultLocalTime(horaCreacion);
	}
	
	
	
	
	
	
}
