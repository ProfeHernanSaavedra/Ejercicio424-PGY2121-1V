
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Aseo extends Producto{
    
    private String categoria;

    public Aseo() {
    }

    public Aseo(String categoria, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " Aseo{" + "categoria=" + categoria + '}';
    }
    
    
    
}
