public class Producto {

    private String nombreProducto;

    private double precioUnitario;


    public Producto(String nombreProducto, double precioUnitario) {
        this.nombreProducto = nombreProducto;
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
