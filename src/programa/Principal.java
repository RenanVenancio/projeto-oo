package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Funcionario;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<>();
		List<Funcionario> funcionarios = new ArrayList<>();

		int op = -1;
		while (op != 0) {

			System.out.println("Selecione uma opção:\n " + "1>Cadastrar aluno\n " + "2>Cadastrar funcionário\n"
					+ "3>Listar Alunos\n" + "4>Listar Funcionários\n" + "0>Sair\n");
			
			op = sc.nextInt();


			switch (op) {
			case 1:
				try {
					System.out.println("Cadastro de aluno:");
					System.out.println("Nome: ");
					String nome = sc.next();
					System.out.println("CPF: ");
					String cpf = sc.next();
					System.out.println("Endereço: ");
					String endereco = sc.next();
					System.out.println("Cidade: ");
					String cidade = sc.next();
					System.out.println("Matricula: ");
					Integer matricula = Integer.parseInt(sc.next());
					System.out.println("Curso: ");
					String curso = sc.next();
					System.out.println("Turno: ");
					String turno = sc.next();
					System.out.println("Periodo: ");
					Integer periodo = Integer.parseInt(sc.next());

					Aluno a = new Aluno(nome, cpf, endereco, cidade, matricula, curso, turno, periodo);
					alunos.add(a);

				} catch (Exception e) {
					System.out.println("O dado informado não é válido.\n");
				}

				break;

			case 2:
				try {
					System.out.println("Cadastro de Funcionário:");
					System.out.println("Cadastro de aluno:");
					System.out.println("Nome: ");
					String nome = sc.next();
					System.out.println("CPF: ");
					String cpf = sc.next();
					System.out.println("Endereço: ");
					String endereco = sc.next();
					System.out.println("Cidade: ");
					String cidade = sc.next();
					System.out.println("Setor: ");
					String setor = sc.next();
					System.out.println("salario: ");
					Double salario = Double.parseDouble(sc.next());
					System.out.println("Possui necessicades especiais?: ");
					Boolean necessidadesEspeciais = sc.next().toLowerCase().equals("sim") ? true : false;
					

					Funcionario f = new Funcionario(nome, cpf, endereco, cidade, setor, salario, necessidadesEspeciais);

					funcionarios.add(f);
				} catch (Exception e) {
					System.out.println("O dado informado não é válido.\n");
				}
				
				break;

			case 3:
				System.out.println("Lista de Alunos:");

				for (Aluno a : alunos) {
					System.out.println(a);
				}

				break;
				
			case 4:
				System.out.println("Lista de Funcionários:");

				for (Funcionario f : funcionarios) {
					System.out.println(f);
				}

				break;
			
			default:
				
			}
		}
		sc.close();

	}

}
