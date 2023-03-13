public class Main {
    public static void main(String[] args) {


        Persona cliente1 = new Persona("Pepito","Perez");
        Producto producto1 = new Producto("Jabon en polvo",40.00);
        Producto producto2 = new Producto("Esponja",10.00);
        Producto producto3 = new Producto("Chocolate",100.00);

        Carrito carrito1 = new Carrito(cliente1);

        carrito1.agregarProductos(producto1);
        carrito1.agregarProductos(producto2);
        carrito1.agregarProductos(producto3);

        carrito1.calcularPrecio();

        System.out.println(carrito1);
        System.out.println(carrito1.calcularPrecio());





    }
}