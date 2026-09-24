package Clases;

import java.util.ArrayList;

public class GestorProductos {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);

            if (p.getId() == producto.getId()) {
                System.out.println("Ese ID ya existe.");
                return;
            }

        }

        productos.add(producto);
        System.out.println("Producto agregado.");
    }

    public void mostrarProductos() {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            System.out.println(producto);

        }

    }

    public boolean actualizarProducto(int id, double nuevoPrecio) {

        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getId() == id) {
                producto.setprecio(nuevoPrecio);
                System.out.println("Solicitud exitosa, producto actualizado.");
                return true;

            }
        }
        System.out.println("Ese ID no existe.");
        return false;
    }

    public boolean eliminarProducto(int id) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getId() == id) {
                productos.remove(i);
                System.out.println("Producto eliminado con exito");
                return true;
            }
        }
        System.out.println("Ese ID no existe.");
        return false;
    }
}
