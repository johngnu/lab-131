
package tarea4;


public class Movil {

    private int nro;
    private String placa, color, conductor;

    Movil(int a, String b, String c, String d) {
        nro = a;
        placa = b;
        color = c;
        conductor = d;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public void mostrar() {
        System.out.print("[" + nro + " " + placa + " " + color + " " + conductor + "]");
    }

}
