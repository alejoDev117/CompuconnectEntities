package co.edu.uco.compuconnect.entities;


import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class ContenidoEntity {
	
	private static final ContenidoEntity DEAFAULT_OBJECT = new ContenidoEntity();
	private UUID identificador;
	private UsuarioEntity autor;
	private String descripcion;
	private Date horaCreacion;
	
	
	public ContenidoEntity(UUID identificador, UsuarioEntity autor, String descripcion, Date horaCreacion) {
		super();
		setIdentificador(identificador);
		setAutor(autor);
		setDescripcion(descripcion);
		setHoraCreacion(horaCreacion);
	}
	
	public ContenidoEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(UsuarioEntity.getDeafaulObject());
		setDescripcion(UtilText.getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueDate());
	}
	
	public static final ContenidoEntity getDeafaultObject() {
		return DEAFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final UsuarioEntity getAutor() {
		return autor;
	}

	private final void setAutor(UsuarioEntity autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioEntity.getDeafaulObject());
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
	}

	public final Date getHoraCreacion() {
		return horaCreacion;
	}

	private final void setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultDate(horaCreacion);
	}

	
	
	
	
	
	
	
	
	
	
