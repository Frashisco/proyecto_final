
public class ProductoRopa extends Producto { //Clase heredada de Producto

    private String hecho_en;
    private String talla;

    public ProductoRopa(String nombre,int cantidad,double precio) { //Constructor heredado de Producto
        super(cantidad, nombre, precio); 
        
    }

    public String getHecho_en() {
        return hecho_en;
    }

    public void setHecho_en(String hecho_en) {
        this.hecho_en = hecho_en;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    

}
