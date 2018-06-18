package questao03;

public class DataInvalidaException extends Exception 
{	private static final long serialVersionUID = 1L;

	public DataInvalidaException()
	{	super("Os parametros fornecidos nao representam uma data valida");	
	}
}
