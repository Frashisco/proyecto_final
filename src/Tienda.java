
public class Tienda implements tiendas {

    //Atributos de la clase
        private String nombre;
        private String localidad;
        private String fecha_creacion;
        private String metodo_pago;
        private String resenas;

        //Creo el constructor de la clase Tienda
        public Tienda(String nombre) {
            this.nombre = nombre;
        }

       

        //Métodos de la clase


        public void bienvenido(String nombre, String localidad, String fecha){
            System.out.println("Bienvenido a "+nombre);
        }

        public String getLocalidad() {
            return localidad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setLocalidad(String localidad) {
            this.localidad = localidad;
        }

        public String getFecha_creacion() {
            return fecha_creacion;
        }

        public void setFecha_creacion(String fecha_creacion) {
            this.fecha_creacion = fecha_creacion;
        }

        public String getMetodo_pago() {
            return metodo_pago;
        }

        public void setMetodo_pago(String metodo_pago) {
            this.metodo_pago = metodo_pago;
        }

        public String getResenas() {
            return resenas;
        }

        public void setResenas(String resenas) {
            this.resenas = resenas;
        }

        

        


    
}
