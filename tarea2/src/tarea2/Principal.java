package tarea2;

import java.util.Stack;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void vaciar(Stack<String> a, Stack<String> b) {
        while (!b.empty()) {
            a.push(b.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> A = new Stack<>();
        A.push("aaaa");
        A.push("bbb");
        A.push("ccc");
        A.push("axxx");
        A.push("ddd");
        A.push("zzz");

        System.out.println(A);
        contarCadenas(A);
        
        Stack<String> C = new Stack<>();
        //vaciar(C, A);
        System.out.println(C);
        System.out.println(A);
    }

    public static void contarCadenas(Stack<String> A) {
        Stack<String> aux = new Stack<>();
        //vaciar(aux, A);
        int c=0;
        while (!A.empty()) {
            String s = A.pop();
            if(s.charAt(0) == 'a' || s.charAt(0) == 'A') {
                c++;
            }
            aux.push(s);
        }
        vaciar(A, aux);
        System.out.println("cadenas que empiezan con 'A' son: " + c);
    }

}
