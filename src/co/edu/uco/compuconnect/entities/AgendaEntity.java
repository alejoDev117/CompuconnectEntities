package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class AgendaEntity {
	
	private static final AgendaEntity DEFAULT_OBJECT = new AgendaEntity();
	private UUID identificador;
	private PeriodoFuncionamientoEntity periodoFuncionamiento;
	private CentroInformaticaEntity centroInformatica;
	private String nombre;
	

	public AgendaEntity(UUID identificador, PeriodoFuncionamientoEntity periodoFuncionamiento,
			CentroInformaticaEntity centroInformatica, String nombre) {
		setIdentificador(identificador);
		setPeriodoFuncionamiento(periodoFuncionamiento);
		setCentroInformatica(centroInformatica);
		setNombre(nombre);
	}

	public AgendaEntity() {	
		setIdentificador(UtilUUID.getDefaultUuid());
		setPeriodoFuncionamiento(PeriodoFuncionamientoEntity.getDefaultObject());
		setCentroInformatica(CentroInformaticaEntity.getDefaultObject());
		setNombre(UtilText.getUtilText().getDefaultValue());
		
		
	}
	
	
	
	public static final AgendaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public UUID getIdentificador() {
		return identificador;
	}
	
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
		
	}
	
	
	public PeriodoFuncionamientoEntity getPeriodoFuncionamiento() {
		return periodoFuncionamiento;
	}
	
	private final void setPeriodoFuncionamiento(final PeriodoFuncionamientoEntity periodoFuncionamiento) {
		this.periodoFuncionamiento = UtilObject.getDefault(periodoFuncionamiento, PeriodoFuncionamientoEntity.getDefaultObject());
		
	}
	
	
	public CentroInformaticaEntity getCentroInformatica() {
		return centroInformatica;
	}
	
	private final void setCentroInformatica(final CentroInformaticaEntity centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaEntity.getDefaultObject());
	
	}
	
	
	public String getNombre() {
		return nombre;
	}
	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		
	}



}
