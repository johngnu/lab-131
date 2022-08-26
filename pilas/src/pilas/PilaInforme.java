package pilas;

public class PilaInforme {

    private int max = 100;
    private Informe v[] = new Informe[max + 1];
    private int tope;

    PilaInforme() {
        tope = 0;
    }

    boolean esvacia() {
        if (tope == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (tope == max) {
            return (true);
        }
        return (false);
    }

    int nroelem() {
        return (tope);
    }

    void adicionar(Informe elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Informe eliminar() {
        Informe elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Informe elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaInforme aux = new PilaInforme();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrarInforme();
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();

                adicionar(elem);
            }
        }
    }

    void vaciar(PilaInforme a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

}
