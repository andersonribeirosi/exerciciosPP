package questao05;

public class Avaliacao 
{	private static final double NOTA_MINIMA = 0.0;
	private static final double NOTA_MAXIMA = 10.0;
	private double nota1;
	private double nota2;
	
	public void setNota1(double nota1) throws NotaInvalidaException
	{	avaliaNota(nota1);
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) throws NotaInvalidaException
	{	avaliaNota(nota2);
		this.nota2 = nota2;
	}
	
	public double getMedia()
	{	return (nota1 + nota2) / 2;
	}
	
	public void avaliaNota(double nota) throws NotaInvalidaException
	{	if (nota < NOTA_MINIMA || NOTA_MAXIMA < nota)
		{	throw new NotaInvalidaException();
		}
	}
}
