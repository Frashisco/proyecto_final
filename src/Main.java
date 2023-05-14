

import java.util.*;
import java.io.*;

public class Main {
    public static void colaTienda(String cliente1, String cliente2) {
        // Este método simula una cola de una tienda, si eres vip pasa el
        // primero(cola) si no, pasas el ultimo
        // (pila)///////////////////////////////////////TENGO QUE CORREGIRLO
        Scanner sc = new Scanner(System.in);
        System.out.println("Acabas de entrar en la cola, ¿eres VIP? (si) - (no)");
        String opcion = sc.next();
        if (opcion == "si") {
            Queue<String> cola = new LinkedList<>();

            // NO SE COMO VER QUIEN ES EL QUE ESTÁ METIDO PARA PONER EL ORDEN
            cola.add(cliente1);
            cola.add(cliente2);

        } else if (opcion == "no") {
            Stack<String> pila = new Stack<>();
            // NO SE COMO VER QUIEN ES EL QUE ESTÁ METIDO PARA PONER EL ORDEN
            pila.push(cliente1);
            pila.push(cliente2);

        } else {
            System.out.println("Numero incorrecto");
        }

    }

    public static void registrarse() {
        // Este método crea un nuevo usuario ----- TENGO QUE VER COMO HACER PARA
        // GUARDARLO BIEN (VER SI TENGO GANAS DE PONERLO BIEN O DEJARLO ASÍ)
        System.out.println();
        System.out.println("REGISTRARSE ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuario: ");
        String newuser = sc.next();
        System.out.print("Contraseña: ");
        String newpass = sc.next();
        System.out.println();
        System.out.println("TE HAS REGISTRADO CON ÉXITO");
    }

    public static boolean validar_usuario(String realusuario, String realpassword) { // funcion que es un login para
                                                                                     // entrar en la tienda online
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String user = sc.next();
        System.out.println("Contraseña: ");
        String pass = sc.next();

        if (user.equals(realusuario) && pass.equals(realpassword)) { // Si el usuario y la contraseña son iguales que
                                                                     // los parámetros entra, si no no
            System.out.println("HAS ENTRADO");
            return true;
        } else {
            System.out.println("USUARIO Y/O CONTRASEÑA EQUIVOCADOS");
            return false;
        }
    }

    public static boolean nuevo(int opc) {

        // Este método comprueba si la persona es nuevo o no
        if (opc == 0) {
            return true;
        } else if (opc == 1) {
            return false;
        } else
            return false;
    }

    public static void creaJefe(boolean nuevo) {
        // Este método instancia la clase Jefe con un nombre que reciba por pantalla

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre:");
        String nombre = sc.next();
        Jefe nomJefe = new Jefe(nombre);
        System.out.println("Encantado de conocerte Jefe " + nomJefe.getNombre()
                + " has sido registrado en la base de datos");

    }

    public static void creaAdministrador(boolean nuevo) {
        // Este método instancia la clase Administrador con un nombre que reciba por
        // pantalla
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre:");
        String nombre = sc.next();
        Administrador nomAdministrador = new Administrador(nombre);
        System.out.println("Encantado de conocerte Administrador " + nomAdministrador.getNombre()
                + " has sido registrado en la base de datos");

    }

    public static void creaEmpleado(boolean nuevo) {
        // Este método instancia la clase Empleado con un nombre que reciba por pantalla

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre:");
        String nombre = sc.next();
        Empleado nomEmpleado = new Empleado(nombre);
        System.out.println("Encantado de conocerte Empleado " + nomEmpleado.getNombre()
                + " has sido registrado en la base de datos");

    }

    public static void creaCliente(boolean nuevo) {
        // Este método instancia la clase Cliente con un nombre que reciba por pantalla

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre:");
        String nombre = sc.next();
        Cliente nomCliente = new Cliente(nombre);
        System.out.println("Encantado de conocerte Cliente " + nomCliente.getNombre()
                + " has sido registrado en la base de datos");

    }

