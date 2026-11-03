package Model;

public class Direccion {
    private String comuna;
    private String ciudad;
    private String calle;
    private Integer numero;

    public Direccion() {
    }

    public Direccion(String comuna, String ciudad, String calle, Integer numero) {
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

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
