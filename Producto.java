public class Producto {    
    
    // Atributos
    private String codigo;
    private Integer precio;
    private Integer iva;
    private Integer cantidad;
    private Integer total;

    //Constructor
    public Producto(String nuevoCodigo, Integer nuevoPrecio, Integer nuevaCantidad) {
        codigo = nuevoCodigo;
        precio = nuevoPrecio;
        cantidad = nuevaCantidad;
        calcularTotal();
        calcularIva();
    } 

    //Metodos
    private void calcularIva() {
        iva = (total * 19)/ 100;
    }

    private void calcularTotal() {
        total = precio * cantidad;
    }

    public void modificarProducto(Integer nuevoPrecio) {
        precio = nuevoPrecio;
        calcularTotal();
        calcularIva();
    }

    public void imprimirProducto () {
        System.out.println("Codigo: " + codigo + " Precio: " + precio + " Iva: " + iva + " Cantidad: " + " Total: " + total);
    }

}

