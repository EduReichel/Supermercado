
package supermercado;


public class bebida extends producto{
    
    double capacidad;

    public bebida(String nombre, double capacidad, int precio) {
        super(nombre, precio);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
 
        
    @Override
    public String toString (){
    return ("Nombre: " + bebida.super.nombre +
            " /// Litros: " + bebida.this.capacidad + 
            " /// Precio: $" + bebida.super.precio);
    }
}
