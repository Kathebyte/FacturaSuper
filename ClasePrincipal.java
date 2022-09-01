import java.util.Scanner;

public class ClasePrincipal {

        static String codigo;
        static Integer precio;
        static Integer Iva;
        static Integer total;
        static Integer cantidad;
        static Integer total2;

        public static void main (String[] args) {

            Scanner productos =new Scanner (System.in);

            System.out.println("******FACTURA******");

            System.out.println("digite el producto");
            codigo= productos.nextLine();
            System.out.println("Cuantos productos vas a llevar");
            cantidad =  productos.nextInt();

            while(cantidad<1){
                System.out.println("Digite valores reales");
                cantidad =  productos.nextInt();
            }

            System.out.println("Cual es el precio");
            precio =  productos.nextInt();

            while(precio<1){
                System.out.println("Digite valores reales");
                precio =  productos.nextInt();
            }

            calcularImpuesto();
        }
        //pasarlo a Producto
        public static void calcularImpuesto(){
            total= cantidad*precio;
            Iva=(total*19)/100;
            total2=total+Iva;
            System.out.println("El valor total con iva es " + Iva);
        }

}
