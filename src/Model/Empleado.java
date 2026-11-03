package Model;

public class Empleado extends Persona {
    private Double salario;

    public Empleado() {
    }

    public Empleado(String nombre, Rut rut, Double edad, Direccion direccion, Double salario) {
        super(nombre, rut, edad, direccion);
        this.salario = salario;
    }

    public Empleado(Persona persona, Double salario) {
        super(persona.getNombre(), persona.getRut(), persona.getEdad(), persona.getDireccion());
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

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
