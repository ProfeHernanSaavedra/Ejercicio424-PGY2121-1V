
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Liquido extends Producto{
    
    private int gradosAlco;

    public Liquido() {
    }

    public Liquido(int gradosAlco, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.gradosAlco = gradosAlco;
    }

    public int getGradosAlco() {
        return gradosAlco;
    }

    public void setGradosAlco(int gradosAlco) {
        this.gradosAlco = gradosAlco;
    }

    @Override
    public String toString() {
        return super.toString()+" Liquido{" + "gradosAlco=" + gradosAlco + '}';
    }
    
    
    
}
