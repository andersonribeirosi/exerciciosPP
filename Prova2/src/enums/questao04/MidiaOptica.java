package enums.questao04;

public enum MidiaOptica 
{
	CD(700), DVD(4400), BLURAY(25600);

	private long capacidade;
	
	private MidiaOptica(long capacidade) 
	{	this.capacidade = capacidade;		
	}
	
	public long getCapacidade() 
	{	return capacidade;
	}
}
