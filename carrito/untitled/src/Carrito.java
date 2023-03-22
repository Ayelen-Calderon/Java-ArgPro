import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Carrito {

        private LocalDate fecha;

        private Persona cliente;
        private Producto [] productos = new Producto[3];

        private Boolean tieneDEscuento = false;
        private DescuentoCarrito descuentoC = new DescuentoCarrito();


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

       private double calcularPrecioSinDescuento(){
            double precioTotal = 0;

            for (int i = 0; i < productos.length; i++) {
                precioTotal += productos[i].getPrecioUnitario();
            }
            return precioTotal;
        }

      public double calcularPrecio(){
          double monto = calcularPrecioSinDescuento();
          double total = 0;
          Scanner scanner = new Scanner(System.in);
          System.out.print("¿tiene descuento?" +
                  "Ingrese 1, si tiene descuento.");

          if( scanner.nextInt() == 1 ){
              tieneDEscuento = true;
          }
          if(tieneDEscuento.equals(true)){
          System.out.println("¿que descuento desea aplicar? \n " +
                  "ingrese; \n" +
                  "1 para jubilados \n" +
                  "2 para promocionales \n" +
                  "3 para otros");
          int num = scanner.nextInt();
              switch (num) {

                  case 1:
                     total = descuentoC.descuentoJubilados(monto);
                      break;
                  case 2:
                      total = descuentoC.descuentoPromo(monto);
                      break;

                  case 3 :
                      System.out.println("ingrese porcentaje de descuento");
                      double desc = scanner.nextDouble();
                      total = descuentoC.descuentoOtro(monto,desc );
                      break;
                  default:
                      System.out.println("no se aplicaron descuento");

              }}else{
              total = monto;}

          return total;
      }


    @Override
    public String toString() {
        return "Carrito " +'\n'+
                "fecha: " + fecha + '\n' +
                "cliente: " + cliente + '\n' +
                "productos: " + Arrays.toString(productos);
    }

}
