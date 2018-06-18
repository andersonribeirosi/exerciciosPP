package enums.questao04;

public class Backup 
{	
	private long tamanho;
	
	public Backup(long tamanho) 
	{	this.tamanho = tamanho;
	}

	public double getQtdMidiasNecessarias(MidiaOptica midia) 
	{	return (double) tamanho / midia.getCapacidade();
	}
}
