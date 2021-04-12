package clients.clients.products.application.mainmodule.dto;

public class ClientDto {

    private Long clientId;
    private String nombrecompleto;
    private Long dni;
    private String portInUse;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getPortInUse() {
        return portInUse;
    }

    public void setPortInUse(String portInUse) {
        this.portInUse = portInUse;
    }
}
