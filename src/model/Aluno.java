package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Aluno.Status;
import util.Contador;

public class Aluno extends Pessoa{
	
	public enum Status{
		CADASTRADO,
		EXCLUÍDO
	}
	
	private Integer id;
	private Double notaFinalCurso;
	private Status status;
	
	public Aluno(String nome, String telefone, int diaNascimento, int mesNascimento,int anoNascimento, Double notaFinalCurso) {
		super(nome, telefone, diaNascimento, mesNascimento, anoNascimento);
		this.id = Contador.proximoId();
		this.notaFinalCurso = notaFinalCurso;
		this.status = Status.CADASTRADO;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getNotaFinalCurso() {
		return notaFinalCurso;
	}

	public void setNotaFinalCurso(Double notaFinalCurso) {
		this.notaFinalCurso = notaFinalCurso;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Aluno [Nota Final do Curso: " + notaFinalCurso + ", ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone
				+ ", Data de Nascimento: " + diaNascimento + "/" + mesNascimento + "/"
				+ anoNascimento + LocalDate.now()+ "]";
	}
	
	
}
