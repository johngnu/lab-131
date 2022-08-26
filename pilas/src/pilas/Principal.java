package pilas;

public class Principal {

    public static void main(String[] args) {
        
        // TODO code application logic here
        PilaEstudiante A = new PilaEstudiante();
        Estudiante e1 = new Estudiante(11, "juan", "perez", "loza");
        Estudiante e2 = new Estudiante(22, "maria", "perez", "loza");
        Estudiante e3 = new Estudiante(55, "luis", "perez", "loza");
        Estudiante e4 = new Estudiante(33, "ama", "perez", "loza");
        Estudiante e5 = new Estudiante(88, "diana", "dina", "lei");
        
        A.adicionar(e1);
        A.adicionar(e2);
        A.adicionar(e3);
        A.adicionar(e4);
        A.adicionar(e5);
        A.mostrar();

        PilaInforme B = new PilaInforme();
        Informe i1 = new Informe(1, 11, 2);
        Informe i2 = new Informe(1, 33, 2);
        Informe i3 = new Informe(1, 55, 2);
        Informe i4 = new Informe(2, 11, 2);
        Informe i5 = new Informe(2, 55, 2);
        Informe i6 = new Informe(5, 11, 2);
        Informe i7 = new Informe(1, 22, 2);
        Informe i8 = new Informe(4, 11, 2);
        
        B.adicionar(i1);
        B.adicionar(i2);
        B.adicionar(i3);
        B.adicionar(i4);
        B.adicionar(i5);
        B.adicionar(i6);
        B.adicionar(i7);
        B.adicionar(i8);
        B.mostrar();

        /// MOSTRAR A LOS ESTUDIANES  QUE NO TIENEN INFORMES
        System.out.println("+++++++++++ejercicio 1++++++++++++++++++");
        ejer1(A, B);
        // EJERICIOS
        // CONTAR LOS INFORMES NROX      
        System.out.println("+++++++++++ejercicio 2++++++++++++++++++");
        contar(B, 2);
        /// MOSTRAR LOS DATOS DEL ESTUDIANTE CON CI X
        System.out.println("+++++++++++ejercicio 3++++++++++++++++++");
        mostrarEstciX(A, 55);
        ///MOSTRAR LOS INFORMES  DEL ESTUDIANE CON CI X
        System.out.println("+++++++++++ejercicio 4++++++++++++++++++");
        infEsCIx(A, B, 33);
    }

    public static void ejer1(PilaEstudiante a, PilaInforme b) {
        PilaEstudiante auxE = new PilaEstudiante();
        PilaInforme auxI = new PilaInforme();
        while (!a.esvacia()) {
            Estudiante ex = a.eliminar();

            boolean sw = false;
            while (!b.esvacia()) {
                Informe ix = b.eliminar();

                if (ex.getCi() == ix.getCi()) {
                    sw = true;
                }
                auxI.adicionar(ix);
            }
            b.vaciar(auxI);
            if (!sw) {
                ex.mostrarEstudiante();
            }
            auxE.adicionar(ex);

        }
        a.vaciar(auxE);
    }

    public static void contar(PilaInforme a, int x) {
        int cont = 0;
        PilaInforme aux = new PilaInforme();
        while (!a.esvacia()) {
            Informe i = a.eliminar();
            aux.adicionar(i);
            if (i.getNro() == x) {
                cont++;
            }
        }
        System.out.println("nro de informes de tipo " + x + " es :" + cont);
        a.vaciar(aux);
    }

    public static void mostrarEstciX(PilaEstudiante a, int c) {
        PilaEstudiante aux = new PilaEstudiante();
        while (!a.esvacia()) {
            Estudiante e = a.eliminar();
            aux.adicionar(e);
            if (e.getCi() == c) {
                e.mostrarEstudiante();
            } else {
                System.out.println(" no existe estudinate con ci " + c);
            }
        }

        a.vaciar(aux);
    }
    
    /// MOSTRAR LOS INFORMES  DEL ESTUDIANE CON CI X

    public static void infEsCIx(PilaEstudiante a, PilaInforme b, int c) {
        PilaEstudiante auxe = new PilaEstudiante();
        PilaInforme auxi = new PilaInforme();
        while (!a.esvacia()) {
            Estudiante e = a.eliminar();
            auxe.adicionar(e);
            if (e.getCi() == c) {
                while (!b.esvacia()) {
                    Informe i = b.eliminar();
                    auxi.adicionar(i);
                    if (i.getCi() == c) {
                        a.mostrar();
                        i.mostrarInforme();
                    } else {

                        System.out.println(" el estudiante con " + c + " no tiene informes");
                    }
                }

                b.vaciar(auxi);
            } else {
                System.out.println(" no existe estudinate con ci " + c);
            }
        }
        a.vaciar(auxe);
    }

}
