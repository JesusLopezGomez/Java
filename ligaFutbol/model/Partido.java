package ligaFutbol.model;

import java.util.Objects;

public class Partido {

	private int jornada;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int numGolesEquipoLocal;
	private int numGolesEquipoVisitante;
	private String resultadoQuiniela;
	private String resultado;
	private int partidosGanadosLocal;
	private int partidosGanadosVisitante;
	public Partido() {
	}


	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante) throws ExcepcionesLigaFutbol{
		super();
		if(jornada < 1 && jornada > 38){
			throw new ExcepcionesLigaFutbol();
		}
		else if(jornada >= 1 && jornada <= 38) {
			this.jornada = jornada;
			this.equipoLocal = equipoLocal;
			this.equipoVisitante = equipoVisitante;
		}
	}

	
	public int getJornada() {
		return jornada;
	}


	public Equipo getEquipoLocal() {
		return equipoLocal;
	}


	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}


	public int getNumGolesEquipoLocal() {
		return numGolesEquipoLocal;
	}


	public int getNumGolesEquipoVisitante() {
		return numGolesEquipoVisitante;
	}


	public String getResultadoQuiniela() {
		return resultadoQuiniela;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public int getPartidosGanadosLocal() {
		return partidosGanadosLocal;
	}
	
	public int getpartidosGanadosVisitante() {
		return partidosGanadosVisitante;
	}

	public void ponerResultado(String resultado) {
		if((Character.isDigit(resultado.charAt(0)) && Character.isDigit(resultado.charAt(2)) && resultado.charAt(1) == '-')) {
			this.numGolesEquipoLocal = Integer.valueOf(resultado.substring(0,0+1));
			this.numGolesEquipoVisitante = Integer.valueOf(resultado.substring(2,2+1));
			this.resultado = resultado;
		}
	}
	
	public void asignarPartidoGanado() {
		if(resultado != null) {
			if(Integer.valueOf(resultado.charAt(0)) > Integer.valueOf(resultado.charAt(2))) {
				this.partidosGanadosLocal ++;
			}else {
				this.partidosGanadosVisitante ++;
			}
		}
	}
	
	public void AsignarResultadoQuiniela() {
		if(resultado != null) {
			if(Integer.valueOf(resultado.charAt(0)) > Integer.valueOf(resultado.charAt(2))) {
				this.resultadoQuiniela = "1";
			}else if(Integer.valueOf(resultado.charAt(0)) < Integer.valueOf(resultado.charAt(2))) {
				this.resultadoQuiniela = "2";
			}else {
				this.resultadoQuiniela = "X";
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado =  true;
		if (obj == null)
			resultado =  false;
		if (getClass() != obj.getClass())
			resultado =  false;
		Partido other = (Partido) obj;
		return resultado && Objects.equals(equipoLocal, other.equipoLocal) && Objects.equals(equipoVisitante, other.equipoVisitante)
				&& jornada == other.jornada;
	}


	@Override
	public String toString() {
		String mensaje = "-1";
		if(resultado != null && jornada >= 1 && jornada <= 38) {
			mensaje = "Partido entre equipo local " + equipoLocal + " y el equipo visitante "+ equipoVisitante +" ha finalizado con "+ numGolesEquipoLocal+" goles de equipo local y " + numGolesEquipoVisitante + " goles de equipo" +
					" visitante. Resultado quiniela: " + resultadoQuiniela;
		}else if(equipoLocal != null && equipoVisitante != null) {
			mensaje = "Partido entre equipo local " + equipoLocal + " y equipo visitante " + equipoVisitante + " todavía no se ha jugado";
		}
		return mensaje;
		
	}
	

	
	




	

}
