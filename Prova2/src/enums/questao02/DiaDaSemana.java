package enums.questao02;

public enum DiaDaSemana 
{
	DOMINGO("domingo"),
	SEGUNDA("segunda-feira"),
	TERCA("terca-feira"),
	QUARTA("quarta-feira"),
	QUINTA("quinta-feira"),
	SEXTA("sexta-feira"),
	SABADO("sabado");
	
	private String nome;

	private DiaDaSemana(String nome)
	{	this.nome = nome;
	}
	
	public String getNome() 
	{	return nome;
	}
}
