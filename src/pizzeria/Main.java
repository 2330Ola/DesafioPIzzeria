package pizzeria;

import pizzeria.pizzas.PizzaNuevaYork;
import pizzeria.pizzas.PizzaChicago;
import pizzeria.sucursales.Sucursal;
import pizzeria.empleados.Empleado;
import pizzeria.equipos.Equipo;
import pizzeria.ingredientes.Masa;
import pizzeria.ingredientes.Salsa;
import pizzeria.ingredientes.Queso;
import pizzeria.ingredientes.Ingrediente;

public class Main {
    public static void main(String[] args) {
        // Crear una sucursal
        Sucursal sucursalNY = new Sucursal("Sucursal Nueva York", "123 Avenida Principal, NY");

        // Agregar empleados
        Empleado empleado1 = new Empleado("Josue Aguilar", "Cocinero", 3000);
        Empleado empleado2 = new Empleado("Julissa Salazar", "Mesera", 2000);
        sucursalNY.agregarEmpleado(empleado1);
        sucursalNY.agregarEmpleado(empleado2);

        // Agregar equipos
        Equipo horno = new Equipo("Horno", "Operativo");
        Equipo amasadora = new Equipo("Amasadora", "Operativo");
        sucursalNY.agregarEquipo(horno);
        sucursalNY.agregarEquipo(amasadora);

        // Agregar ingredientes
        Masa masaDelgada = new Masa("Delgada", 10);
        Salsa salsaTomate = new Salsa("Tomate", 5);
        Queso quesoMozzarella = new Queso("Mozzarella", 8);
        sucursalNY.agregarIngrediente(masaDelgada);
        sucursalNY.agregarIngrediente(salsaTomate);
        sucursalNY.agregarIngrediente(quesoMozzarella);

        // Crear pizzas
        PizzaNuevaYork pizzaNY = new PizzaNuevaYork("Pizza Nueva York", "Grande", 15.99, "Triangular");
        PizzaChicago pizzaChicago = new PizzaChicago("Pizza Chicago", "Mediana", 18.99, "Gruesa");

        // Agregar especialidades a la sucursal
        sucursalNY.agregarEspecialidad(pizzaNY);
        sucursalNY.agregarEspecialidad(pizzaChicago);

        // Preparar, hornear, cortar y empacar una pizza Nueva York
        pizzaNY.preparar();
        pizzaNY.hornear();
        pizzaNY.cortar();
        pizzaNY.empacar();

        // Preparar, hornear, cortar y empacar una pizza Chicago
        pizzaChicago.preparar();
        pizzaChicago.hornear();
        pizzaChicago.cortar();
        pizzaChicago.empacar();

        // Mostrar información de la sucursal y sus empleados
        System.out.println("Nombre de la sucursal: " + sucursalNY.getNombre());
        System.out.println("Dirección de la sucursal: " + sucursalNY.getDireccion());

        System.out.println("Empleados de la sucursal:");
        for (Empleado empleado : sucursalNY.getEmpleados()) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Puesto: " + empleado.getPuesto());
        }

        System.out.println("Equipos de la sucursal:");
        for (Equipo equipo : sucursalNY.getEquipos()) {
            System.out.println("Tipo: " + equipo.getTipo() + ", Estado: " + equipo.getEstado());
        }

        System.out.println("Ingredientes de la sucursal:");
        for (Ingrediente ingrediente : sucursalNY.getIngredientes()) {
            System.out.println("Nombre: " + ingrediente.obtenerNombre() + ", Cantidad: " + ingrediente.obtenerCantidad());
        }

        System.out.println("Especialidades de la sucursal:");
        for (Pizza pizza : sucursalNY.getEspecialidades()) {
            System.out.println("Nombre: " + pizza.getNombre() + ", Tamaño: " + pizza.getTamaño() + ", Precio: " + pizza.getPrecio());
        }
    }
}
