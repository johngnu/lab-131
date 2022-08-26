package colas;

public class Carrera {

    private int idFac, nroEst;
    private String nomCar;

    void mostrar() {
        System.out.println("[" + idFac + " " + nomCar + " " + nroEst);
    }

    public Carrera(int idFac, int nroEst, String nomCar) {
        this.idFac = idFac;
        this.nroEst = nroEst;
        this.nomCar = nomCar;
    }

    public int getIdFac() {
        return idFac;
    }

    public void setIdFac(int idFac) {
        this.idFac = idFac;
    }

    public int getNroEst() {
        return nroEst;
    }

    public void setNroEst(int nroEst) {
        this.nroEst = nroEst;
    }

    public String getNomCar() {
        return nomCar;
    }

    public void setNomCar(String nomCar) {
        this.nomCar = nomCar;
    }

}
