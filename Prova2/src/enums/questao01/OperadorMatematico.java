package enums.questao01;

public enum OperadorMatematico 
{
	SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO;
	
	public int getCalculo(int operador1, int operador2)
	{	int calculo = 0;
		switch (this) 
		{	case SOMA:
				calculo = operador1 + operador2;
				break;
			case SUBTRACAO:
				calculo = operador1 - operador2;
				break;
			case MULTIPLICACAO:
				calculo = operador1 * operador2;
				break;
			case DIVISAO:
				calculo = operador1 / operador2;
				break;	
		}
		return calculo;
	}
}
