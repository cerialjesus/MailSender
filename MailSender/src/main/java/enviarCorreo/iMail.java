/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enviarCorreo;

/**
 *
 * @author ceria
 */
public interface iMail {
    void enviarCorreo(String servidor, String destinatario, String contenido) throws Exception;
}
