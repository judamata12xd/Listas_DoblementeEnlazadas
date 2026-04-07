import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        Listadoble l = new Listadoble();
        int opt = 0;
        boolean seguir = true;

        while (seguir) {
            System.out.println("Que desea realizar");
            System.out.println("1) llenar lista");
            System.out.println("2) mostrar lista");
            System.out.println("3) agregar inicio");
            System.out.println("4) eliminar inicio");
            System.out.println("5) eliminar ");
            System.out.println("6) Salir");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    l = m.Agregar(l);
                    break;
                case 2:
                    m.mostrarLista(l);
                    break;
                case 3:
                    l = m.AgregarInicio(l);
                    break;
                case 4:
                    l = m.EliminarInicio(l);
                    break;
                case 5:
                    m.eliminarDato(l);    
                    break; 
                default:
                    System.out.println("Adios :,<");
                    seguir = false;
                    break;
            }
        }
    }
}
