package questao05;

public class NotaInvalidaException extends Exception 
{	private static final long serialVersionUID = 1L;

	public NotaInvalidaException(String mensagem)
	{	super(mensagem);
	}
	
	public NotaInvalidaException()
	{	super("A nota deve estar no intervalo entre 0,0 e 10,0");
	}
}
