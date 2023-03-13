public class Producto {

    private String nombreProducto;

    private double precioUnitario;


    public Producto(String nombrePtroducto, double precioUnitario) {
        this.nombreProducto = nombrePtroducto;
        this.precioUnitario = precioUnitario;
    }



    @Override
    public String toString() {
        return  '\n' +  nombreProducto +
                ", Precio: " + precioUnitario
                ;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
