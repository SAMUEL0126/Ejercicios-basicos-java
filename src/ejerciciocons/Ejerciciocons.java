package ejerciciocons;

public class Ejerciciocons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int cantidad = 0;
	        int i = 0;
	        int mayorUnidades , menorUnidades;

	        try (java.util.Scanner Scanner = new java.util.Scanner(System.in)) {

	            System.out.println("Cantidad Productos: ");
	            cantidad = Scanner.nextInt();

	            Producto[] productos = new Producto[cantidad]; 
	        
	                for (i = 0; i < cantidad; i++) {
	                    productos[i] = new Producto();
	                }

	                for (i = 0; i < cantidad; i++) {
	                    System.out.println("\n    PRODUCTO "+ (i+1) + "["+i+"]"  );

	                    System.out.println("Ingrese El codigo: ");
	                    productos[i].setCodigo(Scanner.nextInt());

	                    System.out.println("Ingrese el precio de la compra: ");
	                    productos[i].setPrecioCompra(Scanner.nextInt());

	                    System.out.println("Ingrese la cantidad en bodega: ");
	                    productos[i].setCantidadBodega(Scanner.nextInt());

	                    System.out.println("Ingrese la cantidad: ");
	                    productos[i].setCantidadMinima(Scanner.nextInt());
	                    
	                    System.out.println("Ingrese la cantidad de productos que desea llevar : ");
	                    productos[i].setNumproducto(Scanner.nextInt());
	                }
	                

	                for (int j = 0; j < cantidad; j++) {
	                    productos[j].imprimirProducto();
	                }

	                menorUnidades = mayorUnidades = productos[0].getCantidadBodega();
	                for (i = 0; i < cantidad; i++) {
	                        
	                    if (productos[i].getCantidadBodega() >= mayorUnidades ) {
	                        mayorUnidades = productos[i].getCodigo();
	                    }
	    
	                    if (productos[i].getCantidadBodega() <= menorUnidades ) {
	                        menorUnidades = productos[i].getCodigo();
	                    }

	                }
	                

	            System.out.println("el codigo con menor unidades es:" + menorUnidades );
	            System.out.println("el codigo con mayor unidades es:" + mayorUnidades );
	        }
	       
	}


}
