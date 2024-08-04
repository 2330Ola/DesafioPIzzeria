package pizzeria.equipos;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void encender() {
        // Implementación del método encender
    }

    public void apagar() {
        // Implementación del método apagar
    }

    public void reparar() {
        // Implementación del método reparar
    }
}
