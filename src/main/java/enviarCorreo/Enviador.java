/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enviarCorreo;

/**
 *
 * @author ceria
 */
import cuconfig.ConfiguracionCorreo;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Enviador {

    public void enviar(String destinatario, String contenido, ConfiguracionCorreo conf) throws MessagingException {

        // Configurar propiedades del servidor de correo
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", conf.getServidorSMTP());
        props.put("mail.smtp.port", conf.getPuerto());
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(conf.getUsuario(), conf.getContrasena());
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(destinatario));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            message.setSubject("Asunto del Correo");
            message.setText(contenido);

            Transport.send(message);
            System.out.println("Correo enviado exitosamente.");
        } catch (MessagingException e) {
            System.out.println("Error al enviar el correo: " + e.getMessage());
            throw e;
        }
    }
}
