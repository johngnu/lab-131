package pilas;

public class Estudiante {

    private int ci;
    private String mat, pat, nom;

    public Estudiante(int ci, String mat, String pat, String nom) {
        this.ci = ci;
        this.mat = mat;
        this.pat = pat;
        this.nom = nom;
    }

    public void mostrarEstudiante() {
        System.out.println(" ci " + ci + ", nombre: " + nom + ", paterno: " + pat + ", materno: " + mat);

    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
