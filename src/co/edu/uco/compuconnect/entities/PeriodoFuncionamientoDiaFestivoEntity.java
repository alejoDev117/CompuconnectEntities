package co.edu.uco.compuconnect.entities;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class PeriodoFuncionamientoDiaFestivoEntity {

	
	private static final PeriodoFuncionamientoDiaFestivoEntity DEFAULT_OBJECT = new PeriodoFuncionamientoDiaFestivoEntity();
	private UUID identificador;
	private PeriodoFuncionamientoEntity periodoFuncionamiento;
	private DiaFestivoEntity diaFestivo;
	
	
	public PeriodoFuncionamientoDiaFestivoEntity(UUID identificador, PeriodoFuncionamientoEntity periodoFuncionamiento,
			DiaFestivoEntity diaFestivo) {
		super();
		setIdentificador(identificador);
		setPeriodoFuncionamiento(periodoFuncionamiento);
		setDiaFestivo(diaFestivo);
	}


	private PeriodoFuncionamientoDiaFestivoEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPeriodoFuncionamiento(PeriodoFuncionamientoEntity.getDefaultObject());
		setDiaFestivo(DiaFestivoEntity.getDefaultObject());
	}
	
	
	
	

	public static final PeriodoFuncionamientoDiaFestivoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public final UUID getIdentificador() {
		return identificador;
	}


	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);

	}


	public final PeriodoFuncionamientoEntity getPeriodoFuncionamiento() {
		return periodoFuncionamiento;
	}


	private final void setPeriodoFuncionamiento(PeriodoFuncionamientoEntity periodoFuncionamiento) {
		this.periodoFuncionamiento = UtilObject.getDefault(periodoFuncionamiento, PeriodoFuncionamientoEntity.getDefaultObject());

	}


	public final DiaFestivoEntity getDiaFestivo() {
		return diaFestivo;
	}


	private final void setDiaFestivo(DiaFestivoEntity diaFestivo) {
		this.diaFestivo = UtilObject.getDefault(diaFestivo, DiaFestivoEntity.getDefaultObject());
		
	}



	
	
	
	
}
