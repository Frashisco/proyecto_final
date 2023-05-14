
public class ProductoAlimenticio extends Producto { //Clase heredada de Producto
    private String estado;
    private String fecha_caducidad;

    public ProductoAlimenticio(String nombre,int cantidad,double precio) { //Constructor heredado de Producto
        super(cantidad, nombre, precio); }

    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    
    
}
