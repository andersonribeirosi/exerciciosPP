package enums.questao05;

public enum Moeda
{	
	MOEDA_005(0.05, "images/moedas/me001rev.gif"), 
	MOEDA_010(0.10, "images/moedas/me010rev.gif"),
	MOEDA_025(0.25, "images/moedas/me025rev.gif"),
	MOEDA_050(0.50, "images/moedas/me050rev.gif"),
	MOEDA_100(1.00, "images/moedas/me100rev.gif");
	
	private double valor;
	private String arquivo;

	private Moeda(double valor, String arquivo)
	{	this.valor = valor;
		this.arquivo = arquivo;
	}
	
	public double getValor() 
	{	return valor;
	}
	
	public String getArquivo() 
	{	return arquivo;
	}
}
