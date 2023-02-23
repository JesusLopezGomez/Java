package producto;

import producto.model.Producto;

public class Main {

	public static void main(String[] args) {
		Producto p = new Producto("especial para limpiar",19.00);
		System.out.println(p.precioVenta());
		System.out.println(p.getPrecioSinIva());
		System.out.println(p.getDescripcion());
		System.out.println(p);


	}

}
