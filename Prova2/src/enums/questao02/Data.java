package enums.questao02;
public class Data 
{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) 
	{	this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public DiaDaSemana getDiaDaSemana()
	{	return DiaDaSemana.SEGUNDA;
	}
	
	
}
