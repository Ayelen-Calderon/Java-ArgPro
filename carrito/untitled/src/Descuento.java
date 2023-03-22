public interface Descuento {
    public default double descuentoOtro(double monto, double descuento) {
        return 0;
    }
    public default double descuentoJubilados(double monto){
      return 0;
    }
    public default double descuentoPromo(double monto){
        return 0;
    }
}
