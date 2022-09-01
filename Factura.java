public class Factura {
    //Atributos
    Integer cantidad;
    Producto listaDeProductos[];
    Integer indice;


    //Constructor
    public Factura(Integer cantidadNueva) {
        cantidad = cantidadNueva;
        indice = 0;
        listaDeProductos = new Producto[cantidadNueva];
    }

    //Metodos
    public void agregarProducto(String nuevoCodigo, Integer nuevoPrecio, Integer nuevaCantidad) {
        listaDeProductos[indice] = new Producto(nuevoCodigo, nuevoPrecio, nuevaCantidad);
        indice = indice + 1;
    }

    public void eliminarProducto(Integer indiceDeProducto) {
        Integer elementosRestantes = cantidad - indiceDeProducto;
        Producto destino[] = new Producto[cantidad - 1];
        System.arraycopy(listaDeProductos, 0, destino, 0, indiceDeProducto);
        System.arraycopy(listaDeProductos, indiceDeProducto + 1, destino, indiceDeProducto, elementosRestantes);
        listaDeProductos = destino;
    }

    public void imprimirFactura() {
        for(Integer c = 0; c < cantidad; c++ ) {
            
        }
    }

    public void buscarProducto() {

    }
}
