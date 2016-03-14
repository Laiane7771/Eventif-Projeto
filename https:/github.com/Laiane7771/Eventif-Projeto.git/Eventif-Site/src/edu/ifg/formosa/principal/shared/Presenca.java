package edu.ifg.formosa.principal.shared;

import java.sql.Time;

public class Presenca {
	
	private int idPresenca;
	private Time hora_saida;
	private Time hora_Entrada;
	private int idParticipante;
	private int idAtividade;
	
	
	public int getIdPresenca() {
		return idPresenca;
	}
	public void setIdPresenca(int idPresenca) {
		this.idPresenca = idPresenca;
	}
	public Time getHora_saida() {
		return hora_saida;
	}
	public void setHora_saida(Time hora_saida) {
		this.hora_saida = hora_saida;
	}
	public Time getHora_Entrada() {
		return hora_Entrada;
	}
	public void setHora_Entrada(Time hora_Entrada) {
		this.hora_Entrada = hora_Entrada;
	}
	public int getIdParticipante() {
		return idParticipante;
	}
	public void setIdParticipante(int idParticipante) {
		this.idParticipante = idParticipante;
	}
	public int getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(int idAtividade) {
		this.idAtividade = idAtividade;
	}
	
	

}
