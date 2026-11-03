import Model.Direccion;
import Model.Empleado;
import Model.Persona;
import Model.Rut;

void ImprimirDireccion(Direccion direccion) {
    System.out.println("Direccion: ");
    System.out.println("\tComuna: " + direccion.getComuna());
    System.out.println("\tCiudad: " + direccion.getCiudad());
    System.out.println("\tCalle: " + direccion.getCalle());
    System.out.println("\tNumero: " + direccion.getNumero());
}

void ImprimirPersona(Persona persona) {
    System.out.println("Persona: ");
    System.out.println("\tNombre: " + persona.getNombre());
    System.out.println("\tRut: " + persona.getRut());
    System.out.println("\tEdad: " + persona.getEdad());
    ImprimirDireccion(persona.getDireccion());
}

void ImprimirEmpleado(Empleado empleado) {
    System.out.println("Empleado: ");
    System.out.println("\tSalario: " + empleado.getSalario());
    ImprimirPersona(empleado);
}

/**
 * Punto de Entrada a App Llanquihue Tour
 */
void main() {
    Direccion direccion1 = new Direccion("Valparaíso", "Viña del Mar", "Av. Valparaíso", 72);
    Direccion direccion2 = new Direccion("Valparaíso", "Quilpué", "Calle 4", 102);

    Persona persona1 = new Persona("Pepe", new Rut("12345678-9"), 36.0, direccion1);
    Persona persona2 = new Persona("Juan", new Rut("12345679-k"), 28.6, direccion2);

    Empleado empleado1 = new Empleado(persona2, 450_000.0);

    //
    // Imprimir ambos
    //

    System.out.println();
    System.out.println("=== Persona ===");
    System.out.println();
    ImprimirPersona(persona1);

    System.out.println();
    System.out.println("=== Empleado ===");
    System.out.println();
    ImprimirEmpleado(empleado1);
}
