import java.util.Scanner;
//Nombre: Ninfa Isabel Rodríguez Briceño
//Carnet: 2024-1649U

public class App {

    public static int Lineal(String[] productos, String target){
        for (int i = 0; i < productos.length; i++){
            if (productos[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }  

    public static void main(String[] args) throws Exception {

        Scanner op = new Scanner(System.in);
        boolean continuar = true;
        int cantidad = 0;
        
        do {
            try {
                System.out.println("Ingrese la cantidad de productos que desea agregar");
                cantidad = op.nextInt();
                continuar = false;

            } catch (MatchException M) {
               System.out.println("Solo se perimite ingresar valores enteros");
            }

        } while (continuar);
        op.nextLine();
        String[] productos = new String[cantidad];
        int[] cantidadPs = new int[cantidad];
        for(int i = 0; i < productos.length; i++){
            System.out.println("Ingrese el producto:"+(i+1));
            productos[i] = op.nextLine();
            System.out.println("Ingrese la cantidad");
            cantidadPs[i] = op.nextInt();
            op.nextLine();
        }
        System.out.println("Ingrese el producto que quiere buscar");
        String target = op.nextLine();
        int imprimir = Lineal(productos, target);
        if (imprimir != -1) {
            System.out.println("El Producto se encuentra en la posicion "+ imprimir);
        } else {
            System.out.println("Producto no encontrado");
        }
        op.close();
    } 
}
