package pilas;

public class PilaEstudiante {

    private int max = 100;
    private Estudiante v[] = new Estudiante[max + 1];
    private int tope;

    PilaEstudiante() {
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

    void adicionar(Estudiante elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Estudiante eliminar() {
        Estudiante elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Estudiante elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaEstudiante aux = new PilaEstudiante();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrarEstudiante();
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();

                adicionar(elem);
            }
        }
    }

    void vaciar(PilaEstudiante a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }

}
