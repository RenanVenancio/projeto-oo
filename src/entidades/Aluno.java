package entidades;

public class Aluno extends Pessoa {

	private Integer matricula;
	private String curso;
	private String turno;
	private Integer periodo;

	public Aluno(String nome, String cpf, String endereco, String cidade, Integer matricula, String curso, String turno,
			Integer periodo) {
		super(nome, cpf, endereco, cidade);
		this.matricula = matricula;
		this.curso = curso;
		this.turno = turno;
		this.periodo = periodo;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + ", turno=" + turno + ", periodo=" + periodo + "]";
	}

}
