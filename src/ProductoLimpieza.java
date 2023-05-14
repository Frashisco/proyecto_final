

public class ProductoLimpieza extends Producto { //Clase heredada de Producto

    private String advertencia;
    private String tipo_usos;

    public ProductoLimpieza(String nombre,int cantidad,double precio) { //Constructor heredado de Producto
        super(cantidad, nombre, precio); 
        
    }

    public String getAdvertencia() {
        return advertencia;
    }

    public void setAdvertencia(String advertencia) {
        this.advertencia = advertencia;
    }

    public String getTipo_usos() {
        return tipo_usos;
    }

    public void setTipo_usos(String tipo_usos) {
        this.tipo_usos = tipo_usos;
    }
    
    
}
