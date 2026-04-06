public class principal {

    public static void main(String[] args) {
        
        metodos m = new metodos();
        Listadoble l = new Listadoble();

        l = m.Agregar(l);
        System.out.println();
        m.mostrarLista(l);
        l = m.AgregarInicio(l);
        m.mostrarLista(l);
    }
    
}
