public class DescuentoCarrito implements Descuento{

    public DescuentoCarrito() {
    }

    @Override
    public double descuentoOtro( double monto , double descuento) {
        double des = 0;
        try {
            des = monto*descuento/100;

        }catch (ArithmeticException exception){
            System.err.println("se intento dividir con cero");
        }
        return monto - des;
    }
    public double descuentoJubilados(double monto){
        double des = 0;
        try {
             des = monto*15/100;

        }catch (ArithmeticException exception){
            System.err.println("se intento dividir con cero");
        }
        return monto - des;
    };
     public double descuentoPromo(double monto){
         double des = 0;
         try {
             des = monto*10/100;

         }catch (ArithmeticException exception){
             System.err.println("se intento dividir con cero");
         }
         return monto - des;
     }

}
