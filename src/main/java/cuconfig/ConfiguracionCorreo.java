/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuconfig;

/**
 *
 * @author caarl
 */
public class ConfiguracionCorreo {
    private String servidorSMTP;
    private int puerto;
    private String usuario;
    private String contrasena;
    private boolean usarSSL;
    private String protocolo;

    // Constructor
    public ConfiguracionCorreo(String servidorSMTP, int puerto, String usuario, String contrasena, boolean usarSSL, String protocolo) {
        this.servidorSMTP = servidorSMTP;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.usarSSL = usarSSL;
        this.protocolo = protocolo;
    }

    // Getters y setters
    public String getServidorSMTP() {
        return servidorSMTP;
    }

    public void setServidorSMTP(String servidorSMTP) {
        this.servidorSMTP = servidorSMTP;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isUsarSSL() {
        return usarSSL;
    }

    public void setUsarSSL(boolean usarSSL) {
        this.usarSSL = usarSSL;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }
}