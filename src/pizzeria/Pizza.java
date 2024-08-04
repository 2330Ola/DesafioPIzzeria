package pizzeria;

public abstract class Pizza {
    private String nombre;
    private String tamaño;
    private double precio;

    public Pizza(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void preparar() {
        // Implementación del método preparar
    }

    public void hornear() {
        // Implementación del método hornear
    }

    public void cortar() {
        // Implementación del método cortar
    }

    public void empacar() {
        // Implementación del método empacar
    }
}
