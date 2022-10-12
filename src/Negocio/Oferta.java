
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Oferta extends Producto{
    
    public int descuento;

    public Oferta() {
    }

    public Oferta(int descuento) {
        this.descuento = descuento;
    }

    public Oferta(int descuento, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return super.toString() + " Oferta{" + "descuento=" + descuento + '}';
    }
    
    public int aPagar(int cantidad)
    {
        int total = this.getPrecio() * cantidad;
        int totalDesc = total * this.getDescuento()/100;
        //int totalPag = total - totalDesc;
        
        return totalDesc;
    }
    
    
    
    
}
