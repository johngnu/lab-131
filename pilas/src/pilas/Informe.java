package pilas;

public class Informe {

    private int nro, ci, nota;

    public Informe(int nro, int ci, int nota) {
        this.nro = nro;
        this.ci = ci;
        this.nota = nota;
    }

    public void mostrarInforme() {
        System.out.println(" ci " + ci + ", nro de informe: " + nro + ", nota: " + nota);

    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
