package tarea1;

import java.util.Vector;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void main(String[] args) {
        Vector<String> A = new Vector<>();

        Vector<String> B = new Vector<>();
        int N = Leer.datoInt();
        llenado(A, N);
        System.out.println(A);
        System.out.println(A.size() + " " + A.firstElement() + " " + A.lastElement());
        System.out.println(A.contains("w"));
        A.insertElementAt("H", 2);
        System.out.println(A);
        
        
    }

    public static void llenado(Vector v, int n) {
        for (int i = 1; i <= n; i++) {
            v.addElement(Leer.dato());
        }
    }
}
