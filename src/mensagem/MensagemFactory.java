package mensagem;

public class MensagemFactory {

	public static Mensagem getMensagem(String msgType) {
		if(msgType == "Sms") {
			return new Sms();
		}
		
		if(msgType == "Email") {
			return new Email();
		}
		return null;		
	}
	
}
