package enums.questao02;

import java.util.Scanner;

public class DiaDaSemanaApp 
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite dia: ");
		int dia = teclado.nextInt();
		System.out.print("Digite mes: ");
		int mes = teclado.nextInt();
		System.out.print("Digite ano: ");
		int ano = teclado.nextInt();
		Data data = new Data(dia, mes, ano);
		DiaDaSemana diaDaSemana = data.getDiaDaSemana();
		System.out.println("Dia da semana: " + diaDaSemana.getNome());
		teclado.close();
	}
}
