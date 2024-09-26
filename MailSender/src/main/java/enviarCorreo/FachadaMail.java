/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enviarCorreo;

/**
 *
 * @author ceria
 */
public class FachadaMail implements iMail {

    private Enviador enviador;
    private Correo correo;

    public FachadaMail() {
        this.enviador = new Enviador();
        this.correo = new Correo();
    }

    @Override
    public void enviarCorreo(String servidor, String destinatario, String contenido) throws Exception {
        // Validar el correo antes de enviarlo
        if (correo.validar(destinatario)) {
            enviador.enviar(servidor, destinatario, contenido);
        } else {
            throw new Exception("Correo inválido");
        }
    }
}
