package colas;

public class Principal {

    public static void main(String[] args) {
        CSimpleF A = new CSimpleF();
        Facultad f1 = new Facultad(1, "Ciencias Puras y Naturales");
        Facultad f2 = new Facultad(2, "Economicas");
        Facultad f3 = new Facultad(5, "Medicina");
        Facultad f4 = new Facultad(3, "Derecho");
        Facultad f5 = new Facultad(4, "Ingenieria");

        A.adicionar(f1);
        A.adicionar(f2);
        A.adicionar(f3);
        A.adicionar(f4);
        A.adicionar(f5);
        A.mostrar();
        CCircularC B = new CCircularC();
        Carrera c1 = new Carrera(1, 23, "Informatica");
        Carrera c2 = new Carrera(2, 25, "Tecnologica");
        Carrera c3 = new Carrera(5, 23, "Matematica");
        Carrera c4 = new Carrera(1, 23, "Economia");
        Carrera c5 = new Carrera(5, 23, "Biologia");
        Carrera c6 = new Carrera(1, 23, "Informatica");
        Carrera c7 = new Carrera(1, 23, "Tecnologia medica");
        B.adicionar(c1);
        B.adicionar(c2);
        B.adicionar(c3);
        B.adicionar(c4);
        B.adicionar(c5);
        B.adicionar(c6);
        B.adicionar(c7);
        B.mostrar();
        System.out.println("******EJ#1*****");
        FacX(A, "Arquitectura");
        System.out.println("******EJ#2*****");
        Carreras(B, 23);
        System.out.println("******EJ#3*****");
        Fac_Carreras(A, B);
        System.out.println("******EJ#4*****");
        Fac_num(A, B);
        System.out.println("******EJ#5*****");
        MostrarC("Ciencias Puras y Naturales", B, A);
    }

    public static void FacX(CSimpleF a, String x) {
        CSimpleF aux = new CSimpleF();
        int sw = 0;
        while (!a.esvacia()) {
            Facultad fac = a.eliminar();
            if (fac.getNomFac().equals(x)) {
                System.out.println("Esta carrera " + x + " EXISTE.");
                aux.adicionar(fac);
                sw = 1;
            } else {
                aux.adicionar(fac);
            }
        }
        if (sw == 0) {
            System.out.println("Esta carrera " + x + " NO EXISTE.");
        }
        a.vaciar(aux);
    }

    public static void Carreras(CCircularC a, int b) {
        CCircularC aa = new CCircularC();
        int cont = 0;
        while (!a.esvacia()) {
            Carrera cx = a.eliminar();
            if (cx.getNroEst() > b) {
                cont++;
                aa.adicionar(cx);
            } else {
                aa.adicionar(cx);
            }
        }
        a.vaciar(aa);
        System.out.println(cont + " Tienen mas de " + b + " Estudiantes");
    }

    public static void Fac_Carreras(CSimpleF a, CCircularC b) {
        CSimpleF aa = new CSimpleF();
        while (!a.esvacia()) {
            Facultad fx = a.eliminar();
            System.out.println("\nFacultad: " + fx.getNomFac());
            aa.adicionar(fx);
            int n = b.nroelem();
            for (int i = 1; i <= n; i++) {
                Carrera cx = b.eliminar();
                if (fx.getId() == cx.getIdFac()) {
                    System.out.println("\t" + cx.getNomCar());
                }
                b.adicionar(cx);
            }
        }
        a.vaciar(aa);
    }

    public static void Fac_num(CSimpleF a, CCircularC b) {
        CSimpleF aa = new CSimpleF();
        while (!a.esvacia()) {
            Facultad fx = a.eliminar();
            System.out.println("\nFacultad: " + fx.getNomFac());
            aa.adicionar(fx);
            int cont = 0;
            int n = b.nroelem();
            for (int i = 1; i <= n; i++) {
                Carrera cx = b.eliminar();
                if (fx.getId() == cx.getIdFac()) {
                    cont++;
                }
                b.adicionar(cx);
            }
            System.out.println(" Tiene " + cont + " Carreras.");
        }
        a.vaciar(aa);
    }

    public static void MostrarC(String x, CCircularC b, CSimpleF a) {
        CSimpleF aa = new CSimpleF();
        while (!a.esvacia()) {
            Facultad fx = a.eliminar();
            if (x.equals(fx.getNomFac())) {
                System.out.println("\nFacultad: " + fx.getNomFac());
                aa.adicionar(fx);
                int n = b.nroelem();
                for (int i = 1; i < n; i++) {
                    Carrera cx = b.eliminar();
                    if (fx.getId() == cx.getIdFac()) {
                        System.out.println("\t" + cx.getNomCar());
                    }
                    b.adicionar(cx);
                }
            }
        }
        a.vaciar(aa);
    }

}
