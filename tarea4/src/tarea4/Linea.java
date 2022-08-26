package tarea4;


public class Linea {

    private int nro;
    private String nombre, inicio, fin;

    Linea(int a, String b, String c, String d) {
        nro = a;
        nombre = b;
        inicio = c;
        fin = d;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public void mostrar() {
        System.out.print("<" + nro + " " + nombre + " " + inicio + " " + fin + "> ");
    }

}
