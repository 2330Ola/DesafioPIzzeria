package pizzeria.pizzas;

import pizzeria.Pizza;

public class PizzaNuevaYork extends Pizza {
    private String estiloCorte;

    public PizzaNuevaYork(String nombre, String tamaño, double precio, String estiloCorte) {
        super(nombre, tamaño, precio);
        this.estiloCorte = estiloCorte;
    }

    public String getEstiloCorte() {
        return estiloCorte;
    }
}
