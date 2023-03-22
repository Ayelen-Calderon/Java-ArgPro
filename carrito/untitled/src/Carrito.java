import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Carrito {

        private LocalDate fecha;

        private Persona cliente;
        private List <Producto> listaProducto = new ArrayList<>();

        private Boolean tieneDEscuento = false;
        private DescuentoCarrito descuentoC = new DescuentoCarrito();


        public  Carrito(Persona cliente) {
            this.fecha = LocalDate.now();
            this.cliente = cliente;
        }



        public void agregarProductos (Producto producto){

          listaProducto.add(producto);
        }

       private double calcularPrecioSinDescuento(){
            double precioTotal = 0;

            for (int i = 0; i < listaProducto.size(); i++) {
                precioTotal += listaProducto.get(i).getPrecioUnitario();
            }
            return precioTotal;
        }

      public double calcularPrecio(){
          double monto = calcularPrecioSinDescuento();
          double total = 0;
          try {
              Scanner scanner = new Scanner(System.in);
              System.out.print("¿tiene descuento?" +
                      "\nIngrese 1, si tiene descuento." +
                      "\nIngrese 2, si NO tiene descuento."
              );

              if (scanner.nextInt() == 1) {
                  tieneDEscuento = true;
              }
              if (tieneDEscuento.equals(true)) {
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

                      case 3:
                          System.out.println("ingrese porcentaje de descuento");
                          double desc = scanner.nextDouble();
                          total = descuentoC.descuentoOtro(monto, desc);
                          break;
                      default:
                          System.out.println("no se aplicaron descuento");

                  }
              } else {
                  total = monto;
              }
          }catch (InputMismatchException exception){
              System.err.println("el tipo de dato ingresado no es valido");
          }

          return total;
      }


    @Override
    public String toString() {
        return "Carrito " +'\n'+
                "fecha: " + fecha + '\n' +
                "cliente: " + cliente + '\n' +
                "productos: " + listaProducto;
    }

}
