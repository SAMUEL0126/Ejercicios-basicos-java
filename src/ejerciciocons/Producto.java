package ejerciciocons;

public class Producto {

	private int codigo;
    private int precioCompra;
    private int cantidadBodega;
    private int cantidadMinima;
    private int cantidadMaxima;
    private double porcentaje = 0.01;
    private int numproducto;
    
    public void imprimirProducto(){
        System.out.println("\n");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %4s %10s %10s %n" , "CODIGO" ,"PRECIO" ,"BODEGA","MINIMA" );
        System.out.printf("%-10d %4d %10d %10d %n" , codigo , precioCompra , cantidadBodega ,cantidadMinima);
        System.out.println("\n ¿Es necesario realizar pedido al proveedor? ->  *"+ solicitarpedido()+"*\n" );
        System.out.println("El total a pagar es de "+Producto(numproducto));
    }
	
    public boolean solicitarpedido() {
        if (this.cantidadBodega < this.cantidadMinima){
            return true;
        }else return false;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getCantidadBodega() {
		return cantidadBodega;
	}

	public void setCantidadBodega(int cantidadBodega) {
		this.cantidadBodega = cantidadBodega;
	}

	public int getCantidadMinima() {
		return cantidadMinima;
	}

	public void setCantidadMinima(int cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getNumproducto() {
		return numproducto;
	}

	public void setNumproducto(int numproducto) {
		this.numproducto = numproducto;
	}

	public int Producto(int numproducto) {
		// TODO Auto-generated constructor stub
		double total = ( numproducto* precioCompra )* porcentaje;
		total = precioCompra - total;
		return (int) total;
	}
}
