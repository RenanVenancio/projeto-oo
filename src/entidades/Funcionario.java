package entidades;

public class Funcionario extends Pessoa {

	private String setor;
	private Double salario;
	private Boolean necessidadesEspeciais;

	public Funcionario(String nome, String cpf, String endereco, String cidade, String setor, Double salario,
			Boolean necessidadesEspeciais) {
		super(nome, cpf, endereco, cidade);
		this.setor = setor;
		this.salario = salario;
		this.necessidadesEspeciais = necessidadesEspeciais;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Boolean getNecessidadesEspeciais() {
		return necessidadesEspeciais;
	}

	public void setNecessidadesEspeciais(Boolean necessidadesEspeciais) {
		this.necessidadesEspeciais = necessidadesEspeciais;
	}

	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", salario=" + salario + ", necessidadesEspeciais="
				+ necessidadesEspeciais + "]";
	}

}
