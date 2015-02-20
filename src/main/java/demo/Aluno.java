package demo;

public class Aluno {
	
	private String nome;
	private String ra;
	
	public Aluno(String nome, String ra) {
		this.nome = nome;
		this.ra = ra;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getRa(){
		return this.ra;
	}

}
