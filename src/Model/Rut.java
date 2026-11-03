package Model;

public class Rut {
    private String rut;

    public Rut() {
    }

    public Rut(String rut) {
        setRut(rut);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (!rut.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException("Rut Invalido");
        }
        this.rut = rut;
    }

    @Override
    public String toString() {
        return this.rut;
    }
}
