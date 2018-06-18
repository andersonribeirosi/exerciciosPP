package questao05;

import java.util.Scanner;

public class AvaliacaoApp
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		boolean notaOk;
		do
		{	try
			{	System.out.print("Digite nota do est�gio 1: ");
				avaliacao.setNota1(teclado.nextDouble());
				notaOk = true;
			} catch (NotaInvalidaException e)
			{	System.out.println(e.getMessage());
				notaOk = false;
			}
		} while (!notaOk);
		
		do
		{	try
			{	System.out.print("Digite nota do est�gio 2: ");
				avaliacao.setNota2(teclado.nextDouble());
				notaOk = true;
			} catch (NotaInvalidaException e)
			{	System.out.println(e.getMessage());
				notaOk = false;
			}	
		} while (!notaOk);	
		System.out.println("M�dia: " + avaliacao.getMedia());
		teclado.close();
	}
}
