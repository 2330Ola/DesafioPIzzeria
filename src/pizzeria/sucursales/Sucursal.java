package pizzeria.sucursales;

import pizzeria.Pizza;
import pizzeria.empleados.Empleado;
import pizzeria.ingredientes.Ingrediente;
import pizzeria.equipos.Equipo;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Ingrediente> ingredientes;
    private List<Equipo> equipos;
    private List<Pizza> especialidades;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Pizza pizza) {
        especialidades.add(pizza);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Pizza> getEspecialidades() {
        return especialidades;
    }
}
