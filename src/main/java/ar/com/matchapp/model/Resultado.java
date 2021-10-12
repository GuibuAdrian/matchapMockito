package ar.com.matchapp.model;

public class Resultado{
	private Team local;
	private Team visitante;
	public Team getVisitante() {
		return visitante;
	}
	public void setVisitante(Team visitante) {
		this.visitante = visitante;
	}
	public Team getLocal() {
		return local;
	}
	public void setLocal(Team local) {
		this.local = local;
	}
}