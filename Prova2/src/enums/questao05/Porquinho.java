package enums.questao05;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Porquinho extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private static final int LARGURA = 750;
	private static final int ALTURA = 140;
	public static final NumberFormat formatador = NumberFormat.getCurrencyInstance();
	
	private double total;
	private JLabel totalLabel;
	
	
	public Porquinho() 
	{	super("Porquinho");
		setLocationRelativeTo(null);
		setSize(LARGURA, ALTURA);
		centreWindow();
		setLayout(new BorderLayout());
		JPanel painelMoedas = new JPanel();
		painelMoedas.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(painelMoedas, BorderLayout.CENTER);
		for (Moeda moeda : Moeda.values())
		{	BotaoMoeda botao = new BotaoMoeda(moeda);
			botao.addActionListener(this);
			painelMoedas.add(botao);
		}
		JPanel painelTotal = new JPanel();
		painelTotal.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(painelTotal, BorderLayout.SOUTH);
		totalLabel = new JLabel(formatador.format(total));
		painelTotal.add(totalLabel);
	}
	
	public void actionPerformed(ActionEvent evento) 
	{	BotaoMoeda botaoMoeda = (BotaoMoeda) evento.getSource();
		total += botaoMoeda.getMoeda().getValor();
		totalLabel.setText(formatador.format(total));
	}
	
	public void centreWindow() {
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    setLocation(x, y);
	}
	
	public static void main(String[] args) 
	{	Porquinho maquina = new Porquinho();
		maquina.setVisible(true);
	}
}

class BotaoMoeda extends JButton
{
	private static final long serialVersionUID = 1L;
	private Moeda moeda;
	
	public BotaoMoeda(Moeda moeda)
	{	super(Porquinho.formatador.format(moeda.getValor()), new ImageIcon(moeda.getArquivo()));
		this.moeda = moeda; 
	}
	
	public Moeda getMoeda() 
	{	return moeda;
	}
}
