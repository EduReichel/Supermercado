
package supermercado;


public class fruta extends producto {
    
    String unidadVenta;

    public fruta( String nombre,String unidadVenta, int precio) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }
    
    @Override
    public String toString (){
    return ("Nombre: " + fruta.super.nombre +
            " /// Precio: $" + fruta.super.precio +
            " /// Unidad de Venta: " + fruta.this.unidadVenta);
    }
    
}
