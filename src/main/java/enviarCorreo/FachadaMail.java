/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enviarCorreo;

import cuconfig.ArchivoConfiguracion;
import java.util.Properties;
/**
 *
 * @author ceria
 */
public class FachadaMail implements iMail {

    private Enviador enviador;
    private Correo correo;
    String rutaArchivo;
    public FachadaMail() {
        this.enviador = new Enviador();
        this.correo = new Correo();
    }

    @Override
    public void enviarCorreo(String destinatario, String contenido) throws Exception {
        // Validar el correo antes de enviarlo
        ArchivoConfiguracion archivo= new ArchivoConfiguracion(rutaArchivo); 
        if (correo.validar(destinatario)) {
            enviador.enviar(destinatario, contenido, archivo.leerConfiguracion());
        } else {
            throw new Exception("Correo inválido");
        }
    }
}
