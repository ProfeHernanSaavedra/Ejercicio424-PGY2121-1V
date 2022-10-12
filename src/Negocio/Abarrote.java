
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Abarrote extends Producto{
    
    private String tipo;

    public Abarrote() {
    }

    public Abarrote(String tipo, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Abarrote{" + "tipo=" + tipo + '}';
    }
    
    
    
    
    
}
