import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public Listadoble Agregar(Listadoble l) {

        boolean bandera = true;

        while (bandera) {
            Nodo n = new Nodo();

            System.out.println("Dijite el numero que desea ingresar: ");
            n.setDato(sc.nextInt());

            if (l.getInicio() == null) {
                l.setInicio(n);
                l.setFin(n);

            } else {
                l.getFin().setSiguiente(n);
                n.setAnterior(l.getFin());
                l.setFin(n);
            }

            System.out.println("Desea continuar: ? 1- si   2. no ");
            int opt = sc.nextInt();

            if (opt == 2) {
                bandera = false;
            }
        }
        return l;
    }

    public void mostrarLista(Listadoble l) {
        Nodo aux = l.getInicio();

        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
    }

    public Listadoble AgregarInicio(Listadoble l) {

        System.out.println("Dijite el numero que desea ingresar: ");
        Nodo n = new Nodo();
        n.setDato(sc.nextInt());

        if (l.getInicio() == null) {
            l.setInicio(n);
            l.setFin(n);

        } else {
            n.setSiguiente(l.getInicio());
            l.getInicio().setAnterior(n);
            l.setInicio(n);
        }
        return l;
    }
}
