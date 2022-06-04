import javax.swing.*;
import java.awt.event.*;
public class NossoExemplo {
	NossoExemplo(){
		JFrame janela=new JFrame("Nosso exemplo diogenes");
		JButton bt=new JButton(new ImageIcon("encurtador.com.br/mrvCz")); //ou imagem em seu computador "D:\\imagem.png"
		bt.setBounds(100, 100, 100, 40);
		janela.add(bt);
		janela.setSize(300,400);
		janela.setLayout(null);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
	}
	public static void main(String[] args) {
		new NossoExemplo();
	}

}
