public class DescuentoCarrito implements Descuento{

    public DescuentoCarrito() {
    }

    @Override
    public double descuentoOtro( double monto , double descuento) {
        return 0;
    }
    public double descuentoJubilados(double monto){
       double des = monto*15/100;
       return monto - des;
    };
     public double descuentoPromo(double monto){
         double des = monto*10/100;
         return monto - des;
     }

}