    public static void creaProducto() {
        // Este método instancia la clase producto (crear un nuevo producto) con un
        // nombre que reciba por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        String nom_producto = sc.next();
        System.out.println("Stock: ");
        int stock = sc.nextInt();
        System.out.println("Precio: ");
        double precio = sc.nextDouble();
        Producto nom_productos = new Producto(stock, nom_producto, precio);
        System.out.println("Has insertado el producto " + nom_producto + " con stock " + stock + " y cuesta " + precio);

    }

    static String producto(String a) {
        ProductoAlimenticio naranja = new ProductoAlimenticio("naranja", 100, 0.5); // asignamos los datos del producto
                                                                                    // naranja
        naranja.setEstado("muy buen estado");
        naranja.setFecha_caducidad("09/11/2023");

        ProductoAlimenticio pan = new ProductoAlimenticio("pan", 10, 0.8);// asignamos los datos del producto pan
        pan.setEstado("recien hecho");
        pan.setFecha_caducidad("01/06/2023");

        ProductoAlimenticio leche = new ProductoAlimenticio("leche", 50, 0.95);// asignamos los datos del producto leche
        leche.setEstado("cerca de caducidad");
        leche.setFecha_caducidad("01/07/2023");

        ProductoLimpieza limpiacristales = new ProductoLimpieza("limpiacristales", 60, 1.99);// asignamos los datos del
                                                                                             // producto limpiacristales
        limpiacristales.setAdvertencia("cuidado si llega a los ojos");
        limpiacristales.setTipo_usos("limpia ventanas, manparas, cristal de coche, etc...");

        ProductoLimpieza lejia = new ProductoLimpieza("lejia", 80, 2.49);// asignamos los datos del producto lejia
        lejia.setAdvertencia("corrosivo a la piel e inflamable");
        lejia.setTipo_usos("fregar o limpiar manchas fuertes");

        ProductoLimpieza fregasuelos = new ProductoLimpieza("fregasuelos", 40, 2);// asignamos los datos del producto
                                                                                  // fregasuelos
        fregasuelos.setAdvertencia("cuidado si llega a consumirlo");
        fregasuelos.setTipo_usos("limpia y a�ade olor cuando frieges");

        ProductoRopa camiseta = new ProductoRopa("camiseta", 10, 9.99);// asignamos los datos del producto camiseta
        camiseta.setHecho_en("China");
        camiseta.setTalla("XL, XXL, L, S");

        ProductoRopa vaqueros = new ProductoRopa("vaqueros", 10, 19.99);// asignamos los datos del producto vaqueros
        vaqueros.setHecho_en("Europa");
        vaqueros.setTalla("XL, XXL, S");

        ProductoRopa deportivas = new ProductoRopa("deportivas", 25, 34.99);// asignamos los datos del producto
                                                                            // deportivas
        deportivas.setHecho_en("Mexico");
        deportivas.setTalla("15, 16, 25, 26, 42, 43");

        switch (a) {
            case "naranja":
                System.out.println("Tenemos " + naranja.getstock() + " " + naranja.getNombre() + "s y cada una cuesta "
                        + naranja.getPrecio() + " euros, estan en " + naranja.getEstado() + " y cadudan el "
                        + naranja.getFecha_caducidad());
                break;
            case "pan":
                System.out.println(
                        "Tenemos " + pan.getstock() + " " + pan.getNombre() + "es y cada una cuesta " + pan.getPrecio()
                                + " euros, estan en " + pan.getEstado() + " y cadudan el " + pan.getFecha_caducidad());
                break;
            case "leche":
                System.out.println("Tenemos " + leche.getstock() + " de " + leche.getNombre() + " y cada una cuesta "
                        + leche.getPrecio() + " euros, estan en " + leche.getEstado() + " y cadudan el "
                        + leche.getFecha_caducidad());
                break;
            case "limpiacristales":
                System.out.println("Tenemos " + limpiacristales.getstock() + " " + limpiacristales.getNombre()
                        + " y cada una cuesta " + limpiacristales.getPrecio() + " euros, se utiliza para "
                        + limpiacristales.getTipo_usos() + " pero escuchas estas advertencias antes de usarlo, "
                        + limpiacristales.getAdvertencia());
                break;
            case "lejia":
                System.out.println("Tenemos " + lejia.getstock() + " " + lejia.getNombre() + "s y cada una cuesta "
                        + lejia.getPrecio() + " euros, se utiliza para " + lejia.getTipo_usos()
                        + " pero escuchas estas advertencias antes de usarlo, " + lejia.getAdvertencia());
                break;
            case "fregasuelos":
                System.out.println(
                        "Tenemos " + fregasuelos.getstock() + " " + fregasuelos.getNombre() + " y cada una cuesta "
                                + fregasuelos.getPrecio() + " euros, se utiliza para " + fregasuelos.getTipo_usos()
                                + " pero escuchas estas advertencias antes de usarlo, " + fregasuelos.getAdvertencia());
                break;
            case "camiseta":
                System.out.println("Tenemos " + camiseta.getstock() + " " + camiseta.getNombre()
                        + "s y cada una cuesta " + camiseta.getPrecio() + " euros, lo tenemos para las tallas "
                        + camiseta.getTalla() + " hecho en " + camiseta.getHecho_en());
                break;
            case "vaqueros":
                System.out.println("Tenemos " + vaqueros.getstock() + " " + vaqueros.getNombre() + " y cada una cuesta "
                        + vaqueros.getPrecio() + " euros, lo tenemos para las tallas " + vaqueros.getTalla()
                        + " hecho en " + vaqueros.getHecho_en());
                break;
            case "deportivas":
                System.out.println("Tenemos " + deportivas.getstock() + " " + deportivas.getNombre()
                        + " y cada una cuesta " + deportivas.getPrecio() + " euros, lo tenemos para las tallas "
                        + deportivas.getTalla() + " hecho en " + deportivas.getHecho_en());
                break;
            default:
                System.out.println("No pertenece a ning�n producto que tenemos en nuestro catalogo.");
                break;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bucle = 1; // ESTAS VARIABLES SE USARAN PARA SALIR DEL PROGRAMA O NO
        int bucle1 = 1; // CADA NUMERO REPRESENTA EL NÚMERO EN EL CASE (Ej: este se usará para el case
                        // 1)
        int bucle2 = 1;
        int bucle3 = 1;
        int bucle4 = 1;

        // INSTANCIO VARIAS CLASES
        Tienda Pagasuper = new Tienda("Pagasuper");
        Pagasuper.setLocalidad("Córdoba");
        Pagasuper.setFecha_creacion("2 de Agosto de 2003");

        Jefe Gabriel = new Jefe("Gabriel");
        Jefe Paco = new Jefe("Paco");
        String userJefe = "jefe"; // USUARIO Y CONTRASEÑA PARA LOS JEFES
        String ContraJefe = "jefe";

        Administrador Adolfo = new Administrador("Adolfo");
        Administrador Jose = new Administrador("José");
        String userAdministrador = "administrador";// USUARIO Y CONTRASEÑA PARA LOS ADMINISTRADORES
        String ContraAdministrador = "administrador";

        Empleado Padillo = new Empleado("Padillo");
        Empleado Padilla = new Empleado("Padilla");
        String userEmpleado = "empleado";// USUARIO Y CONTRASEÑA PARA LOS EMPLEADOS
        String ContraEmpleado = "empleado";

        Cliente Manuel = new Cliente("Manuel");
        Cliente Sabio = new Cliente("Sabio");
        String userCliente = "cliente"; // USUARIO Y CONTRASEÑA PARA LOS CLIENTES
        String ContraCliente = "cliente";

        while (bucle != 0) {
            System.out.println("DESARROLLADO POR GABRIEL MORENO MUÑOZ Y FRANCISCO RUIZ PAREDES");
            System.out.println();
            System.out.println("¿CUÁL ES TU CARGO EN LA EMPRESA? INSERTE (1 - 2 - 3 - 4)");
            System.out.println("1 - JEFE");
            System.out.println("2 - ADMINISTRADOR");
            System.out.println("3 - EMPLEADO");
            System.out.println("4 - CLIENTE");
            System.out.println("PULSA 0 CUANDO HAYAS TERMINADO.");

            ;
            int opc = sc.nextInt();
            // los jefes pueden borrar y crear administradores y empleados
            // los administradores pueden borrar y crear empleados, productos y clientes
            // los empleados pueden borrar y crear productos y clientes
            switch (opc) {
                case 0:
                    bucle = 0;
                    break;
                case 1:
                    while (bucle1 != 0) {
                        System.out
                                .println("¿Eres nuevo en la empresa? Pulse 0 si eres nuevo, pulse 1 si no eres nuevo ");
                        opc = sc.nextInt();
                        if (nuevo(opc) == true) {
                            creaJefe(nuevo(0));
                        } // Si se pulsa 0 se creará un nuevo Jefe con el nombre que reciba por pantalla,
                          // si no, no.
                        System.out.println();
                        System.out.println("¿Que quieres hacer?");
                        System.out.println("1. - Contratar a un nuevo administrador");
                        System.out.println("2. - Contratar a un nuevo empleado");
                        System.out.println("0. - Salir");

                        opc = sc.nextInt();
                        switch (opc) {
                            case 1:

                                creaAdministrador(true);
                                Pagasuper.bienvenido(Pagasuper.getNombre(), Pagasuper.getLocalidad(),
                                        Pagasuper.getFecha_creacion());
                                break;
                            case 2:
                                creaEmpleado(true);
                                Pagasuper.bienvenido(Pagasuper.getNombre(), Pagasuper.getLocalidad(),
                                        Pagasuper.getFecha_creacion());
                                break;
                            case 3:
                                bucle1 = 1;
                                break;
                        }
                    }
                    break;

                case 2:
                    while (bucle2 != 0) {
                        System.out
                                .println("¿Eres nuevo en la empresa? Pulse 0 si eres nuevo, pulse 1 si no eres nuevo ");
                        opc = sc.nextInt();
                        if (nuevo(opc) == true) {
                            creaAdministrador(nuevo(0));
                        } // Si se pulsa 0 se creará un nuevo Admin con el nombre que reciba por
                          // pantalla, si no, no.
                        System.out.println("");
                        System.out.println("¿Que quieres hacer?");
                        System.out.println("1. - Contratar a un nuevo empleado");
                        System.out.println("2. - Registrar un nuevo producto");
                        System.out.println("3. - Registrar un nuevo cliente");
                        System.out.println("0. - Salir");
                        opc = sc.nextInt();

                        switch (opc) {
                            case 1:
                                creaEmpleado(true);
                                Pagasuper.bienvenido(Pagasuper.getNombre(), Pagasuper.getLocalidad(),
                                        Pagasuper.getFecha_creacion());
                                break;

                            case 2:
                                creaProducto();
                                break;
                            case 3:
                                creaCliente(true);
                                Pagasuper.bienvenido(Pagasuper.getNombre(), Pagasuper.getLocalidad(),
                                        Pagasuper.getFecha_creacion());
                                break;
                            case 0:
                                bucle2 = 1;
                                break;
                        }
                    }
                    break;
                case 3:
                    while (bucle3 != 1) {
                        System.out
                                .println("¿Eres nuevo en la empresa? Pulse 0 si eres nuevo, pulse 1 si no eres nuevo ");
                        opc = sc.nextInt();
                        if (nuevo(opc) == true) {
                            creaEmpleado(nuevo(0));
                        } // Si se pulsa 0 se creará un nuevo Empleado con el nombre que reciba por
                          // pantalla, si no, no.
                        System.out.println();
                        System.out.println("¿Que quieres hacer?");
                        System.out.println("1. - Registrar un nuevo cliente");
                        System.out.println("2. - Registrar un nuevo producto");
                        System.out.println("0. - Salir");

                        opc = sc.nextInt();
                        switch (opc) {
                            case 1:
                                creaCliente(true);
                                Pagasuper.bienvenido(Pagasuper.getNombre(), Pagasuper.getLocalidad(),
                                        Pagasuper.getFecha_creacion());
                                break;

                            case 2:
                                creaProducto();
                                break;
                            case 0:
                                bucle3 = 1;
                                break;

                        }
                    }
                    break;
                case 4:
                    while (bucle4 != 1) {
                        System.out
                                .println("¿Eres nuevo en la empresa? Pulse 0 si eres nuevo, pulse 1 si no eres nuevo ");
                        opc = sc.nextInt();
                        if (nuevo(opc) == true) {
                            creaCliente(nuevo(0));
                        } // Si se pulsa 0 se creará un nuevo Cliente con el nombre que reciba por
                          // pantalla, si no, no.

                        Pagasuper.bienvenido(Pagasuper.getNombre(), Pagasuper.getLocalidad(),
                                Pagasuper.getFecha_creacion());

                        System.out.println("¿Desea acceder a la Tienda Online? Sí (0) No (1)");

                        int acceder = sc.nextInt();
                        if (acceder == 0) {
                            System.out.println("¿Tienes una cuenta creada? Sí (0) No (1)");
                            acceder = sc.nextInt();
                            if (acceder == 0)
                                validar_usuario(userCliente, ContraCliente);
                            else if (acceder == 1) {
                                // TENGO QUE MIRAR DONDE GUARDAR LOS DATOS (PROBABLEMENTE UN ARRAY UNI O
                                // BIDIMENSIONAL) (SI TENGO GANAS)
                                registrarse();

                            } else {
                                System.out.println("Numero incorrecto");
                            }
                        } else if (acceder == 1) {
                            System.out.println("PUES ENTONCES TE TOCA ANDAR, ESCOGE TUS PRODUCTOS: ");
                            // AQUI INSERTO EL CÓDIGO DE PACO CON LOS PRODUCTOS Y ESAS COSAS

                            int longitud;
                            String producto;
                            String productos;
                            int contador = 0;
                            BufferedWriter out = null;
                            String texto = "";

                            System.out.println("¿Cuantos productos deseas comprar?");
                            longitud = sc.nextInt();

                            if (longitud > 0) { // Guarda los producto que a introducido por teclado en el array
                                String arr[] = new String[longitud];

                                for (int i = 0; i < arr.length; i++) {
                                    System.out.println("Tenemos los siguientes productos: ");
                                    System.out.println("- Naranja.");
                                    System.out.println("- Pan.");
                                    System.out.println("- Leche.");
                                    System.out.println("- Limpiacristales.");
                                    System.out.println("- Lejia.");
                                    System.out.println("- Fregasuelos.");
                                    System.out.println("- Camiseta.");
                                    System.out.println("- Vaqueros.");
                                    System.out.println("- Deportivas.");
                                    arr[i] = sc.next();
                                }
                                for (String i : arr) { // usamos un for-each para recorrer todo el array para que en
                                                       // este
                                                       // caso muestre todos los datos introduzo por teclado
                                    System.out.println("El producto " + i + ": ");
                                    productos = i;
                                    producto(productos);
                                    contador++;
                                    if (contador == 1) {
                                        texto = i + " | ";
                                    } else if (contador > 1) {
                                        texto = texto + i + " | ";
                                    }
                                }
                                try { // Guardamos los productos que a solicitado en un fichero txt
                                    System.out.println("TU LISTA DE LA COMPRA SE HA COMPLETADO CON EXITO");
                                    out = new BufferedWriter(new FileWriter("ticket.txt"));
                                    out.write(texto);
                                } catch (IOException ex) {
                                    System.out.println(ex.getMessage());
                                } finally {
                                    if (out != null) {
                                        try {
                                            out.close();
                                        } catch (IOException ex) {
                                            System.out.println(ex);
                                        }
                                    }
                                }
                            } else {
                                System.out.println(
                                        "Si selecciona 0 o un numero inferior a este no podremos empezar con la compra.");

                            }

                        } else {
                            System.out.println("Número incorrecto");
                        }
                        // AQUI INSERTO EL CÓDIGO DE PACO CON LOS PRODUCTOS Y ESAS COSAS (ONLINE)
                    }
                    break;
            }
        } // FIN DEL BUCLE DEL PROGRAMA

    }
}
