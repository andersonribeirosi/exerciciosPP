package questao07;

import java.util.Date;
import java.util.GregorianCalendar;

public class Alarme 
{	private static final int MINUTO_MINIMO = 0;
	private static final int MINUTO_MAXIMO = 59;
	private static final int HORA_MINIMA = 0;
	private static final int HORA_MAXIMA = 23;
	private int hora;
	private int minuto;
	
	public Alarme(int hora, int minuto) throws HoraInvalidaException, MinutoInvalidoException
	{	if (hora < HORA_MINIMA || HORA_MAXIMA < hora)
		{	throw new HoraInvalidaException("A hora digitada é inválida");
		}
		if (minuto < MINUTO_MINIMO || MINUTO_MAXIMO < minuto)
		{	throw new MinutoInvalidoException("O minuto digitado é inválido");
		}
		this.hora = hora;
		this.minuto = minuto;
	}

	public boolean isAgora()
	{	GregorianCalendar agora = new GregorianCalendar();
		agora.setTime(new Date());
		return this.hora == agora.get(GregorianCalendar.HOUR_OF_DAY) && this.minuto == agora.get(GregorianCalendar.MINUTE);
	}
}
