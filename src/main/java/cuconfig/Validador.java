/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuconfig;

/**
 *
 * @author caarl
 */
import java.util.ArrayList;
import java.util.List;

public class Validador {
    public List<String> validarConfiguracion(ConfiguracionCorreo config) {
        List<String> errores = new ArrayList<>();

        if (config.getServidorSMTP() == null || config.getServidorSMTP().isEmpty()) {
            errores.add("El servidor SMTP no puede estar vacío");
        }

        if (config.getPuerto() <= 0 || config.getPuerto() > 65535) {
            errores.add("El puerto debe estar entre 1 y 65535");
        }

        if (config.getUsuario() == null || config.getUsuario().isEmpty()) {
            errores.add("El usuario no puede estar vacío");
        }

        if (config.getContrasena() == null || config.getContrasena().isEmpty()) {
            errores.add("La contraseña no puede estar vacía");
        }

        if (config.getProtocolo() == null || config.getProtocolo().isEmpty()) {
            errores.add("El protocolo no puede estar vacío");
        }

        return errores;
    }
}