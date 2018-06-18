package enums.questao04;

import java.util.Scanner;

public class DeterminaQuantidadeMidiasApp 
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o tamanho do arquivo: ");
		long tamanho = Long.parseLong(teclado.nextLine());
		Backup backup = new Backup(tamanho);
		MidiaOptica[] midias = MidiaOptica.values();
		StringBuilder opcoes = new StringBuilder();
		for (int i = 0; i < midias.length; i++) 
		{	opcoes.append(midias[i].name());
			if (i < midias.length - 1)
			{	opcoes.append(", ");
			}
		}
		System.out.print("Digite a midia (" + opcoes + "): ");
		MidiaOptica midia = MidiaOptica.valueOf(teclado.nextLine().toUpperCase());
        double quantidade = backup.getQtdMidiasNecessarias(midia);
        System.out.println("Serao necessarios " + quantidade + " " + midia.name().toLowerCase() + "s");
        teclado.close();
    }
}
