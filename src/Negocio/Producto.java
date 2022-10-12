package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Producto {
    
    protected int codigo,precio,cantidad;
    protected String descripcion;

    public Producto() {
    }

    public Producto(int codigo, int precio, int cantidad, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", descripcion=" + descripcion + '}';
    }

    

    
}

