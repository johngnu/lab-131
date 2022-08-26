package colas;

public class CSimpleF {

    private int max = 15;
    private Facultad v[] = new Facultad[max + 1];
    private int ini, fin;

    CSimpleF() {
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

    void adicionar(Facultad elem) {
        if (!esllena()) {
            fin++;         //v[fin+1]=elem
            v[fin] = elem;  //fin=fin+1
        } else {
            System.out.println("Cola Simple llena");
        }
    }

    Facultad eliminar() {
        Facultad elem = null;
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
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n FACULTADES de la Cola ");
            CSimpleF aux = new CSimpleF();
            while (!esvacia()) {
                Facultad elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }

    void vaciar(CSimpleF a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }
}
