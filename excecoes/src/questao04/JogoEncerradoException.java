package questao04;

public class JogoEncerradoException extends Exception
{	private static final long serialVersionUID = 1L;

	public JogoEncerradoException()
	{	super("Nao eh permitido tentar mais palpites, o jogo esta encerrado");	
	}
}
