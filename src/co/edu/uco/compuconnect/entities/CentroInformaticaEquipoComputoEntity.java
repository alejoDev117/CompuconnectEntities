package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class CentroInformaticaEquipoComputoEntity {
	
	
	private static final CentroInformaticaEquipoComputoEntity DEFAULT_OBJECT = new CentroInformaticaEquipoComputoEntity();
	private UUID identificador;
	private CentroInformaticaEntity centroInformatica;
	private EquipoComputoEntity equipoComputo;
	
	
	public CentroInformaticaEquipoComputoEntity(final UUID identificador,final CentroInformaticaEntity centroInformatica,final EquipoComputoEntity equipoComputo) {
		setIdentificador(identificador);
		setCentroInformatica(centroInformatica);
		setEquipoComputo(equipoComputo);
	
	}
	
	
	private CentroInformaticaEquipoComputoEntity() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setCentroInformatica(CentroInformaticaEntity.getDefaultObject());
		setEquipoComputo(EquipoComputoEntity.getDefaultObject());

	}
	
	
	
	
	
	public static final CentroInformaticaEquipoComputoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public UUID getIdentificador() {
		return identificador;
	}
	
	private void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
		
	public CentroInformaticaEntity getCentroInformatica() {
		return centroInformatica;
	}
	
	
	private final void setCentroInformatica(final CentroInformaticaEntity centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaEntity.getDefaultObject());
		
	}
	
	
	public EquipoComputoEntity getEquipoComputo() {
		return equipoComputo;
	}
	
	private final void setEquipoComputo(final EquipoComputoEntity equipoComputo) {
		this.equipoComputo = UtilObject.getDefault(equipoComputo, EquipoComputoEntity.getDefaultObject());
		
	}
	
	

}
