package Clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GestorProductos gestor = new GestorProductos();

        Scanner sc = new Scanner(System.in);

        while (true) {
            int opcion;
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Cerrar menu");
            System.out.print("Seleccione una opcion (1-5): ");

            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion invalida. Intenta de nuevo.\n");
            } else if (opcion == 1) {
                System.out.println("Ingresa su id unico:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el nombre del producto:");
                String nombre = sc.nextLine();
                System.out.println("Ingresa el precio del producto:");
                double precio = sc.nextDouble();
                Producto producto = new Producto(id, nombre, precio);
                gestor.agregarProducto(producto);

            } else if (opcion == 2) {
                gestor.mostrarProductos();

            } else if (opcion == 3) {
                gestor.mostrarProductos();
                System.out.println("ingresa el id del producto que quieres actualizar:");
                int id = sc.nextInt();
                System.out.println("Ingrese el nuevo precio:");
                double nuevoprecio = sc.nextDouble();

                gestor.actualizarProducto(id, nuevoprecio);

            } else if (opcion == 4) {
                gestor.mostrarProductos();
                System.out.println("Ingresa el id del producto que quieres eliminar:");
                int id = sc.nextInt();
                gestor.eliminarProducto(id);
            } else if (opcion == 5) {
                break;

            }
            System.out.println("\n");
        }
    }
}
