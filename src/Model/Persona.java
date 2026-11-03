package Model;

/**
 * Datos de una Persona
 */
public class Persona {
    private String nombre;
    private Rut rut;
    private Double edad;
    private Direccion direccion;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }

    /**
     * Constructor completo
     * @param nombre Nombre
     * @param rut Rut
     * @param edad Edad
     * @param direccion Dirección
     */
    public Persona(String nombre, Rut rut, Double edad, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.direccion = direccion;
    }

    /**
     * Getter del nombre
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del Rut
     * @return Rut
     */
    public Rut getRut() {
        return rut;
    }

    /**
     * Setter del Rut
     * @param rut Nuevo rut
     */
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /**
     * Getter de la edad
     * @return Edad
     */
    public Double getEdad() {
        return edad;
    }

    /**
     * Setter de la edad
     * @param edad Nueva edad
     */
    public void setEdad(Double edad) {
        this.edad = edad;
    }

    /**
     * Getter de la dirección
     * @return Dirección
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Setter de la dirección
     * @param direccion Nueva dirección
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut=" + rut +
                ", edad=" + edad +
                ", direccion=" + direccion +
                '}';
    }
}
