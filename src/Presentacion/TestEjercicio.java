
package Presentacion;

import Datos.Coleccion;
import Negocio.*;

/**
 *
 * @author USRVI-LC2
 */
public class TestEjercicio {
    
    public static void main(String[] args) {
        
        Producto fideo = new Abarrote("Fideos",10, 1000, 1, "Numero 5");
        Producto cerveza = new Liquido(7, 20,1200, 2, "Corona");
        Producto helado = new Congelado(-18, 30,1200,3,"CRAZY");
        Oferta arroz = new Oferta(10,40, 1000,2, "grado 2");
        
        Coleccion col = new Coleccion();
        col.agregarProducto(fideo);
        col.agregarProducto(cerveza);
        col.agregarProducto(helado);
        col.agregarProducto(arroz);
        
        col.listaCompra(arroz);
        
        System.out.println("COMENTARIOS: " + col.comentarios("Muy bueno"));
        
        
    }
            
    
}
