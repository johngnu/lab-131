package colas;

public class CCircularC {

    private int max = 150;
    private Carrera v[] = new Carrera[max + 1];
    private int ini, fin;

    CCircularC() {
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

    void adicionar(Carrera elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }

    Carrera eliminar() {
        Carrera elem = null;
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
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\n CARRERAS de la Cola ");
            CCircularC aux = new CCircularC();
            while (!esvacia()) {
                Carrera elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }

    void vaciar(CCircularC a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
