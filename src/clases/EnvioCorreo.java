package clases;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnvioCorreo {

    public void CuentaBloqueada(String email) {
        String remitente = "farmaciaegph@gmail.com";
        String clave = "farm4321";
        String destino = email;
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", clave);
        
        Session session = Session.getDefaultInstance(props);
        MimeMessage mensaje = new MimeMessage(session);
        
        
        try {
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
            mensaje.setSubject("BLOQUEO DE CUENTA");
            mensaje.setText("Correo Bloqueado !Error¡");
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com",remitente, clave);
            transport.sendMessage(mensaje,mensaje.getAllRecipients());
            transport.close();
            System.out.println("Correo Enviado");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
