package questao04;

public class Forca 
{
	private static final int QTD_MAX_ERROS = 6;
    private char[] letrasSecretas;
    private char[] letrasPalpites;
    private int erros;
    private int acertos;

    public char[] getPalpites()
    {	return this.letrasPalpites;
    }

    public int getQtdErros() 
    {	return this.erros;
    }

    public boolean getGanhou() 
    {	return this.acertos == letrasSecretas.length;
    }

    public boolean getPerdeu() 
    {	return this.erros == QTD_MAX_ERROS;
    }

    public boolean getAcabou() 
	{	return this.getGanhou() || this.getPerdeu();
    }

    public Forca(String palavraSecreta)
    {   this.letrasSecretas = palavraSecreta.toUpperCase().toCharArray();
        this.letrasPalpites = new char[letrasSecretas.length];
        for (int i = 0; i < letrasSecretas.length; i++) 
        {	letrasPalpites[i] = '_';
        }
        this.erros = 0;
    }

    public void tentarPalpite(char letra) throws JogoEncerradoException 
    {	boolean acertou = false;
        for (int i = 0; i < this.letrasSecretas.length; i++) 
        {	char letraSecreta = this.letrasSecretas[i];
            if (letraSecreta == letra) 
            {	this.letrasPalpites[i] =  letraSecreta;
                acertou = true;
                acertos++;
            }
        }
        if (!acertou) 
        {	this.erros++;
        }
        if (getAcabou())
    	{	throw new JogoEncerradoException();
    	}
    }
}
