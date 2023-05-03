package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class SoftwareEquipoComputoEntity {
	
	private static final SoftwareEquipoComputoEntity DEFAULT_OBJECT = new SoftwareEquipoComputoEntity();
	private UUID identificador;
	private SoftwareEntity software;
	private EquipoComputoEntity equipoComputo;
	
	
	
	
	public SoftwareEquipoComputoEntity(UUID identificador, SoftwareEntity software, EquipoComputoEntity equipoComputo) {
		super();
		setIdentificador(identificador);
		setSoftware(software);
		setEquipoComputo(equipoComputo);
	}




	private SoftwareEquipoComputoEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setSoftware(SoftwareEntity.getDefaultObject());
		setEquipoComputo(EquipoComputoEntity.getDefaultObject());
	}

	
	



	public static final SoftwareEquipoComputoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}




	public final SoftwareEntity getSoftware() {
		return software;
	}




	private final void setSoftware(SoftwareEntity software) {
		this.software = UtilObject.getDefault(software, SoftwareEntity.getDefaultObject());
		
	}




	public final EquipoComputoEntity getEquipoComputo() {
		return equipoComputo;
	}




	private final void setEquipoComputo(EquipoComputoEntity equipoComputo) {
		this.equipoComputo = UtilObject.getDefault(equipoComputo, EquipoComputoEntity.getDefaultObject());
		
	}





	

}
