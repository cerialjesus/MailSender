/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuconfig;

/**
 *
 * @author caarl
 */
import java.io.*;
import java.util.Properties;

public class ArchivoConfiguracion {
    private String rutaArchivo;

    public ArchivoConfiguracion(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void guardarConfiguracion(ConfiguracionCorreo config) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("servidorSMTP", config.getServidorSMTP());
        prop.setProperty("puerto", String.valueOf(config.getPuerto()));
        prop.setProperty("usuario", config.getUsuario());
        prop.setProperty("contrasena", config.getContrasena());
        prop.setProperty("usarSSL", String.valueOf(config.isUsarSSL()));
        prop.setProperty("protocolo", config.getProtocolo());

        try (OutputStream output = new FileOutputStream(rutaArchivo)) {
            prop.store(output, "Configuración de correo");
        }
    }

    public ConfiguracionCorreo leerConfiguracion() throws IOException {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(rutaArchivo)) {
            prop.load(input);
        }

        return new ConfiguracionCorreo(
            prop.getProperty("servidorSMTP"),
            Integer.parseInt(prop.getProperty("puerto")),
            prop.getProperty("usuario"),
            prop.getProperty("contrasena"),
            Boolean.parseBoolean(prop.getProperty("usarSSL")),
            prop.getProperty("protocolo")
        );
    }
}