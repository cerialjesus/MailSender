/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuconfig;

/**
 *
 * @author caarl
 */
import java.io.IOException;

public class GestorConfiguracion {
    private ConfiguracionCorreo configuracionActual;
    private ArchivoConfiguracion archivoConfig;

    public GestorConfiguracion(String rutaArchivo) {
        this.archivoConfig = new ArchivoConfiguracion(rutaArchivo);
        try {
            this.configuracionActual = archivoConfig.leerConfiguracion();
        } catch (IOException e) {
            // Si no se puede leer, crear una configuración por defecto
            this.configuracionActual = new ConfiguracionCorreo("", 0, "", "", false, "");
        }
    }

    public ConfiguracionCorreo obtenerConfiguracionActual() {
        return configuracionActual;
    }

    public void actualizarConfiguracion(ConfiguracionCorreo nuevaConfig) throws IOException {
        this.configuracionActual = nuevaConfig;
        archivoConfig.guardarConfiguracion(nuevaConfig);
    }
}