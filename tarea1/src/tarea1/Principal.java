package tarea1;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in); 
        
        // vectar A
        Vector<String> A = new Vector<>();        
        int N = Leer.nextInt();
        for (int i = 1; i <= N; i++) {
            A.addElement(Leer.next());
        }
        
        // vector B
        Vector<String> B = new Vector<>();
        N = Leer.nextInt();
        for (int i = 1; i <= N; i++) {
            B.addElement(Leer.next());
        }
        
        System.out.println(A);
        System.out.println(B);
        
        System.out.println(A.size() + " " + A.firstElement() + " " + A.lastElement());
        System.out.println(A.contains("w"));
        A.insertElementAt("H", 2);
        
        // 1
        
    }

    public static void llenado(Vector v, int n) {
        Scanner Leer = new Scanner(System.in); 
        for (int i = 1; i <= n; i++) {
            v.addElement(Leer.next());
        }
    }
}
