package ar.com.matchapp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ar.com.matchapp.model.TeamRepository;

public class MatchService {
	private TeamRepository local;
	private TeamRepository visitante;
	private int nroFecha;
	private Date dateMatch;

	public void registerTeams(TeamRepository team1, TeamRepository team2, int fecha, String dateS) {
		this.setLocal(team1);
		this.setVisitante(team2);
		this.setFecha(fecha);

	    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    try {
			this.dateMatch = formatter1.parse(dateS);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void printFecha() {
		System.out.println("Fecha Nro: "+this.getFecha()+" Dia: "+this.getDateMatch());
		local.printTeam();
		visitante.printTeam();
	}

	public TeamRepository getLocal() {
		return local;
	}

	public void setLocal(TeamRepository local) {
		this.local = local;
	}

	public TeamRepository getVisitante() {
		return visitante;
	}

	public void setVisitante(TeamRepository visitante) {
		this.visitante = visitante;
	}

	public int getFecha() {
		return nroFecha;
	}

	
	private void setFecha(int fecha) {
		this.nroFecha = fecha;
	}

	public Date getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(Date dateMatch) {
		this.dateMatch = dateMatch;
	}
}
