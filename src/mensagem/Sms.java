package mensagem;

import javax.swing.JOptionPane;

public class Sms implements Mensagem {

	@Override
	public void enviarMensagem(String msg) {
		JOptionPane.showMessageDialog(null ,"SMS: "+ msg);		
	}
	
}
