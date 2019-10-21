package mensagem;

import javax.swing.JOptionPane;

public class Email implements Mensagem {
	
	public void enviarMensagem(String msg) {
		JOptionPane.showMessageDialog(null ,"E-mail: "+ msg);		
	}
	
}
