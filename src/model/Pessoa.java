package model;

import java.time.LocalDate;

import util.Contador;

public class Pessoa {
	protected Integer id;
	protected String nome;
	protected String telefone;
	protected int diaNascimento;
	protected int mesNascimento;
	protected int anoNascimento;
	
	public Pessoa(String nome, String telefone, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.id = Contador.proximoId();
		this.nome = nome;
		this.telefone = telefone;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone + ", Data de Nascimento: " + diaNascimento
				+ "/" + mesNascimento + "/" + anoNascimento + LocalDate.now() +"]";
	}
	
	
	
}
