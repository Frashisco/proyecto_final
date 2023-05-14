
public  class Producto{

    //Atributos de la clase
    private int stock; 
    private String nombre;
    private double precio;

     //Creo el constructor de la clase
     public Producto(int stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    

    

     //Métodos de la clase

     public String getNombre() {
        return nombre;
    }
    public int getstock() {
        return stock;
    }

    public void setstock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

}
