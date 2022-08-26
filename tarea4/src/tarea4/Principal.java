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

        // ejer: 2
        ejer2(A, B, 1);
        
        // ejer: 4
        ejer4(A, B);
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

    public static void ejer2(ColaSL A, ColaCM B, int x) {
        Linea elem;
        if (A.esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Lineas de la Cola ");

            ColaSL aux = new ColaSL();
            while (!A.esvacia()) {
                elem = A.eliminar();
                aux.adicionar(elem);
                //elem.mostrar();
                if (elem.getNro() == x) {
                    elem.mostrar();
                    Movil melem;
                    if (B.esvacia()) {
                        System.out.println("Cola vacia xxx");
                    } else {
                        System.out.println("\n Moviles de la Cola ");
                        ColaCM maux = new ColaCM();
                        while (!B.esvacia()) {
                            melem = B.eliminar();
                            maux.adicionar(melem);
                            if (melem.getNro() == x) {
                                melem.mostrar();
                            }
                        }
                        while (!maux.esvacia()) {
                            melem = maux.eliminar();
                            B.adicionar(melem);
                        }
                    }
                }
            }
            System.out.println();
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                A.adicionar(elem);
            }
        }
    }

    public static void ejer4(ColaSL A, ColaCM B) {
        Linea elem;
        if (A.esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Lineas de la Cola ");

            ColaSL aux = new ColaSL();
            while (!A.esvacia()) {
                elem = A.eliminar();
                aux.adicionar(elem);

                //elem.mostrar();
                int c = 0;
                elem.mostrar();
                Movil melem;
                if (B.esvacia()) {
                    System.out.println("Cola vacia xxx");
                } else {
                    System.out.println("\n Moviles de la Cola ");
                    ColaCM maux = new ColaCM();
                    while (!B.esvacia()) {
                        melem = B.eliminar();
                        maux.adicionar(melem);
                        //melem.mostrar();
                        if (melem.getNro() == elem.getNro()) {
                            c++;
                        }
                    }
                    while (!maux.esvacia()) {
                        melem = maux.eliminar();
                        B.adicionar(melem);
                    }
                }
                System.out.println("Esta linea tiene : " + c + " moviles");
            }
            System.out.println();
            while (!aux.esvacia()) {
                elem = aux.eliminar();
                A.adicionar(elem);
            }
        }
    }

}
