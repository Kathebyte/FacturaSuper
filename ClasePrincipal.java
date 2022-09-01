import java.util.Scanner;

public class ClasePrincipal {

        static String codigo;
        static Integer precio;
        static Integer Iva;
        static Integer total;
        static Integer cantidad;
        static Integer cantidadProductos;
        static Integer total2;

        public static void main (String[] args) {

            Scanner productos =new Scanner (System.in);

            System.out.println("******FACTURA******");
            System.out.println("Cuantos productos vas a llevar");
            cantidad =  productos.nextInt();

            while(cantidad<1){
                System.out.println("Digite valores reales");
                cantidad =  productos.nextInt();
            }

            Factura facturaDeUsuario = new Factura(cantidad);

            for (Integer c = 0; c < cantidad ; c++) {
                
                System.out.println("digite el codigo");
                codigo = productos.nextLine();
                System.out.println("digite el precio");
                precio = productos.nextInt();
                System.out.println("digite la cantidad");
                cantidadProductos = productos.nextInt();

                facturaDeUsuario.agregarProducto(codigo, precio, cantidadProductos);
            }

            facturaDeUsuario.imprimirFactura();
        }
}
