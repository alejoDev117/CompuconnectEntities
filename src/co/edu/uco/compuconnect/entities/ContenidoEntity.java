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
	private String descripcion;
	
	
	public ContenidoEntity(UUID identificador,String descripcion) {
		super();
		setIdentificador(identificador);
		setDescripcion(descripcion);
	}
	
	public ContenidoEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setDescripcion(UtilText.getDefaultValue());
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

	

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
	}
	
	
	
}
