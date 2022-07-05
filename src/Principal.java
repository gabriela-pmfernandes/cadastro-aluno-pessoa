import java.util.Scanner;

import model.Aluno;
import model.Pessoa;
import service.AlunoService;
import service.PessoaService;
import util.Menu;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		AlunoService alunoService = new AlunoService(entrada);
		PessoaService pessoaService = new PessoaService(entrada);
		boolean continua = true;
		do {
			Menu.bemVindo();
			Menu.selecionar();
			int identificacao = entrada.nextInt();
				
			if(identificacao == 1) {
				Menu.cadastroPessoa();
				int opcaoEscolhidaPessoa = entrada.nextInt();
				if(opcaoEscolhidaPessoa == 1) {
					pessoaService.cadastrarPessoa();
				}else if(opcaoEscolhidaPessoa == 2) {
					pessoaService.mostrarTodos();
				}else if(opcaoEscolhidaPessoa == 3) {
					System.out.println("Digite o ID de qual pessoa você quer atualizar: ");
					pessoaService.mostrarTodos();
					int buscaPorIdPessoa = entrada.nextInt();
					Pessoa pessoa = pessoaService.buscarPessoaPorId(buscaPorIdPessoa);
				}else if(opcaoEscolhidaPessoa == 4) {
					pessoaService.mostrarTodos();
					Pessoa pessoa = pessoaService.buscarPessoaPorId(opcaoEscolhidaPessoa);
				}
			}else if(identificacao == 2) {
				Menu.cadastroAluno();
				int opcaoEscolhidaAluno = entrada.nextInt();
				if(opcaoEscolhidaAluno == 1) {
					alunoService.cadastrarAluno();
				}else if(opcaoEscolhidaAluno == 2) {
					alunoService.mostrarTodos();
				}else if(opcaoEscolhidaAluno == 3) {
					entrada.nextLine();
					System.out.println("Digite o ID de qual aluno você quer atualizar: ");
					alunoService.mostrarTodos();
					int buscaPorIdAluno = entrada.nextInt();
					Aluno aluno = alunoService.buscarAlunoPorId(buscaPorIdAluno);
					alunoService.excluirAluno(buscaPorIdAluno);
					alunoService.cadastrarAluno();
				}else if(opcaoEscolhidaAluno == 4) {
					entrada.nextLine();
					System.out.println("Digite o ID que você quer atualizar: ");
					alunoService.mostrarTodos();
					int idAlunoExcluir = entrada.nextInt();
					Aluno aluno = alunoService.buscarAlunoPorId(idAlunoExcluir);
					alunoService.excluirAluno(idAlunoExcluir);
				}
			}else if(identificacao == 0) {
				continua = false;
			}
		}while(continua);
		alunoService.mostrarTodos();
		pessoaService.mostrarTodos();
	}
}
