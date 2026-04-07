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

    public Listadoble EliminarInicio(Listadoble l) {
        if (l.getInicio() == null) {
            System.out.println("Lista vacia");
        }

        if (l.getInicio() == l.getFin()) {
            l.setInicio(null);
            l.setFin(null);
        } else {
            l.setInicio(l.getInicio().getSiguiente());
            l.getInicio().setAnterior(null);
        }
        return l;
    }

    public void eliminarDato(Listadoble l) {

        if (l.getInicio() == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        System.out.println("Digite el número que desea eliminar:");
        int numero = sc.nextInt();

        Nodo aux = l.getInicio();

        while (aux != null) {

            if (aux.getDato() == numero) {

                if (aux.getAnterior() != null) {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                } else {
                    l.setInicio(aux.getSiguiente());
                }

                if (aux.getSiguiente() != null) {
                    aux.getSiguiente().setAnterior(aux.getAnterior());
                } else {
                    l.setFin(aux.getAnterior());
                }

                System.out.println("Dato eliminado correctamente.");
                return;
            }

            aux = aux.getSiguiente();
        }

        System.out.println("El número no se encontró.");

    }
}
