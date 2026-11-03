package Model;

/**
 * Dirección que representa una ubicación física.
 */
public class Direccion {
    private String comuna;
    private String ciudad;
    private String calle;
    private Integer numero;

    /**
     * Constructor por defecto
     */
    public Direccion() {
    }

    /**
     * Constructor completo
     * @param comuna Nombre de la comuna
     * @param ciudad Nombre de la ciudad
     * @param calle Nombre de la calle
     * @param numero Número de casa
     */
    public Direccion(String comuna, String ciudad, String calle, Integer numero) {
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    /**
     * Getter de la comuna
     * @return Comuna
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Setter de la comuna
     * @param comuna Nueva comuna
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Getter de la ciudad
     * @return Ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Setter de la ciudad
     * @param ciudad Nueva ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Getter del nombre de calle
     * @return Calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Setter del nombre de calle
     * @param calle Nueva calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Getter del número de casa
     * @return Número de casa
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Setter del número de casa
     * @param numero Nuevo número de casa
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "comuna='" + comuna + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                '}';
    }
}
