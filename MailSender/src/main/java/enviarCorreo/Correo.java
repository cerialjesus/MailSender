/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enviarCorreo;

/**
 *
 * @author ceria
 */
public class Correo {
    public boolean validar(String destinatario) {
        if (destinatario == null || !destinatario.contains("@")) {
            System.out.println("Correo inválido");
            return false;
        }
        System.out.println("Correo válido");
        return true;
    }
}
