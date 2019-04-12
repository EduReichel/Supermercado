
package supermercado;

public class higiene extends producto {
    
    int contenido;

    public higiene(String nombre, int contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String toString (){
    return ("Nombre: " + higiene.super.nombre +
            " /// Contenido: " + higiene.this.contenido + "ml" +
            " /// Precio: $" + higiene.super.precio);
    }
}
