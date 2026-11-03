package Model;

/**
 * Rol Único Tributario
 * Solo realiza un chequeo simple, que sea compuesto
 * solo de números, tenga un guión y termine en numero o K
 */
public class Rut {
    private String rut;

    /**
     * Constructor por defecto
     */
    public Rut() {
    }

    /**
     * Constructor completo
     * @param rut Rut
     */
    public Rut(String rut) {
        setRut(rut);
    }

    /**
     * Getter del rut
     * @return rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * Setter del rut
     * @param rut Nuevo rut
     */
    public void setRut(String rut) {
        if (!rut.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException("Rut Inválido");
        }
        this.rut = rut;
    }

    @Override
    public String toString() {
        return this.rut;
    }
}
