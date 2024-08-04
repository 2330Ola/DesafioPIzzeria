package pizzeria.pizzas;

import pizzeria.Pizza;

public class PizzaChicago extends Pizza {
    private String grosorMasa;

    public PizzaChicago(String nombre, String tamaño, double precio, String grosorMasa) {
        super(nombre, tamaño, precio);
        this.grosorMasa = grosorMasa;
    }

    public String getGrosorMasa() {
        return grosorMasa;
    }
}
