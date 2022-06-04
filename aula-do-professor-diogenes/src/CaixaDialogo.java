import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CaixaDialogo {
	private static JDialog dialogo;
	CaixaDialogo(){
		JFrame janela= new JFrame();
		dialogo = new JDialog(janela, "Exemplo de caixa de dialogo", true);
		dialogo.setLayout(new FlowLayout() );
		JButton botao = new JButton("ok");
		botao.addActionListener ( new ActionListener()
	{
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(janela, "Obrigado por continuar estudando.");
		CaixaDialogo.dialogo.setVisible(false);
	}
	});
	dialogo.add(new JLabel("Clique aqui"));
	dialogo.add(botao);
	dialogo.setSize(300,300);
	dialogo.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new CaixaDialogo();
	}
}
