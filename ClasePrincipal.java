import java.util.Scanner;

public class ClasePrincipal {

        static String codigo;
        static Integer precio;
        static Integer cantidad;
        static Integer cantidadProductos;
     

        /**
         * @param args
         */
        public static void main (String[] args) {

            Scanner productos =new Scanner (System.in);

            System.out.println("******FACTURA******");
            System.out.println("Cuantos productos vas a llevar");
            cantidad =  productos.nextInt();
            
            Factura facturaDeUsuario = new Factura(cantidad);

            for (Integer c = 0; c < cantidad ; c++) {
            
                System.out.println("Digite el codigo o nombre del producto");
                codigo = productos.nextLine();
                System.out.println("*********************************");
                System.out.println("Digite el precio del producto "+codigo);
                precio = productos.nextInt();
                System.out.println("digite la cantidad");
                cantidadProductos = productos.nextInt();

                facturaDeUsuario.agregarProducto(codigo, precio, cantidadProductos);
            }

            facturaDeUsuario.imprimirFactura();
        }
}
