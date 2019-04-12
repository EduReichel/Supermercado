
package supermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Supermercado {

    public static void main(String[] args) {
        
         List<producto> producto = new ArrayList<>(Arrays.asList(
        new bebida("Coca-Cola Zero", 1.5, 20),
        new bebida ("Coca-Cola", 1.5, 18),
        new higiene ("Shampoo Sedal", 500, 19),
        new fruta ("Frutilla", "Kilo", 64)
        
        ));
         
        for (int i=0; i < producto.size(); i++){
            
            System.out.println(producto.get(i));
        }
     
       System.out.println("===============================");
        
        // Producto más Caro y más Barato
       
        Collections.sort(producto); 
       
       
       System.out.println("Producto más caro: "  + producto.get(producto.size()-1).nombre);
       System.out.println("Producto más barato: "  + producto.get(0).nombre);
      
    }
    
}
