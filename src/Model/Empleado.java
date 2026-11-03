package Model;

/**
 * Empleado salariado
 */
public class Empleado extends Persona {
    private Double salario;

    /**
     * Constructor por defecto
     */
    public Empleado() {
    }

    /**
     * Constructor completo
     * @param nombre Nombre completo
     * @param rut Rut
     * @param edad Edad
     * @param direccion Dirección de vivienda
     * @param salario Salario mensual
     */
    public Empleado(String nombre, Rut rut, Double edad, Direccion direccion, Double salario) {
        super(nombre, rut, edad, direccion);
        this.salario = salario;
    }

    /**
     * Constructor que recibe una persona
     * @param persona Datos genéricos del empleado
     * @param salario Salario mensual
     */
    public Empleado(Persona persona, Double salario) {
        super(persona.getNombre(), persona.getRut(), persona.getEdad(), persona.getDireccion());
        this.salario = salario;
    }

    /**
     * Getter del salario
     * @return Salario mensual
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * Setter del salario
     * @param salario Nuevo salario mensual
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                '}';
    }
}
