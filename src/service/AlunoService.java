package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.Aluno;
import model.Pessoa;
import repository.RepositoryImplement;
import util.Contador;

public class AlunoService {
	Scanner entrada;
	public AlunoService(Scanner entrada) {
		this.entrada = entrada;
	}
	private RepositoryImplement<Integer, Aluno> repository = new RepositoryImplement<>();

	public void cadastrarAluno() {
		entrada.nextLine();
		
		System.out.println("Digite o nome do aluno: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o telefone do aluno: ");
		String telefone = entrada.nextLine();
		System.out.println("Digite o dia de nascimento do aluno: ");
		int diaNascimento = entrada.nextInt();
		System.out.println("Digite o mês de nascimento do aluno: ");
		int mesNascimento = entrada.nextInt();
		System.out.println("Digite o ano de nascimento do aluno: ");
		int anoNascimento = entrada.nextInt();
		System.out.println("Digite a nota final do curso: ");
		Double notaFinalCurso = entrada.nextDouble();
		
		Aluno aluno = new Aluno(nome, telefone, diaNascimento, mesNascimento, anoNascimento, notaFinalCurso, LocalDate.now());
		repository.salvar(aluno.getId(), aluno);
	}
	
	public void mostrarTodos() {
		for(Aluno aluno : repository.buscarTodos()) {
			System.out.println(aluno);
		}
	}
	
	public Aluno buscarAlunoPorId(Integer id) {
		List<Aluno> alunos = this.repository.buscarTodos();
		Aluno aluno = alunos.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
		repository.excluir(id);
		return this.repository.buscaPorId(id);
	}
	public void excluirAluno(Integer id) {
		Aluno aluno = this.repository.buscaPorId(id);
		
	}
	
}
