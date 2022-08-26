package tarea4;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        ColaSL A = new ColaSL();
        Linea l1 = new Linea(1, "a", "aa", "aaa");
        Linea l2 = new Linea(4, "b", "bb", "bbb");
        Linea l3 = new Linea(2, "c", "cc", "ccc");
        Linea l4 = new Linea(6, "d", "dd", "ddd");
        A.adicionar(l4);
        A.adicionar(l1);
        A.adicionar(l2);
        A.adicionar(l3);
        A.mostrar();

        ColaCM B = new ColaCM();
        Movil m1 = new Movil(1, "abc1", "c1", "juan");
        Movil m2 = new Movil(1, "abc2", "c2", "ana");
        Movil m3 = new Movil(4, "abc5", "c1", "maria");
        Movil m4 = new Movil(2, "abc7", "c4", "lucy");
        Movil m5 = new Movil(2, "abc3", "c1", "luis");
        Movil m6 = new Movil(2, "abc8", "c3", "rene");
        Movil m7 = new Movil(6, "abc9", "c4", "luis");
        B.adicionar(m7);
        B.adicionar(m6);
        B.adicionar(m5);
        B.adicionar(m4);
        B.adicionar(m3);
        B.adicionar(m2);
        B.adicionar(m1);
        B.mostrar();
        contar(A, B);
    }

    public static void contar(ColaSL a, ColaCM b) {
        ColaSL aa = new ColaSL();
        ColaCM bb = new ColaCM();
        while (!a.esvacia()) {
            Linea lx = a.eliminar();
            aa.adicionar(lx);
            int c = 0;
            while (!b.esvacia()) {
                Movil mx = b.eliminar();
                bb.adicionar(mx);
                if (mx.getNro() == lx.getNro()) {
                    c++;
                }
            }
            System.out.println(lx.getNro() + " --> " + c);
            b.vaciar(bb);

        }
        a.vaciar(aa);
    }

}
