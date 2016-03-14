package edu.ifg.formosa.principal.shared;

public class Usuario {
	
	private int idUsuario;
	private String nomePessoa;
	private String cpf;
	private String rg;
	private String senha;
	private int idEnderecoPessoa; 
	private int idContatoPessoa;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdEnderecoPessoa() {
		return idEnderecoPessoa;
	}
	public void setIdEnderecoPessoa(int idEnderecoPessoa) {
		this.idEnderecoPessoa = idEnderecoPessoa;
	}
	public int getIdContatoPessoa() {
		return idContatoPessoa;
	}
	public void setIdContatoPessoa(int idContatoPessoa) {
		this.idContatoPessoa = idContatoPessoa;
	}
	
	

}
