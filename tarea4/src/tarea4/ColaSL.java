package tarea4;

public class ColaSL {

    private int max = 50;
    private Linea v[] = new Linea[max + 1];
    private int ini, fin;

    ColaSL() {
        ini = fin = 0;
    }

    boolean esvacia() {
        if (ini == 0 && fin == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (fin == max) {
            return (true);
        }
        return (false);
    }

    int nroelem() {
        return (fin - ini);
    }

    void adicionar(Linea elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Linea eliminar() {
        Linea elem = null;
        if (!esvacia()) {
            ini++;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola Simple vacia");
        }
        return (elem);
    }

    void mostrar() {
        Linea elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Lineas de la Cola ");

            ColaSL aux = new ColaSL();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();

                adicionar(elem);
            }
        }
    }

    void vaciar(ColaSL a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }
}
