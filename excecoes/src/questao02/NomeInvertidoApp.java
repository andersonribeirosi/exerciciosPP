package questao02;

import java.util.Scanner;

public class NomeInvertidoApp 
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		boolean houverErro;
		do
		{	try
			{	System.out.print("Digite o seu nome: ");
				pessoa.setNome(teclado.nextLine());
				houverErro = false;	
			} catch (NomeInvalidoException nie)
			{	System.out.println(nie.getMessage());
				houverErro = true;
			}
			} while (houverErro);
		System.out.println("Nome invertido: " + pessoa.getNomeInvertido());
	 	teclado.close();
	}
}
