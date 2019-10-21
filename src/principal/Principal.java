package principal;

import javax.swing.JOptionPane;

import mensagem.Mensagem;
import mensagem.MensagemFactory;
import mensagem.Sms;

public class Principal {

	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog(null);
		
		Mensagem mensagem = MensagemFactory.getMensagem(new Sms());
		mensagem.enviarMensagem(msg);
	}

}
