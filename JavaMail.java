package br.com.giullianomorroni.email;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.giullianomorroni.domain.entidade.Email;

/**
 * Classe de envio via smtp
 * @author giulliano
 *
 */
public class JavaMail {

  private static String mailSMTPServerPort = "25";
  private static String mailSMTPServer = "seu_dominio.com.br";
	private static String from = "noreply@seu_dominio.com.br";
	private static final Properties props = new Properties();
	private static Session session;

	static {
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", mailSMTPServer);
		props.put("mail.debug", "false");
		props.put("mail.smtp.port", mailSMTPServerPort);
		props.put("mail.smtp.socketFactory.port", mailSMTPServerPort);
		props.put("mail.smtp.socketFactory.fallback", "false");
		session = Session.getInstance(props);
		session.setDebug(false); // evita logging
	}

	public void enviarLinkParaAtivacaoAdministrador(String codigo, String nome, Email email) {
		try {
			File file = new File("/opt/giullianomorroni/modelo/validar_conta.html");
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			StringBuilder mensagem = new StringBuilder();
			while (reader.ready()) {
				String linha = reader.readLine();
				linha = linha.replace("${codigoValidacao}", codigo);
				linha = linha.replace("${nome}", nome);
				mensagem = mensagem.append(linha);
			}
			reader.close();
			fileReader.close();
			this.enviar("Boas vindas", mensagem.toString(), email.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void enviar(String subject, String message, String recipient) {
		session = Session.getInstance(props);
		Message msg;
		Transport tr;
		try {
			msg = new MimeMessage(session);
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
			msg.setFrom(new InternetAddress(from));
			msg.setSubject(subject);
			msg.setContent(message, "text/html");
			tr = session.getTransport("smtp");
			tr.connect();
			msg.saveChanges();
			tr.sendMessage(msg, msg.getAllRecipients());
			tr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
