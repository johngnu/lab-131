package colas;

public class Facultad {

    private int id;
    private String nomFac;

    public Facultad() {
    }

    public Facultad(int id, String nomFac) {
        this.id = id;
        this.nomFac = nomFac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomFac() {
        return nomFac;
    }

    public void setNomFac(String nomFac) {
        this.nomFac = nomFac;
    }

    void mostrar() {
        System.out.println("ID: " + id + " NOMBRE DE FACULTAD: " + nomFac);
    }

}
