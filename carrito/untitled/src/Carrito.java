import java.time.LocalDate;
import java.util.Arrays;

public class Carrito {

        private LocalDate fecha;

        private Persona cliente;
        private Producto [] productos = new Producto[3];


        public  Carrito(Persona cliente) {
            this.fecha = LocalDate.now();
            this.cliente = cliente;
        }



        public boolean agregarProductos (Producto producto){

            for (int i = 0; i < productos.length; i++) {
                if (productos[i] == null) {
                    productos[i] = producto;
                    return true;
                }

            }

            return false;
        }

        public double calcularPrecio(){

            double precioTotal = 0;

            for (int i = 0; i < productos.length; i++) {
                precioTotal += productos[i].getPrecioUnitario();
            }
            return precioTotal;
        }



        @Override
        public String toString() {
            return "Carrito " +'\n'+
                    "fecha: " + fecha + '\n' +
                    "cliente: " + cliente + '\n' +
                    "productos: " + Arrays.toString(productos);
        }


}
