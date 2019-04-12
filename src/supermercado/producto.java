
package supermercado;

public class producto implements Comparable<producto>{
    
    String nombre;
    int precio;

    public producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
 
    
    public int compareTo(producto o) {
           if (precio < o.precio) {
                return -1;
            }
            if (precio > o.precio) {
                return 1;
            }
            return 0;
        }
    
    
}
