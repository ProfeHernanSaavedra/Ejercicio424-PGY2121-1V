
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Congelado extends Producto{
    
    private double temperatura;

    public Congelado() {
    }

    public Congelado(double temperatura, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() +" Congelado{" + "temperatura=" + temperatura + '}';
    }
    
    
    
    
}
