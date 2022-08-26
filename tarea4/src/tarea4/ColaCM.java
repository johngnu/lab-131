package tarea4;

public class ColaCM {

    private int max = 100;
    private Movil v[] = new Movil[max + 1];
    private int ini, fin;

    ColaCM() {
        ini = fin = 0;
    }

    int nroelem() {
        return ((max + fin - ini) % max);
    }

    boolean esvacia() {
        if (nroelem() == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (nroelem() == max - 1) {
            return (true);
        }
        return (false);
    }

    void adicionar(Movil elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    Movil eliminar() {
        Movil elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (nroelem() == 0) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola circular vacia");
        }
        return (elem);
    }

    void mostrar() {
        Movil elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\n Moviles de la Cola ");
            ColaCM aux = new ColaCM();
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

    void vaciar(ColaCM a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }
}
