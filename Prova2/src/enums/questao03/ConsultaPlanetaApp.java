package enums.questao03;

import java.util.Scanner;

public class ConsultaPlanetaApp 
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu peso: ");
		double pesoTerra = teclado.nextDouble();
        double massa = pesoTerra / Planeta.TERRA.getGravidade();
        for (Planeta planeta: Planeta.values())
        {  System.out.printf("Seu pesos em %s eh %f%n", planeta, planeta.getPesoSuperficie(massa));
        }
        teclado.close();
    }
}
