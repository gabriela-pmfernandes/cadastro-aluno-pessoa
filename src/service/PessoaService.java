package service;

import java.util.List;
import java.util.Scanner;

import model.Pessoa;
import repository.RepositoryImplement;

public class PessoaService {
	Scanner entrada;
	public PessoaService(Scanner entrada) {
		this.entrada = entrada;
	}
	private RepositoryImplement<Integer, Pessoa> repository = new RepositoryImplement<>();
	
	public void cadastrarPessoa() {
		entrada.nextLine();
		
		System.out.println("Digite o nome da pessoa: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o telefone da pessoa: ");
		String telefone = entrada.nextLine();
		System.out.println("Digite o dia de nascimento da pessoa: ");
		int diaNascimento = entrada.nextInt();
		System.out.println("Digite o mês de nascimento: ");
		int mesNascimento = entrada.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = entrada.nextInt();
		
		Pessoa pessoa = new Pessoa(nome, telefone, diaNascimento, mesNascimento, anoNascimento);
		repository.salvar(pessoa.getId(), pessoa);
	}
	
	public void mostrarTodos() {
		for(Pessoa pessoa : repository.buscarTodos()) {
			System.out.println(pessoa);
		}
	}
	
	public Pessoa buscarPessoaPorId(Integer id) {
		List<Pessoa> pessoas = this.repository.buscarTodos();
		Pessoa pessoa = pessoas.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
		repository.excluir(id);
		return this.repository.buscaPorId(id);
	}
	public void excluirPessoa(Integer id) {
		Pessoa pessoa = this.repository.buscaPorId(id);
	}
}
