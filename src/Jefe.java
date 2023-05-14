

public class Jefe implements trabajadores {
    private String nombre;
    private int edad;
    private int telefono;

    public Jefe(String nombre) {
        this.nombre = nombre;
    }


    public void trabajando(boolean disponible){
        if (disponible==false)
        System.out.println("Dejame, que no estoy en mi horario y quiero descansar");
        else{
        System.out.println("Digame, en que puedo ayudarle");
        }
    }

    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    

    
    
    
    
}
