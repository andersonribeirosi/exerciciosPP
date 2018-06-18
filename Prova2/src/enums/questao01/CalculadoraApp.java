package enums.questao01;
import java.util.Scanner;

public class CalculadoraApp 
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		OperadorMatematico[] operadores = OperadorMatematico.values();
		StringBuilder opcoes = new StringBuilder();
		for (int i = 0; i < operadores.length; i++) 
		{	opcoes.append(operadores[i].name());
			if (i < operadores.length - 1)
			{	opcoes.append(", ");
			}
		}
		System.out.print("Digite o operador (" + opcoes + "): ");
		OperadorMatematico operador = OperadorMatematico.valueOf(teclado.nextLine().toUpperCase());
		System.out.print("Digite o operador 1: ");
		int operador1 = Integer.parseInt(teclado.nextLine());
		System.out.print("Digite o operador 2: ");
		int operador2 = Integer.parseInt(teclado.nextLine());
		int resultado = operador.getCalculo(operador1, operador2);
		System.out.println("Resultado: " + resultado);
		teclado.close();
		
	}
}
