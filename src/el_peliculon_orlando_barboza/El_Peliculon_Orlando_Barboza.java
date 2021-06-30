package el_peliculon_orlando_barboza;

import javax.swing.JOptionPane;

public class El_Peliculon_Orlando_Barboza {

    // login/validacion de usuario
    final static String admin = "123"; // constante donde se almacena el usuario del administrador del sistema
    final static String pass = "123"; // constante donde se almacena la 
    static String usuario; // variable para almacenar el usuario ingresado
    static String clave; // variable para almacenar la clave ingresada

    // registro usuarios
    static int cantUsuarios; // variable mediante la cual se almacena la cantidad de usuarios a registrar  y se limita el tamaño de los arreglos
    static String[] nombreUsuario; // arreglo para almacenar los nombres de los usuarios ingresados
    static String[] idUsuario = new String[1]; // arreglo para almacenar los ID de los usuarios ingresados
    static String[] claves; // arreglo para almacenar las claves de los usuarios ingresados
    static String[] perfiles; // arreglo para almacenar los perfiles de los usuarios ingresados

    // ingreso de peliculas 
    // arreglos de terror 
    static String[] nombrePeliculaTerror; //arreglo para almacenar el nombre de las peliculas en la categoria terror
    static int[] copiasTerror; // arreglo para almacenar la cantidad de copias ingresadas por pelicula en la categoria terror 
    static double[] precioPeliculaTerror; // arreglo para almacenar el precio de cada pelicula ingresada en la categoria terror
    static String[] codigoTerror;// arreglo para almacenar el codigo de las peliculas ingresadas en la categoria terror 
    static int[] contadorTerror; // arreglo para almacenar la cantidad de peliculas alquiladas en la categoria terror
    static String[] alquiladoTerror; // arreglo para almacenar el nombre de peliculas alquiladas en la categoria terror

    //arreglos de suspenso
    static String[] nombrePeliculaSuspenso; //arreglo para almacenar el nombre de las peliculas de la categoria Suspenso
    static int[] copiasSuspenso; // arreglo para almacenar la cantidad de copias ingresadas por pelicula de la categoria suspenso
    static double[] precioPeliculaSuspenso; // arreglo para almacenar el precio de cada pelicula ingresada en la categoria suspenso
    static String[] codigoSuspenso; // arreglo para almacenar el codigo de las peliculas ingresadas en la categoria suspenso
    static int[] contadorSuspenso; // arreglo para almacenar la cantidad de peliculas alquiladas en la categoria suspenso
    static String[] alquiladoSuspenso; // arreglo para almacenar el nombre de peliculas alquiladas en la categoria suspenso
    static double[] totalSuspenso; // arreglo para almacenar el monto a cancelar por pelicula en la categoria suspenso

    // arreglos de comedia
    static String[] nombrePeliculaComedia; //arreglo para almacenar el nombre de las peliculas de la categoria Comedia
    static int[] copiasComedia; // arreglo para almacenar la cantidad de copias ingresadas por pelicula de la categoria comedia
    static double[] precioPeliculaComedia;// arreglo para almacenar el precio de cada pelicula ingresada en la categoria comedia
    static String[] codigoComedia;  // arreglo para almacenar el codigo de las peliculas ingresadas en la categoria comedia
    static int[] contadorComedia; // arreglo para almacenar la cantidad de peliculas alquiladas en la categoria comedia
    static String[] alquiladoComedia; // arreglo para almacenar el nombre de peliculas alquiladas en la categoria comedia
    static double[] totalComedia; // arreglo para almacenar el monto a cancelar por pelicula en la categoria comedia

    // arreglos de romantica
    static String[] nombrePeliculaRomantica; //arreglo para almacenar el nombre de las peliculas de la categoria Romantica
    static int[] copiasRomantica; // arreglo para almacenar la cantidad de copias ingresadas por pelicula de la categoria romantica
    static double[] precioPeliculaRomantica; // arreglo para almacenar el precio de cada pelicula ingresada en la categoria romantica
    static String[] codigoRomantica; // arreglo para almacenar el codigo de las peliculas ingresadas en la categoria romantica
    static int[] contadorRomantica; // arreglo para almacenar la cantidad de peliculas alquiladas en la categoria romantica
    static String[] alquiladoRomantica; // arreglo para almacenar el nombre de peliculas alquiladas en la categoria romantica
    static double[] totalRomantica; // arreglo para almacenar el monto a cancelar por pelicula en la categoria romantica

    //arreglos de educativa
    static String[] nombrePeliculaEducativa; //arreglo para almacenar el nombre de las peliculas de la categoria Educativa
    static int[] copiasEducativa; // arreglo para almacenar la cantidad de copias ingresadas por pelicula de la categoria educativa
    static double[] precioPeliculaEducativa; // arreglo para almacenar el precio de cada pelicula ingresada en la categoria educativa
    static String[] codigoEducativa; // arreglo para almacenar el codigo de las peliculas ingresadas en la categoria educativa
    static int[] contadorEducativa; // arreglo para almacenar la cantidad de peliculas alquiladas en la categoria educativa
    static String[] alquiladoEducativa; // arreglo para almacenar el nombre de peliculas alquiladas en la categoria educativa
    static double[] totalEducativa; // arreglo para almacenar el monto a cancelar por pelicula en la categoria educativa

    // Alquiler peliculas
    // Variables terror
    static String mensajeTerror = ""; // variable para mostrar mensajes ya sea de inventario o de resultado de alquileres
    static int cantTotalTerror = 0; // variable para almacenar la cantidad total de peliculas alquiladas de la categoria
    static double totalPagarTerror = 0; // variable para almacenar el monto total a pagar por todos los alquileres realizados en la categoria
    static int repetidoTerror = 0; // variable para manejar varios do while en modo de verificacion si el nombre de pelicula ingresado es repetido
    static int indicePrecioTerror = 0; // variable para obtener el indice de la pelicula para asi obtener el monto en ese indice y poder obtener el monto a pagar
    static int pVezTerror = 0; // variable para llenar el array de alquileres la primera vez que se alquila
    static double[] totalTerror; // arreglo para almacenar el monto a cancelar por pelicula en la categoria terror

    //Variables suspenso
    static String mensajeSuspenso = ""; // variable para mostrar mensajes ya sea de inventario o de resultado de alquileres
    static int cantTotalSuspenso = 0; // variable para almacenar la cantidad total de peliculas alquiladas de la categoria
    static double totalPagarSuspenso = 0; // variable para almacenar el monto total a pagar por todos los alquileres realizados en la categoria
    static int repetidoSuspenso = 0; // variable para manejar varios do while en modo de verificacion si el nombre de pelicula ingresado es repetido
    static int indicePrecioSuspenso = 0; // variable para obtener el indice de la pelicula para asi obtener el monto en ese indice y poder obtener el monto a pagar
    static int pVezSuspenso = 0; // variable para llenar el array de alquileres la primera vez que se alquila

    //Variables Comedia
    static String mensajeComedia = ""; // variable para mostrar mensajes ya sea de inventario o de resultado de alquileres
    static int cantTotalComedia = 0; // variable para almacenar la cantidad total de peliculas alquiladas de la categoria
    static double totalPagarComedia = 0; // variable para almacenar el monto total a pagar por todos los alquileres realizados en la categoria
    static int repetidoComedia = 0; // variable para manejar varios do while en modo de verificacion si el nombre de pelicula ingresado es repetido
    static int indicePrecioComedia = 0; // variable para obtener el indice de la pelicula para asi obtener el monto en ese indice y poder obtener el monto a pagar
    static int pVezComedia = 0; // variable para llenar el array de alquileres la primera vez que se alquila

    //Variables Romantica
    static String mensajeRomantica = ""; // variable para mostrar mensajes ya sea de inventario o de resultado de alquileres
    static int cantTotalRomantica = 0; // variable para almacenar la cantidad total de peliculas alquiladas de la categoria
    static double totalPagarRomantica = 0; // variable para almacenar el monto total a pagar por todos los alquileres realizados en la categoria
    static int repetidoRomantica = 0; // variable para manejar varios do while en modo de verificacion si el nombre de pelicula ingresado es repetido
    static int indicePrecioRomantica = 0; // variable para obtener el indice de la pelicula para asi obtener el monto en ese indice y poder obtener el monto a pagar
    static int pVezRomantica = 0; // variable para llenar el array de alquileres la primera vez que se alquila

    //Variables Educativas
    static String mensajeEducativa = ""; // variable para mostrar mensajes ya sea de inventario o de resultado de alquileres
    static int cantTotalEducativa = 0; // variable para almacenar la cantidad total de peliculas alquiladas de la categoria
    static double totalPagarEducativa = 0; // variable para almacenar el monto total a pagar por todos los alquileres realizados en la categoria
    static int repetidoEducativa = 0; // variable para manejar varios do while en modo de verificacion si el nombre de pelicula ingresado es repetido
    static int indicePrecioEducativa = 0; // variable para obtener el indice de la pelicula para asi obtener el monto en ese indice y poder obtener el monto a pagar
    static int pVezEducativa = 0; // variable para llenar el array de alquileres la primera vez que se alquila

    static int cantPeliculas; // variable para limitar el tamaño de los array

    // main
    public static void main(String[] args) {

        login(); // metodo de login para verificar usuarios ingresados
    }

    // metodo para validar string ingresados
    static boolean isNumber(String n) { // metodo que verifica si el valor que se ingresa es numero o no
        try { // abre try
            Integer.parseInt(n); // parsea String ingresado            
            return false; // retorna false
        } catch (NumberFormatException excepcion) { // abre catch
            JOptionPane.showMessageDialog(null, "Valor ingresado es incorrecto, intente de nuevo", "El Peliculon", 1);// muestra mensaje si no es numero
            return true;// retorna false
        }// cierra catch
    }// cierra metodo

    // metodo del login
    public static void login() {
        JOptionPane.showMessageDialog(null, "Bienvenido a 'El Peliculon'", "El Peliculon", 1);// mensaje de bienvenida al programa
        do { // abre do while
            usuario = JOptionPane.showInputDialog("Digite su usuario"); // solicita el usuario y lo guarda en variable  
        } while (isNumber(usuario)); // se sale hasta que se ingrese algo

        do {// abre do while
            clave = JOptionPane.showInputDialog("Digite su contraseña"); // solicita la clave y la guarda en variable
        } while (isNumber(clave)); // se sale hasta que se ingrese algo

        if (usuario.equals(admin)) { // revisa si el usuario es igual a la constante quemada
            if (clave.equals(pass)) { // si si, entonces revisa la clave tambien es igual a la quemada
                JOptionPane.showMessageDialog(null, "Bienvenido Administrador ", "El Peliculon", 1); // de ser asi, da la bienvenida
                menuAdmin(); // y muestra el menu de administrador
            } else { // si no
                JOptionPane.showMessageDialog(null, "Usuario o constraseña incorrecta", "El Peliculon", 1); // muestra mensaje 
                login(); // y devuelve al login
            }// fin else
        } else {// else del primer if
            buscaUsuarios();// si el usuario no es igual tns se va al metodo para buscar usuarios ingresados 
        }// fin else

    }// fin metodo

    // metodo de ingreso de usuarios 
    public static void registroUsuario() {
        char opcion; // variable para controlar switch al final del metodo
        String mensajeRegistro = ""; // variable para almacenar mensaje

        cantUsuarios = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de usuarios que desea ingresar")); // se solicita ingresar la cantidad de usuarios a registrar y se guarda en variable
        nombreUsuario = new String[cantUsuarios]; // se instancia el arreglo donde se guardan los nombres de los usuarios usando como tamño la cantidad de usuarios ingresados previamente
        idUsuario = new String[cantUsuarios]; // se instancia el arreglo donde se guardan los ID de los usuarios usando como tamño la cantidad de usuarios ingresados previamente
        claves = new String[cantUsuarios]; // se instancia el arreglo donde se guardan las claves de los usuarios usando como tamño la cantidad de usuarios ingresados previamente
        perfiles = new String[cantUsuarios]; // se instancia el arreglo donde se guardan los perfiles de los usuarios usando como tamño la cantidad de usuarios ingresados previamente

        for (int i = 0; i < idUsuario.length; i++) { // se recorre for para guardar datos en los arreglos
            nombreUsuario[i] = JOptionPane.showInputDialog("Digite el nombre del usuario # " + (i + 1)); // se ingresa nombre de  usuario y se guarda en arreglo
            idUsuario[i] = JOptionPane.showInputDialog("Digite identificacion de " + "[ " + nombreUsuario[i] + " ]"); // se ingresa ID de usuario y se guarda en arreglo
            claves[i] = JOptionPane.showInputDialog("Digite una clave para " + "[ " + nombreUsuario[i] + " ]"); // se ingresa clave y se guarda en arreglo
            do {
                perfiles[i] = JOptionPane.showInputDialog("Digite el tipo de usuario (admin/cliente) de " + "[ " + nombreUsuario[i] + " ]"); // se ingresa perfil y se guarda en arreglos  
            } while (!perfiles[i].equals("admin") && !perfiles[i].equals("cliente"));
        }

        mensajeRegistro += "Usuarios Ingresados\n"; // mensaje concatenado en variable
        mensajeRegistro += "-------------------------------\n"; // mensaje concatenado en variable

        for (int i = 0; i < idUsuario.length; i++) { // se recorre for para obtener informacion de los arreglos
            mensajeRegistro += "Nombre: " + nombreUsuario[i] + "\n" // se concatena informacion de los arreglos
                    + "Usuario: " + idUsuario[i] + "\n" // se concatena informacion de los arreglos
                    + "Contraseña: " + claves[i] + "\n" // se concatena informacion de los arreglos
                    + "Tipo de Usuario: " + perfiles[i] + "\n" // se concatena informacion de los arreglos
                    + "-------------------------------\n"; // mensaje concatenado en variable
        }
        mensajeRegistro += "NOTA: Recuerde que su identificacion es el usuario para ingresar al sistema"; // se concatena mensaje recordando que el ID sera necesario para ingresar
        JOptionPane.showMessageDialog(null, mensajeRegistro, "El Peliculon", 1); // se imprimen todos los mensajes concatenados

        opcion = JOptionPane.showInputDialog("Que accion desea realizar: " // se consulta que accion se desea ejecutar
                + "\n ( M ) - Salir al menu" // salir del menu
                + "\n ( L ) - Salir al login" // salir al login 
                + "\n ( P ) - Salir del programa").toUpperCase().charAt(0); // salir completamente del programa

        switch (opcion) { // se usa la opcion en un switch
            case 'M':
                menuAdmin(); // si se selecciona M se redirige al menu de administrador
                break; // se sale del switch
            case 'L':
                login(); // si se selecciona L, se redirige a menu de login
                break; // se sale del switch
            case 'P':
                salirPrograma(); // si se selecciona P se sale del programa
                break; // se sale del switch 
        }
    }

    // metodo de buscar usuarios
    public static void buscaUsuarios() {
        int bandera = 0; // se crea variable bandera y se inicializa, para usos posteriores en ifs
        String perfil = ""; // variable para guardar mensajes 
        String nombreEncontrado = ""; // variable para guardar el usuario en el indice en la variable

        if (idUsuario[0] != null) { // si el primer indice del arreglo no esta nulo
            for (int i = 0; i < idUsuario.length; i++) {// se recorre for 

                if (idUsuario[i].equals(usuario) && claves[i].equals(clave)) { // si el usuario y la clave son iguales
                    bandera = 1; // se asigna 1 a la bandera
                    nombreEncontrado = nombreUsuario[i];
                    perfil = perfiles[i]; // se guarda valor del indice en la variable
                    break; // se sale del for
                } else { // si no son igual
                    bandera = 0; // la bandera se mantiene en 0
                }
            }

            if (bandera == 1 && perfil.equals("admin")) { // si el perfil es admin y bandera en 1
                for (int i = 0; i < idUsuario.length; i++) {// se recorre for
                    if (nombreUsuario[i].equals(nombreEncontrado)) { // if para buscar match entre nombre ingresado y arreglo de nombres
                        JOptionPane.showMessageDialog(null, "Bienvenido " + nombreUsuario[i]); // muestra mensaje dando la bienvenida al usuario
                        menuAdmin(); // lo redirige al menu de administrador
                        break;// sale de for
                    }// fin de if
                }// fin de for
            } else { // sino
                if (bandera == 1 && perfil.equals("cliente")) { // si el perfil es cliente y bandera en 1
                    for (int i = 0; i < idUsuario.length; i++) {// se recorre for
                        if (nombreUsuario[i].equals(nombreEncontrado)) { // if para buscar match entre nombre ingresado y arreglo de nombres
                            JOptionPane.showMessageDialog(null, "Bienvenido " + nombreUsuario[i]); // muestra mensaje dando la bienvenida al usuario
                            menuUser(); // lo redigire al menu de cliente
                            break;// sale de for
                        }// fin if
                    }//fin for
                } else { // sino
                    JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta", "El Peliculon", 1); // muestra mensaje indicando que el usuario y la clave estan incorrectas 
                }// fin else
            }//fin else
        } else { // si el indice 0 del arreglo de IDs esta vacio
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta", "El Peliculon", 1); // muestra mensaje indicando que el usuario y la clave estan incorrectas 
        }//fin else
        login();// redirige a login
    }

    // metodo del menu de administrador
    public static void menuAdmin() {
        char opcion = JOptionPane.showInputDialog("Ingrese la opcion deseada: \n" // se consulta opcion a escoger en el menu
                + "( L ) - Retornar al login\n" // L para retornar al login 
                + "( R ) - Registrar un nuevo usuario\n" // R para registrar un nuevo usuario
                + "( I ) -  Ingresar Pelicula(s)\n" // I para ingresar peliculas
                + "( A ) - Alquilar Pelicula(s)\n" // A para alquilar peliculas
                + "( C ) - Ingresar a Contabilidad\n" // C para ingresar a contabilidad 
                + "( S ) - Salir del programa").toUpperCase().charAt(0); // S para salir del programa

        switch (opcion) { // se usa la variable con la opcion en el switch
            case 'L':  //opcion L
                login(); // redirige al metodo del login
                break; // se sale del switch
            case 'R': // opcion R
                JOptionPane.showMessageDialog(null, "Selecciono registrar un nuevo usuario", "El Peliculon", 1); // muestra mensaje de bienvenida 
                registroUsuario(); // redirige a metodo de registro de usuario
                break; // se sale del for
            case 'I': // opcion I
                JOptionPane.showMessageDialog(null, "Selecciono ingresar una nueva pelicula", "El Peliculon", 1); // muestra mensaje de bienvenida 
                ingresoPeliculas(); // redirige a metodo de ingreso de peliculas
                break; // se sale del switch
            case 'A': // opcion A
                JOptionPane.showMessageDialog(null, "Selecciono alquilar una nueva pelicula", "El Peliculon", 1); // muestra mensaje de bienvenida
                alquilerPeliculas(); // redirige al metodo de alquier de peliculas
                break; // se sale del switch
            case 'C':  // opcion C
                JOptionPane.showMessageDialog(null, "Selecciono ingresar a contabilidad", "El Peliculon", 1); // muestra mensaje de bienvenida
                moduloContable(); // redirige al metodo contable
                break; // se sale del switch
            case 'S': // opcion S
                JOptionPane.showMessageDialog(null, "Selecciono salir del programa", "El Peliculon", 1); // muestra mensaje de bienvenida
                salirPrograma(); // redirige a metodo para salir del programa
                break; // se sale del switch
            default: // si no se ingresa ninguna de las opciones
                JOptionPane.showMessageDialog(null, "Valor ingresado es invalido", "El Peliculon", 1);// muestra mensaje de opcion incorrecta
                break; // sale del switch
        }
    }

    // metodo de menu de usuario
    public static void menuUser() {
        char opcion = JOptionPane.showInputDialog("Ingrese la opcion deseada: " // se consulta opcion a escoger en el menu
                + "\n ( L ) - Retornar al login" // L para retornar al login 
                + "\n ( A ) - Alquilar una pelicula" // A para alquilar peliculas
                + "\n ( S ) - Salir del programa").toUpperCase().charAt(0); // S para salir del programa

        switch (opcion) { // se usa la variable con la opcion en el switch
            case 'L': //opcion L
                login(); // redirige al metodo del login
                break; // se sale del switch
            case 'A': // opcion A
                JOptionPane.showMessageDialog(null, "Selecciono alquilar una pelicula", "El Peliculon", 1); // muestra mensaje de bienvenida
                alquilerPeliculas(); // redirige al metodo de alquier de peliculas
                break; // se sale del switch
            case 'S': // opcion S
                JOptionPane.showMessageDialog(null, "Selecciono salir del programa", "El Peliculon", 1); // muestra mensaje de bienvenida
                salirPrograma(); // redirige a metodo para salir del programa
                break; // se sale del switch
            default: // si no se ingresa ninguna de las opciones
                JOptionPane.showMessageDialog(null, "Valor ingresado es invalido", "El Peliculon", 1); // muestra mensaje de opcion incorrecta
                break; // sale del switch
        }// fin del switch
    } // fin del metodo

    //metodo para ingresar Peliculas
    public static void ingresoPeliculas() {
        char cont; // variable para controlar si se desea seguir agregando peliculas
        char contDos; // variabla para consultar si quiere ver peliculas ingresadas
        char opcion; // variable para almacenar la opcion en los case
        char categoria; // variable para almacenar la categoria deseada
        String pIngresada; // variable para almacenar el nombre de la pelicula ingresada para usos posteriores
        int contador; // variable para manejar los do while
        char agMas; // variable para manejar si se quieren seguir agregando peliculas a las existentes

        do { // do while para manejar si se quiere seguir ingresando peliculas 
            categoria = JOptionPane.showInputDialog("Seleccione la categoria en la cual desea ingresar una pelicula: " // se ingresa la opcion deseada y se guarda en variable categoria
                    + "\n ( T ) - Terror" // T para terror
                    + "\n ( S ) - Suspenso" // S para suspenso
                    + "\n ( C ) - comedia" // C para comedia
                    + "\n ( R ) - Romanticas" // R para romanticas
                    + "\n ( E ) - Educativas").toUpperCase().charAt(0); // E para educativas

            switch (categoria) { // switch con las categorias
                case 'T': //categoria terror 
                    JOptionPane.showMessageDialog(null, "Selecciono la categoria de Terror", "Categoria Terror, El Peliculon", 1); // mensaje indicando la categoria seleccionada
                    opcion = JOptionPane.showInputDialog("Que desea realizar: " // case para escoger la opcion deseada
                            + "\n ( I ) -  Ingresar nueva pelicula" // se ingresan nuevas peliculas
                            + "\n ( A ) - Agregar unidades a inventario").toUpperCase().charAt(0); // se agregan peliculas a las existentes
                    switch (opcion) { // se usa variable con opcion en switch
                        case 'I': // opcion I
                            cantPeliculas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas peliculas desea ingresar?")); // se pregunta la cantidad de peliculas nuevas a ingresar
                            nombrePeliculaTerror = new String[cantPeliculas]; // se instancia arreglo donde se guardaran los nombres de peliculas con la cantidad ingresada
                            copiasTerror = new int[cantPeliculas]; // se instancia arreglo donde se guardaran la cantidad de peliculas con la cantidad ingresada
                            precioPeliculaTerror = new double[cantPeliculas]; // se instancia arreglo donde se guardaran el precio de las peliculas con la cantidad ingresada
                            codigoTerror = new String[cantPeliculas]; // se instancia arreglo donde se guardaran el codigo de las peliculas con la cantidad ingresada

                            for (int i = 0; i < nombrePeliculaTerror.length; i++) { // for para ingresar peliculas
                                pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa nombre y se guarda en variable 
                                nombrePeliculaTerror[i] = pIngresada; // se asigna el valor de la variable al arreglo de los nombres de las peliculas
                                copiasTerror[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a ingresar de la pelicula " + "[" + pIngresada + "]")); // se ingresa la cantidad de copias y se guarda en arreglo
                                precioPeliculaTerror[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del alquiler de la pelicula " + "[" + pIngresada + "]")); // se ingresa el precio de las peliculas y se guarda en el arreglo
                                codigoTerror[i] = JOptionPane.showInputDialog("Digite el codigo de la pelicula " + "[" + pIngresada + "]"); // se ingresa el codigo de las peliculas y se guarda en el arreglo
                            }
                            break; // se sale del case
                        case 'A': // opcion A
                            if (nombrePeliculaTerror != null) {// if para revisar si arreglo esta vacio
                                do { // do while para controla si se quiere seguir agregando cantidades
                                    contador = 0; // se inicializa en cero la variable q controla el do while
                                    do { // do while para controlar si se encuentra la pelicula ingresada
                                        pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa la pelicula deseada y se guarda en variable
                                        for (int i = 0; i < nombrePeliculaTerror.length; i++) { // se recorre arreglo
                                            if (nombrePeliculaTerror[i].equals(pIngresada)) { // si el nombre ingresado es igual al valor en el indice, se ingresa
                                                JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " encontrada en el inventario", "Categoria Terror, El Peliculon", 1); // se indica que se encontro la pelicula en el inventario
                                                copiasTerror[i] += Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a agregar de la pelicula " + "[" + pIngresada + "]")); // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar                                    
                                                contador = 1; // se incrementa contador para salir del primer do while y seguir con el programa
                                                break; // sale del for 
                                            }
                                        }
                                        if (contador == 0) { // si el contador es 0, se imprime mensaje indicando que no se pudo encontrar la pelicula en el inventario
                                            JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " no existe en el inventario", "Categoria Terror, El Peliculon", 1); // mensaje en pantalla
                                        }
                                    } while (contador == 0); // fin del primer do while
                                    agMas = JOptionPane.showInputDialog(null, "Desea seguir agregando cantidades al inventario? 'S' o 'N'").toUpperCase().charAt(0); // se consulta si se quiere seguir agregando copias 
                                } while (agMas == 'S'); // fin del segundo do while
                            } else { // inicio else
                                JOptionPane.showMessageDialog(null, "No puede agregar peliculas en esta categoria, no hay peliculas ingresadas", "Categoria Terror, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                            }//fin else
                            break; // se sale del primer case
                        default: // si no se eligio alguna de las opciones
                            JOptionPane.showMessageDialog(null, "Valor ingresado es invalido", "Categoria Terror, El Peliculon", 1); // se muestra este mensaje
                            break; // se sale de case
                    } // se cierra el segundo case 
                    break; // se sale del segundo case
                case 'S': // categoria Suspenso
                    JOptionPane.showMessageDialog(null, "Selecciono la categoria de Suspenso", "Categoria Suspenso, El Peliculon", 1); // mensaje indicando la categoria seleccionada
                    opcion = JOptionPane.showInputDialog("Que desea realizar: " // case para escoger la opcion deseada
                            + "\n ( I ) -  Ingresar nueva pelicula" // se ingresan nuevas peliculas
                            + "\n ( A ) - Agregar unidades a inventario").toUpperCase().charAt(0); // se agregan peliculas a las existentes
                    switch (opcion) { // se usa variable con opcion para switch
                        case 'I': // opcion I
                            cantPeliculas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas peliculas desea ingresar?")); // se pregunta la cantidad de peliculas nuevas a ingresar
                            nombrePeliculaSuspenso = new String[cantPeliculas]; // se instancia arreglo donde se guardaran los nombres de peliculas con la cantidad ingresada
                            copiasSuspenso = new int[cantPeliculas]; // se instancia arreglo donde se guardaran la cantidad de peliculas con la cantidad ingresada
                            precioPeliculaSuspenso = new double[cantPeliculas]; // se instancia arreglo donde se guardaran el precio de las peliculas con la cantidad ingresada
                            codigoSuspenso = new String[cantPeliculas]; // se instancia arreglo donde se guardaran el codigo de las peliculas con la cantidad ingresada

                            for (int i = 0; i < nombrePeliculaSuspenso.length; i++) { // for para ingresar peliculas
                                pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa nombre y se guarda en variable 
                                nombrePeliculaSuspenso[i] = pIngresada; // se asigna el valor de la variable al arreglo de los nombres de las peliculas
                                copiasSuspenso[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a ingresar de la pelicula " + "[" + pIngresada + "]")); // se ingresa la cantidad de copias y se guarda en arreglo
                                precioPeliculaSuspenso[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del alquiler de la pelicula " + "[" + pIngresada + "]")); // se ingresa el precio de las peliculas y se guarda en el arreglo
                                codigoSuspenso[i] = JOptionPane.showInputDialog("Digite el codigo de la pelicula " + "[" + pIngresada + "]"); // se ingresa el codigo de las peliculas y se guarda en el arreglo
                            }
                            break; // se sale del case
                        case 'A': // opcion A
                            if (nombrePeliculaSuspenso != null) {// if para revisar si arreglo esta vacio
                                do { // do while para controla si se quiere seguir agregando cantidades
                                    contador = 0; // se inicializa en cero la variable q controla el do while
                                    do { // do while para controlar si se encuentra la pelicula ingresada
                                        pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa la pelicula deseada y se guarda en variable
                                        for (int i = 0; i < nombrePeliculaSuspenso.length; i++) { // se recorre arreglo
                                            if (nombrePeliculaSuspenso[i].equals(pIngresada)) { // si el nombre ingresado es igual al valor en el indice, se ingresa
                                                JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " encontrada en el inventario", "Categoria Suspenso, El Peliculon", 1); // se indica que se encontro la pelicula en el inventario
                                                copiasSuspenso[i] += Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a agregar de la pelicula " + "[" + pIngresada + "]")); // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar                                    
                                                contador = 1; // se incrementa contador para salir del primer do while y seguir con el programa
                                                break; // sale del for 
                                            }// fin if
                                        }// fin for
                                        if (contador == 0) { // si el contador es 0, se imprime mensaje indicando que no se pudo encontrar la pelicula en el inventario
                                            JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " no existe en el inventario", "Categoria Suspenso, El Peliculon", 1); // mensaje en pantalla
                                        }// fin if
                                    } while (contador == 0); // fin del primer do while
                                    agMas = JOptionPane.showInputDialog(null, "Desea seguir agregando cantidades al inventario? 'S' o 'N'").toUpperCase().charAt(0); // se consulta si se quiere seguir agregando copias 
                                } while (agMas == 'S'); // fin del segundo do while
                            } else { // inicio else
                                JOptionPane.showMessageDialog(null, "No puede agregar peliculas en esta categoria, no hay peliculas ingresadas", "Categoria Suspenso, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                            }//fin else
                            break; // se sale del primer case
                        default: // si no se eligio alguna de las opciones
                            JOptionPane.showMessageDialog(null, "Valor ingresado es invalido", "Categoria Suspenso, El Peliculon", 1); // se muestra este mensaje
                            break;// se sale del case
                    } // se cierra el segundo case 
                    break; // se sale del segundo case
                case 'C': // opcion C
                    JOptionPane.showMessageDialog(null, "Selecciono la categoria de Comedia", "Categoria Comedia, El Peliculon", 1); // mensaje indicando la categoria seleccionada
                    opcion = JOptionPane.showInputDialog("Que desea realizar: " // case para escoger la opcion deseada
                            + "\n ( I ) -  Ingresar nueva pelicula" // se ingresan nuevas peliculas
                            + "\n ( A ) - Agregar unidades a inventario").toUpperCase().charAt(0); // se agregan peliculas a las existentes
                    switch (opcion) { // se usa variable con opcion en switch
                        case 'I': // opcion I
                            cantPeliculas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas peliculas desea ingresar?")); // se pregunta la cantidad de peliculas nuevas a ingresar
                            nombrePeliculaComedia = new String[cantPeliculas]; // se instancia arreglo donde se guardaran los nombres de peliculas con la cantidad ingresada
                            copiasComedia = new int[cantPeliculas]; // se instancia arreglo donde se guardaran la cantidad de peliculas con la cantidad ingresada
                            precioPeliculaComedia = new double[cantPeliculas]; // se instancia arreglo donde se guardaran el precio de las peliculas con la cantidad ingresada
                            codigoComedia = new String[cantPeliculas]; // se instancia arreglo donde se guardaran el codigo de las peliculas con la cantidad ingresada

                            for (int i = 0; i < nombrePeliculaComedia.length; i++) { // for para ingresar peliculas
                                pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa nombre y se guarda en variable 
                                nombrePeliculaComedia[i] = pIngresada; // se asigna el valor de la variable al arreglo de los nombres de las peliculas
                                copiasComedia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a ingresar de la pelicula " + "[" + pIngresada + "]")); // se ingresa la cantidad de copias y se guarda en arreglo
                                precioPeliculaComedia[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del alquiler de la pelicula " + "[" + pIngresada + "]")); // se ingresa el precio de las peliculas y se guarda en el arreglo
                                codigoComedia[i] = JOptionPane.showInputDialog("Digite el codigo de la pelicula " + "[" + pIngresada + "]"); // se ingresa el codigo de las peliculas y se guarda en el arreglo
                            }
                            break; // se sale del case
                        case 'A': // opcion A
                            if (nombrePeliculaComedia != null) {// if para revisar si arreglo esta vacio
                                do { // do while para controla si se quiere seguir agregando cantidades
                                    contador = 0; // se inicializa en cero la variable q controla el do while
                                    do { // do while para controlar si se encuentra la pelicula ingresada
                                        pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa la pelicula deseada y se guarda en variable
                                        for (int i = 0; i < nombrePeliculaComedia.length; i++) { // se recorre arreglo
                                            if (nombrePeliculaComedia[i].equals(pIngresada)) { // si el nombre ingresado es igual al valor en el indice, se ingresa
                                                JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " encontrada en el inventario", "Categoria Comedia, El Peliculon", 1); // se indica que se encontro la pelicula en el inventario
                                                copiasComedia[i] += Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a agregar de la pelicula " + "[" + pIngresada + "]")); // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar                                    
                                                contador = 1; // se incrementa contador para salir del primer do while y seguir con el programa
                                                break; // sale del for 
                                            }//fin if
                                        }//fin for
                                        if (contador == 0) { // si el contador es 0, se imprime mensaje indicando que no se pudo encontrar la pelicula en el inventario
                                            JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " no existe en el inventario", "Categoria Comedia, El Peliculon", 1); // mensaje en pantalla
                                        }//fin if
                                    } while (contador == 0); // fin del primer do while
                                    agMas = JOptionPane.showInputDialog(null, "Desea seguir agregando cantidades al inventario? 'S' o 'N'").toUpperCase().charAt(0); // se consulta si se quiere seguir agregando copias 
                                } while (agMas == 'S'); // fin del segundo do while  
                            } else { // inicio else
                                JOptionPane.showMessageDialog(null, "No puede agregar peliculas en esta categoria, no hay peliculas ingresadas", "Categoria Comedia, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                            }//fin else
                            break; // se sale del primer case
                        default: // si no se eligio alguna de las opciones
                            JOptionPane.showMessageDialog(null, "Valor ingresado es invalido", "Categoria Comedia, El Peliculon", 1); // se muestra este mensaje
                            break; // se sale del case
                    } // se cierra el segundo case 
                    break; // se sale del segundo case
                case 'R': //categoria Romantica
                    JOptionPane.showMessageDialog(null, "Selecciono la categoria de Romanticas", "Categoria de Romanticas, El Peliculon", 1); // mensaje indicando la categoria seleccionada
                    opcion = JOptionPane.showInputDialog("Que desea realizar: " // case para escoger la opcion deseada
                            + "\n ( I ) -  Ingresar nueva pelicula" // se ingresan nuevas peliculas
                            + "\n ( A ) - Agregar unidades a inventario").toUpperCase().charAt(0); // se agregan peliculas a las existentes
                    switch (opcion) { // se usa variable con opcion para switch
                        case 'I': // opcion I
                            cantPeliculas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas peliculas desea ingresar?")); // se pregunta la cantidad de peliculas nuevas a ingresar
                            nombrePeliculaRomantica = new String[cantPeliculas]; // se instancia arreglo donde se guardaran los nombres de peliculas con la cantidad ingresada
                            copiasRomantica = new int[cantPeliculas]; // se instancia arreglo donde se guardaran la cantidad de peliculas con la cantidad ingresada
                            precioPeliculaRomantica = new double[cantPeliculas]; // se instancia arreglo donde se guardaran el precio de las peliculas con la cantidad ingresada
                            codigoRomantica = new String[cantPeliculas]; // se instancia arreglo donde se guardaran el codigo de las peliculas con la cantidad ingresada

                            for (int i = 0; i < nombrePeliculaRomantica.length; i++) { // for para ingresar peliculas
                                pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa nombre y se guarda en variable 
                                nombrePeliculaRomantica[i] = pIngresada; // se asigna el valor de la variable al arreglo de los nombres de las peliculas
                                copiasRomantica[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a ingresar de la pelicula " + "[" + pIngresada + "]")); // se ingresa la cantidad de copias y se guarda en arreglo
                                precioPeliculaRomantica[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del alquiler de la pelicula " + "[" + pIngresada + "]")); // se ingresa el precio de las peliculas y se guarda en el arreglo
                                codigoRomantica[i] = JOptionPane.showInputDialog("Digite el codigo de la pelicula " + "[" + pIngresada + "]"); // se ingresa el codigo de las peliculas y se guarda en el arreglo
                            }
                            break; // se sale del case
                        case 'A':
                            if (nombrePeliculaRomantica != null) {// if para revisar si arreglo esta vacio
                                do { // do while para controla si se quiere seguir agregando cantidades
                                    contador = 0; // se inicializa en cero la variable q controla el do while
                                    do { // do while para controlar si se encuentra la pelicula ingresada
                                        pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa la pelicula deseada y se guarda en variable
                                        for (int i = 0; i < nombrePeliculaRomantica.length; i++) { // se recorre arreglo
                                            if (nombrePeliculaRomantica[i].equals(pIngresada)) { // si el nombre ingresado es igual al valor en el indice, se ingresa
                                                JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " encontrada en el inventario", "Categoria de Romanticas, El Peliculon", 1); // se indica que se encontro la pelicula en el inventario
                                                copiasRomantica[i] += Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a agregar de la pelicula " + "[" + pIngresada + "]")); // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar                                    
                                                contador = 1; // se incrementa contador para salir del primer do while y seguir con el programa
                                                break; // sale del for 
                                            }//fin if
                                        }//fin for
                                        if (contador == 0) { // si el contador es 0, se imprime mensaje indicando que no se pudo encontrar la pelicula en el inventario
                                            JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " no existe en el inventario", "Categoria de Romanticas, El Peliculon", 1); // mensaje en pantalla
                                        }//fin if
                                    } while (contador == 0); // fin del primer do while
                                    agMas = JOptionPane.showInputDialog(null, "Desea seguir agregando cantidades al inventario? 'S' o 'N'").toUpperCase().charAt(0); // se consulta si se quiere seguir agregando copias 
                                } while (agMas == 'S'); // fin del segundo do while  
                            } else { // inicio else
                                JOptionPane.showMessageDialog(null, "No puede agregar peliculas en esta categoria, no hay peliculas ingresadas", "Categoria Romantica, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                            }//fin else
                            break; // se sale del primer case
                        default: // si no se eligio alguna de las opciones
                            JOptionPane.showMessageDialog(null, "Valor ingresado es invalido", "Categoria Romantica, El Peliculon", 1); // se muestra este mensaje
                            break; // se sale del case
                    } // se cierra el segundo case 
                    break; // se sale del segundo case
                case 'E': // opcion E
                    JOptionPane.showMessageDialog(null, "Selecciono la categoria de Educativas", "Categoria de Educativas, El Peliculon", 1); // mensaje indicando la categoria seleccionada
                    opcion = JOptionPane.showInputDialog("Que desea realizar: " // case para escoger la opcion deseada
                            + "\n ( I ) -  Ingresar nueva pelicula" // se ingresan nuevas peliculas
                            + "\n ( A ) - Agregar unidades a inventario").toUpperCase().charAt(0); // se agregan peliculas a las existentes
                    switch (opcion) { // se usa variable con opcion para switch
                        case 'I': // opcion I
                            cantPeliculas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas peliculas desea ingresar?")); // se pregunta la cantidad de peliculas nuevas a ingresar
                            nombrePeliculaEducativa = new String[cantPeliculas]; // se instancia arreglo donde se guardaran los nombres de peliculas con la cantidad ingresada
                            copiasEducativa = new int[cantPeliculas]; // se instancia arreglo donde se guardaran la cantidad de peliculas con la cantidad ingresada
                            precioPeliculaEducativa = new double[cantPeliculas]; // se instancia arreglo donde se guardaran el precio de las peliculas con la cantidad ingresada
                            codigoEducativa = new String[cantPeliculas]; // se instancia arreglo donde se guardaran el codigo de las peliculas con la cantidad ingresada

                            for (int i = 0; i < nombrePeliculaEducativa.length; i++) { // for para ingresar peliculas
                                pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa nombre y se guarda en variable 
                                nombrePeliculaEducativa[i] = pIngresada; // se asigna el valor de la variable al arreglo de los nombres de las peliculas
                                copiasEducativa[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a ingresar de la pelicula " + "[" + pIngresada + "]")); // se ingresa la cantidad de copias y se guarda en arreglo
                                precioPeliculaEducativa[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del alquiler de la pelicula " + "[" + pIngresada + "]")); // se ingresa el precio de las peliculas y se guarda en el arreglo
                                codigoEducativa[i] = JOptionPane.showInputDialog("Digite el codigo de la pelicula " + "[" + pIngresada + "]"); // se ingresa el codigo de las peliculas y se guarda en el arreglo
                            }//  fin del for
                            break; // se sale del case
                        case 'A': // opcion A
                            if (nombrePeliculaEducativa != null) {// if para revisar si arreglo esta vacio
                                do { // do while para controla si se quiere seguir agregando cantidades
                                    contador = 0; // se inicializa en cero la variable q controla el do while
                                    do { // do while para controlar si se encuentra la pelicula ingresada
                                        pIngresada = JOptionPane.showInputDialog("Digite el nombre de la pelicula "); // se ingresa la pelicula deseada y se guarda en variable
                                        for (int i = 0; i < nombrePeliculaEducativa.length; i++) { // se recorre arreglo
                                            if (nombrePeliculaEducativa[i].equals(pIngresada)) { // si el nombre ingresado es igual al valor en el indice, se ingresa
                                                JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " encontrada en el inventario", "Categoria de Educativas, El Peliculon", 1); // se indica que se encontro la pelicula en el inventario
                                                copiasEducativa[i] += Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de copias a agregar de la pelicula " + "[" + pIngresada + "]")); // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar                                    
                                                contador = 1; // se incrementa contador para salir del primer do while y seguir con el programa
                                                break; // sale del for 
                                            }// fin del if
                                        }// fin del for
                                        if (contador == 0) { // si el contador es 0, se imprime mensaje indicando que no se pudo encontrar la pelicula en el inventario
                                            JOptionPane.showMessageDialog(null, "Pelicula " + "[" + pIngresada + "]" + " no existe en el inventario", "Categoria de Educativas, El Peliculon", 1); // mensaje en pantalla
                                        }// fin del if
                                    } while (contador == 0); // fin del primer do while
                                    agMas = JOptionPane.showInputDialog(null, "Desea seguir agregando cantidades al inventario? 'S' o 'N'").toUpperCase().charAt(0); // se consulta si se quiere seguir agregando copias 
                                } while (agMas == 'S'); // fin del segundo do while 
                            } else { // inicio else
                                JOptionPane.showMessageDialog(null, "No puede agregar peliculas en esta categoria, no hay peliculas ingresadas", "Categoria Educativa, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                            }//fin else
                            break; // se sale del primer case
                        default: // si no se eligio alguna de las opciones
                            JOptionPane.showMessageDialog(null, "Valor ingresado es invalido", "Categoria Educativa, El Peliculon", 1); // se muestra este mensaje
                            break; // se sale del case
                    } // se cierra el segundo case 
                    break; // se sale del segundo case
                default: // si no se ingresa ninguna de las opciones
                    JOptionPane.showMessageDialog(null, "Valor ingresado es invalido", "El Peliculon", 1); // se muestra mensaje
                    break; // se sale del case
            }
            cont = JOptionPane.showInputDialog(null, "Desea seguir ingresando peliculas? 'S' o 'N'").toUpperCase().charAt(0); // se pregunta si quiere seguir ingresando peliculas

        } while (cont == 'S'); // si si se devuelve al do

        do {
            categoria = JOptionPane.showInputDialog("Si lo desea, seleccione la categoria en la que desea consultar existencias : " // se consulta la opcion que se desea ingresar y se guarda en variable categoria
                    + "\n ( T ) - Ingresos en categoria Terror" // T para terror 
                    + "\n ( S ) - Ingresos en categoria Suspenso" // S para suspenso
                    + "\n ( C ) - Ingresos en categoria Comedia" // C para comedia 
                    + "\n ( R ) - Ingresos en categoria Romantica" // R para romanticas
                    + "\n ( E ) - Ingresos en categoria Educativa" // E para educativa
                    + "\n ( M ) - Salir al menu principal").toUpperCase().charAt(0); // M para salir al menu principal

            switch (categoria) { //se usa valor ingresado para elegir categoria
                case 'T': // categoria terror
                    if (nombrePeliculaTerror != null) {// if para revisar si arreglo esta vacio
                        mensajeTerror = ""; // se limpia variable para mostrar inventario
                        mensajeTerror += "Peliculas de Terror ingresadas\n"; // concatenacion de mensajes mostrando inventario
                        mensajeTerror += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaTerror.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeTerror += "Nombre de la Pelicula: " + nombrePeliculaTerror[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasTerror[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaTerror[i] + " colones\n"
                                    + "Codigo de la pelicula: " + codigoTerror[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeTerror, "Categoria Terror, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion                        
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No hay existencias ingresadas en esta categoria", "Categoria Terror, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break;//sale del switch
                case 'S': // caegoria suspenso
                    if (nombrePeliculaSuspenso != null) {// if para revisar si arreglo esta vacio
                        mensajeSuspenso = ""; // se limpia variable para mostrar inventario
                        mensajeSuspenso += "Peliculas de Suspenso ingresadas\n"; // concatenacion de mensajes mostrando inventario
                        mensajeSuspenso += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaSuspenso.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeSuspenso += "Nombre de la Pelicula: " + nombrePeliculaSuspenso[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasSuspenso[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaSuspenso[i] + " colones\n"
                                    + "Codigo de la pelicula: " + codigoSuspenso[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeSuspenso, "Categoria Suspenso, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion                        
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No hay existencias ingresadas en esta categoria", "Categoria Suspenso, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break;//sale del switch  
                case 'C': // caegoria Comedia
                    if (nombrePeliculaComedia != null) {// if para revisar si arreglo esta vacio
                        mensajeComedia = ""; // se limpia variable para mostrar inventario
                        mensajeComedia += "Peliculas de comedia ingresadas\n"; // concatenacion de mensajes mostrando inventario
                        mensajeComedia += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaComedia.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeComedia += "Nombre de la Pelicula: " + nombrePeliculaComedia[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasComedia[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaComedia[i] + " colones\n"
                                    + "Codigo de la pelicula: " + codigoComedia[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeComedia, "Categoria Comedia, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion                        
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No hay existencias ingresadas en esta categoria", "Categoria Comedia, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break;//sale del switch
                case 'R': // caegoria Romantica
                    if (nombrePeliculaRomantica != null) {// if para revisar si arreglo esta vacio
                        mensajeRomantica = ""; // se limpia variable para mostrar inventario
                        mensajeRomantica += "Peliculas romanticas ingresadas\n"; // concatenacion de mensajes mostrando inventario
                        mensajeRomantica += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaRomantica.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeRomantica += "Nombre de la Pelicula: " + nombrePeliculaRomantica[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasRomantica[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaRomantica[i] + " colones\n"
                                    + "Codigo de la pelicula: " + codigoRomantica[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeRomantica, "Categoria Romantica, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion                        
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No hay existencias ingresadas en esta categoria", "Categoria Romantica, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break;//sale del switch
                case 'E': // caegoria Educativa
                    if (nombrePeliculaEducativa != null) {// if para revisar si arreglo esta vacio
                        mensajeEducativa = ""; // se limpia variable para mostrar inventario
                        mensajeEducativa += "Peliculas educativas ingresadas\n"; // concatenacion de mensajes mostrando inventario
                        mensajeEducativa += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaEducativa.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeEducativa += "Nombre de la Pelicula: " + nombrePeliculaEducativa[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasEducativa[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaEducativa[i] + " colones\n"
                                    + "Codigo de la pelicula: " + codigoEducativa[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeEducativa, "Categoria Educativa, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion                        
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No hay existencias ingresadas en esta categoria", "Categoria Educativa, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break;//sale del switch 
                case 'M': // salir a menu
                    menuAdmin(); // salir a menu metodo
                    break;//sale del switch
                default: // si no se ingresa una opcion correcta
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta", "El Peliculon", 1);// muestra mensaje con totales
                    break;//sale del switch  
            }
            contDos = JOptionPane.showInputDialog(null, "Desea seguir revisando las peliculas ingresadas y en existencia? 'S' o 'N'").toUpperCase().charAt(0); // se pregunta si quiere seguir ingresando peliculas
        } while (contDos == 'S');
        opcion = JOptionPane.showInputDialog("Que desea realizar: " // si no, pregunta que hacer
                + "\n 'R' Retornar al menu principal" // R para retornar a menu principal
                + "\n 'S' Salir del programa").toUpperCase().charAt(0); // S para salir del programa

        if (opcion == 'R') { // if para escoger que hacer 
            menuAdmin(); // redirige a metodo con menu de administrador
        } else { //sino
            salirPrograma(); // redirige a metodo para salir del programa
        }//fin else
    }//fin metodo
    // metodo para alquilar peliculas

    public static void alquilerPeliculas() {
        char categoria; // variable para guardar valor de categoria a escoger
        char cont; // variable para controlar do while cuando se consulta si se quiere seguir ingresando peliculas
        char contDos; // variable para controlar do while cuando se consulta si quiere ver alquileres
        char opcion; // variable para guardar opcion de si salir al menu o del programa
        int bandera = 0; // variable bandera para uso en ifs
        String nombreEncontrado = ""; // variable para guardar el nombre de la pelicula encontrada
        String nombreBuscado; // variable para guardar el nombre de la pelicula que se busca
        int cantAlquilar = 0; // variable para guardar la cantidad de peliculas a alquilar
        double totalTemp; // variable para guardar temporalmente el valor total de la compra por categoria

        // arreglos categoria terror
        contadorTerror = new int[cantPeliculas]; // se instancia arreglo para almacenar la cantidad de copias a alquilar por pelicula
        alquiladoTerror = new String[cantPeliculas]; // se instancia arreglo para almacenar el nombre de las peliculas
        totalTerror = new double[cantPeliculas]; // se instancia arreglo para almacenar el total a pagar por el alquiler de cada pelicula

        // arreglos categoria Suspenso
        contadorSuspenso = new int[cantPeliculas]; // se instancia arreglo para almacenar la cantidad de copias a alquilar por pelicula
        alquiladoSuspenso = new String[cantPeliculas]; // se instancia arreglo para almacenar el nombre de las peliculas
        totalSuspenso = new double[cantPeliculas]; // se instancia arreglo para almacenar el total a pagar por el alquiler de cada pelicula

        // arreglos categoria Comedia
        contadorComedia = new int[cantPeliculas]; // se instancia arreglo para almacenar la cantidad de copias a alquilar por pelicula
        alquiladoComedia = new String[cantPeliculas]; // se instancia arreglo para almacenar el nombre de las peliculas
        totalComedia = new double[cantPeliculas]; // se instancia arreglo para almacenar el total a pagar por el alquiler de cada pelicula

        // arreglos categoria Romantica
        contadorRomantica = new int[cantPeliculas]; // se instancia arreglo para almacenar la cantidad de copias a alquilar por pelicula
        alquiladoRomantica = new String[cantPeliculas]; // se instancia arreglo para almacenar el nombre de las peliculas
        totalRomantica = new double[cantPeliculas]; // se instancia arreglo para almacenar el total a pagar por el alquiler de cada pelicula

        // arreglos categoria Educativa
        contadorEducativa = new int[cantPeliculas]; // se instancia arreglo para almacenar la cantidad de copias a alquilar por pelicula
        alquiladoEducativa = new String[cantPeliculas]; // se instancia arreglo para almacenar el nombre de las peliculas
        totalEducativa = new double[cantPeliculas]; // se instancia arreglo para almacenar el total a pagar por el alquiler de cada pelicula

        do {
            categoria = JOptionPane.showInputDialog("Seleccione la categoria deseada: " // se consulta la opcion que se desea ingresar y se guarda en variable categoria
                    + "\n ( T ) - Terror" // T para terror 
                    + "\n ( S ) - Suspenso" // S para suspenso
                    + "\n ( C ) - Comedia" // C para comedia 
                    + "\n ( R ) - Romanticas" // R para romanticas
                    + "\n ( E ) - Educativas").toUpperCase().charAt(0); // E para educativas

            switch (categoria) { // se usa para variable con opcion en switch
                case 'T': // opcion Terror
                    if (nombrePeliculaTerror != null) {// if para revisar si arreglo esta vacio
                        mensajeTerror = ""; // se limpia variable para mostrar inventario
                        JOptionPane.showMessageDialog(null, "Selecciono la categoria de peliculas de terror", "Categoria Terror, El Peliculon", 1); // mensaje indicando categoria seleccionada
                        mensajeTerror += "Las peliculas de terror disponibles son\n"; // concatenacion de mensajes mostrando inventario
                        mensajeTerror += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaTerror.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            if (nombrePeliculaTerror[i] == null) { // si indice esta nulo 
                                break; // salga 
                            } // fin for
                            mensajeTerror += "Nombre de la Pelicula: " + nombrePeliculaTerror[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasTerror[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaTerror[i] + " colones\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeTerror); // concatenacion de mensajes mostrando inventario
                        do { // do while controlado por variable que se recorre hasta ingresar un nombre que se encuentre en el inventario de peliculas de la categoria 
                            nombreBuscado = JOptionPane.showInputDialog("Digite la pelicula de terror que desea alquilar "); //se guarda el nombre en la variable indicada
                            // for con do while para recorrer el array y buscar un match entre la pelicula ingresada y los indices del array/inventario
                            for (int i = 0; i < nombrePeliculaTerror.length; i++) {
                                if (nombrePeliculaTerror[i].equals(nombreBuscado)) { // ingrese si se encuentra un match
                                    bandera = 1; // cambie el valor de la variable a 1 para usarala eventualmente en otro if
                                    nombreEncontrado = nombrePeliculaTerror[i]; // asigna el valor en el indice en otra variable para usos posteriores
                                    repetidoTerror = 0; //  se cambia el valor de la variable que controla el do while para salir de el 
                                    break; // se sale del for
                                } else { // sino
                                    bandera = 0; // se asigna el valor de cero a la variable para usos posteriores
                                }// fin else
                            } // fin for para buscar match 
                            if (bandera == 0) { // if para mostrar mensaje si no se encontro pelicula en inventario despues de recorrer for
                                JOptionPane.showMessageDialog(null, "No se encontro dicha pelicula en inventario, intente de nuevo ", "Categoria Terror, El Peliculon", 1); // mensaje cuando no se encuentra nombre en inventario
                                repetidoTerror = 1; // se cambia el valor de variable que controla do while para continuar en el 
                            }// fin if
                        } while (repetidoTerror == 1);// fin do while
                        // if de bandera 1 y do while para confirmar cantidades contra inventario
                        if (bandera == 1) { // si el valor de la bandera es 1
                            do { // se arreglo do while 
                                cantAlquilar = Integer.parseInt(JOptionPane.showInputDialog(" Digite la cantidad de copias de [" + nombreEncontrado + "] que desea alquilar: ")); // se asigna cantidad de copias a alquilar de pelicula                            
                                // for para restar inventario de la pelicula seleccionada
                                for (int i = 0; i < copiasTerror.length; i++) {
                                    if (nombrePeliculaTerror[i].equals(nombreEncontrado)) { // revisa si en algun indice esta la pelicula deseada
                                        if (copiasTerror[i] >= cantAlquilar) { // revisa si la cantidad deseada es menor que el inventario
                                            JOptionPane.showMessageDialog(null, "Cantidad disponible en inventario", "Categoria Terror, El Peliculon", 1); // muestra un mensaje si la cantidad esta disponible
                                            copiasTerror[i] = copiasTerror[i] - cantAlquilar; // resta la cantidad al inventario
                                            repetidoTerror = 0; // asigna cero al a variable que controla el do while para salir de el
                                            cantTotalTerror += cantAlquilar; // se agrega valor a una variable que va a llevar el total de peliculas alquiladas en la categoria
                                            break;// sale del for
                                        } else { // si no
                                            JOptionPane.showMessageDialog(null, "La cantidad deseada es mayor que la disponible, intente de nuevo ", "Categoria Terror, El Peliculon", 1); // mensaje cuando no hay dicha cantidad en inventario
                                            repetidoTerror = 1; // asigna uno a la variable para no salir del do while
                                        }// fin else
                                    }// fin if
                                }// fin for
                            } while (repetidoTerror == 1);// fin do while
                        } // fin if

                        // for para agregar peliculas a alquilar y cantidades en dos nuevos array rellenando indices que esten vacios
                        //y agregando cantidad a los indices llenos si hay match de nombre
                        if (pVezTerror == 0) { // if para ingresar valores en el arreglo la primera vez que se alquila
                            for (int i = 0; i < alquiladoTerror.length; i++) {
                                alquiladoTerror[i] = nombreEncontrado; // asigna el nombre de la pelicula en el arreglo indicado
                                contadorTerror[i] = cantAlquilar; // asigna la cantidad de copias de pelicula en el arreglo 
                                break; // sale del for 
                            } // fin for
                        } // fin if

                        if (pVezTerror == 1) { // if para despues de la primera vez que se alquilo
                            for (int i = 0; i < alquiladoTerror.length; i++) { // recorre arreglo
                                if (alquiladoTerror[i] == null) { // revisa si el indice esta vacio, de ser asi lo llena
                                    alquiladoTerror[i] = nombreEncontrado; // le asigna el nombre
                                    contadorTerror[i] = cantAlquilar; // le asigna la cantidad de copias
                                    break; // sale del for
                                } else if (alquiladoTerror[i].equals(nombreEncontrado)) { // si el indice no esta nulo revisa si el nombre es el mismo al del indice
                                    contadorTerror[i] = contadorTerror[i] + cantAlquilar; // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar
                                    break; // sale del for 
                                }// fin else
                            }//fin for para rellenar arreglos donde se llevan las peliculas alquiladas y sus cantidades
                        }//fin if
                        pVezTerror = 1; // se le asigna uno a la variable que maneja los if de arriba para que a la siguiente vuelta pase directo al segundo if
                        for (int i = 0; i < nombrePeliculaTerror.length; i++) {// for para sacar el indice donde esta el nombre en el arreglo de monto de alquiler 
                            //para multiplicarlo a la cantidad ingresada
                            if (nombrePeliculaTerror[i].equals(nombreEncontrado)) { // se busca un match entre indices y pelicula a alquilar
                                indicePrecioTerror = i; // cuando se tiene el match se pasa el valor en el indice a una variable
                                break; // se sale del for
                            } // fin if
                        } //fin for
                        // for para calcular precio por alquiler de acuerdo al indice obtenido
                        totalTemp = 0; // se limpia la variable temporal
                        for (int i = 0; i < nombrePeliculaTerror.length; i++) {
                            if (alquiladoTerror[i] == null) { // se revisa si el indice esta vacio
                                break; // si esta vacio se sale del for
                            } // cierre if
                            if (alquiladoTerror[i].equals(nombreEncontrado)) { // se busca match entre nombre ingresado y lo existente en el inventario
                                totalTemp = totalTerror[i]; // se asigna valor de indice en variable temporal
                                totalTerror[i] = 0; // se limpia valor de indice
                                totalTerror[i] += cantAlquilar * precioPeliculaTerror[indicePrecioTerror]; // se multiplica el valor en el indice por la cantidad deseada y se guarda en arreglo
                                break; // se sale del for
                            } // cierre if
                        } // cierre for

                        for (int i = 0; i < nombrePeliculaTerror.length; i++) { // for para recorrer arreglo de nombre de peliculas para almacenar el monto total de todos los alquieres de la categoria
                            if (alquiladoTerror[i] == null) { // se verifica si el indice esta vacio
                                break; // se sale del for
                            } //cierre if
                            if (alquiladoTerror[i].equals(nombreEncontrado)) { // se busca match por indice entre inventario y pelicula ingresada
                                totalPagarTerror += totalTerror[i]; // se acumula el valor de todos los indices en una variable
                                totalTerror[i] += totalTemp; // se asigna de vuelta el valor de la variable en el indice
                                break; // se sale del for                            
                            } // cierre if
                        } // cierre for
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No puede hacer alquileres en esta categoria, no hay existencias ingresadas", "Categoria Terror, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break; // se sale del switch
                //-----------------------------------------------------------------------------------------------------------------------------------------
                case 'S': // categoria Suspenso
                    if (nombrePeliculaSuspenso != null) {// if para revisar si arreglo esta vacio
                        mensajeSuspenso = ""; // se limpia variable para mostrar inventario
                        JOptionPane.showMessageDialog(null, "Selecciono la categoria de peliculas de Suspenso", "Categoria Suspenso, El Peliculon", 1); // mensaje indicando categoria seleccionada
                        mensajeSuspenso += "Las peliculas de Suspenso disponibles son\n"; // concatenacion de mensajes mostrando inventario
                        mensajeSuspenso += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaSuspenso.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeSuspenso += "Nombre de la Pelicula: " + nombrePeliculaSuspenso[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasSuspenso[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaSuspenso[i] + " colones\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }//fin for
                        JOptionPane.showMessageDialog(null, mensajeSuspenso); // concatenacion de mensajes mostrando inventario

                        do { // do while controlado por variable que se recorre hasta ingresar un nombre que se encuentre en el inventario de peliculas de la categoria 
                            nombreBuscado = JOptionPane.showInputDialog("Digite la pelicula de Suspenso que desea alquilar "); //se guarda el nombre en la variable indicada
                            // for con do while para recorrer el array y buscar un match entre la pelicula ingresada y los indices del array/inventario
                            for (int i = 0; i < nombrePeliculaSuspenso.length; i++) { // se recorre for
                                if (nombrePeliculaSuspenso[i].equals(nombreBuscado)) { // ingrese si se encuentra un match
                                    bandera = 1; // cambie el valor de la variable a 1 para usarala eventualmente en otro if
                                    nombreEncontrado = nombrePeliculaSuspenso[i]; // asigna el valor en el indice en otra variable para usos posteriores
                                    repetidoSuspenso = 0; //  se cambia el valor de la variable que controla el do while para salir de el 
                                    break; // se sale del for
                                } else { // si no
                                    bandera = 0; // se asigna el valor de cero a la variable para usos posteriores
                                }// fin else
                            } // fin for para buscar match 
                            if (bandera == 0) { // if para mostrar mensaje si no se encontro pelicula en inventario despues de recorrer for
                                JOptionPane.showMessageDialog(null, "No se encontro dicha pelicula en inventario, intente de nuevo ", "Categoria Suspenso, El Peliculon", 1); // mensaje cuando no se encuentra nombre en inventario
                                repetidoSuspenso = 1; // se cambia el valor de variable que controla do while para continuar en el 
                            }// fin if
                        } while (repetidoSuspenso == 1);// fin do while
                        // if de bandera 1 y do while para confirmar cantidades contra inventario
                        if (bandera == 1) { // se abre if
                            do { // se abre do while, no se sale hasta que se confirme que hay inventario
                                cantAlquilar = Integer.parseInt(JOptionPane.showInputDialog(" Digite la cantidad de copias de [" + nombreEncontrado + "] que desea alquilar: ")); // se asigna cantidad de copias a alquilar de pelicula                            
                                // for para restar inventario de la pelicula seleccionada
                                for (int i = 0; i < copiasSuspenso.length; i++) {
                                    if (nombrePeliculaSuspenso[i].equals(nombreEncontrado)) { // revisa si en algun indice esta la pelicula deseada
                                        if (copiasSuspenso[i] >= cantAlquilar) { // revisa si la cantidad deseada es menor que el inventario
                                            JOptionPane.showMessageDialog(null, "Cantidad disponible en inventario", "Categoria Suspenso, El Peliculon", 1); // muestra un mensaje si la cantidad esta disponible
                                            copiasSuspenso[i] = copiasSuspenso[i] - cantAlquilar; // resta la cantidad al inventario
                                            repetidoSuspenso = 0; // asigna cero al a variable que controla el do while para salir de el
                                            cantTotalSuspenso += cantAlquilar; // se agrega valor a una variable que va a llevar el total de peliculas alquiladas en la categoria
                                            break;// sale del for
                                        } else {//si no
                                            JOptionPane.showMessageDialog(null, "La cantidad deseada es mayor que la disponible, intente de nuevo ", "Categoria Suspenso, El Peliculon", 1); // mensaje cuando no hay dicha cantidad en inventario
                                            repetidoSuspenso = 1; // asigna uno a la variable para no salir del do while
                                        }//fin else
                                    }//fin if
                                }//fin for
                            } while (repetidoSuspenso == 1);// fin do while
                        }// fin if de bandera == 1
                        // for para agregar peliculas a alquilar y cantidades en dos nuevos array rellenando indices que esten vacios
                        //y agregando cantidad a los indices llenos si hay match de nombre
                        if (pVezSuspenso == 0) { // if para ingresar valores en el arreglo la primera vez que se alquila
                            for (int i = 0; i < alquiladoSuspenso.length; i++) { // se recorre for
                                alquiladoSuspenso[i] = nombreEncontrado; // asigna el nombre de la pelicula en el arreglo indicado
                                contadorSuspenso[i] = cantAlquilar; // asigna la cantidad de copias de pelicula en el arreglo 
                                break; // sale del for 
                            }// fin for
                        }//fin if
                        if (pVezSuspenso == 1) { // if para despues de la primera vez que se alquilo
                            for (int i = 0; i < alquiladoSuspenso.length; i++) { // recorre arreglo
                                if (alquiladoSuspenso[i] == null) { // revisa si el indice esta vacio, de ser asi lo llena
                                    alquiladoSuspenso[i] = nombreEncontrado; // le asigna el nombre
                                    contadorSuspenso[i] = cantAlquilar; // le asigna la cantidad de copias
                                    break; // sale del for
                                } else if (alquiladoSuspenso[i].equals(nombreEncontrado)) { // si el indice no esta nulo revisa si el nombre es el mismo al del indice
                                    contadorSuspenso[i] = contadorSuspenso[i] + cantAlquilar; // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar
                                    break; // sale del for 
                                }// fin else if
                            }//fin for para rellenar arreglos donde se llevan las peliculas alquiladas y sus cantidades
                        }// fin if
                        pVezSuspenso = 1; // se le asigna uno a la variable que maneja los if de arriba para que a la siguiente vuelta pase directo al segundo if
                        for (int i = 0; i < nombrePeliculaSuspenso.length; i++) {// for para sacar el indice donde esta el nombre en el arreglo de monto de alquiler 
                            //para multiplicarlo a la cantidad ingresada
                            if (nombrePeliculaSuspenso[i].equals(nombreEncontrado)) { // se busca un match entre indices y pelicula a alquilar
                                indicePrecioSuspenso = i; // cuando se tiene el match se pasa el valor en el indice a una variable
                                break; // se sale del for
                            }// fin if
                        }// fin for
                        // for para calcular precio por alquiler de acuerdo al indice obtenido
                        totalTemp = 0; // se limpia variable para guardar monto temporal 
                        for (int i = 0; i < nombrePeliculaSuspenso.length; i++) { // se corre for
                            if (alquiladoSuspenso[i] == null) { // se revisa si el indice esta vacio
                                break; // si esta vacio se sale del for
                            } // cierre if
                            if (alquiladoSuspenso[i].equals(nombreEncontrado)) { // se busca match entre nombre ingresado y lo existente en el inventario
                                totalTemp = totalSuspenso[i]; // asigno el valor de la posicion en la variable temporal
                                totalSuspenso[i] = 0; // limpio el valor en la posicion
                                totalSuspenso[i] += cantAlquilar * precioPeliculaSuspenso[indicePrecioSuspenso]; // se multiplica el valor en el indice por la cantidad deseada y se guarda en arreglo
                                break;// sale de for
                            } // cierre if
                        } // cierre for
                        for (int i = 0; i < alquiladoSuspenso.length; i++) { // for para recorrer arreglo de nombre de peliculas para almacenar el monto total de todos los alquieres de la categoria
                            if (alquiladoSuspenso[i] == null) { // se verifica si el indice esta vacio
                                break; // se sale del for
                            } //cierre if
                            if (alquiladoSuspenso[i].equals(nombreEncontrado)) { // se busca match por indice entre inventario y pelicula ingresada
                                totalPagarSuspenso += totalSuspenso[i]; // se acumula el valor de todos los indices en una variable
                                totalSuspenso[i] += totalTemp; // agrego el valor de la variable temporal en la posicion
                                break; // se sale del for                            
                            } // cierre if
                        } // cierre for
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No puede hacer alquileres en esta categoria, no hay existencias ingresadas", "Categoria Suspenso, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break; // sale del switch
                //--------------------------------------------------------------------------------------------------------------
                case 'C': // opcion comedia
                    if (nombrePeliculaComedia != null) {// if para revisar si arreglo esta vacio
                        mensajeComedia = ""; // se limpia variable para mostrar inventario
                        JOptionPane.showMessageDialog(null, "Selecciono la categoria de peliculas de Comedia", "Categoria Comedia, El Peliculon", 1); // mensaje indicando categoria seleccionada
                        mensajeComedia += "Las peliculas de Comedia disponibles son\n"; // concatenacion de mensajes mostrando inventario
                        mensajeComedia += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaComedia.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeComedia += "Nombre de la Pelicula: " + nombrePeliculaComedia[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasComedia[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaComedia[i] + " colones\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeComedia); // concatenacion de mensajes mostrando inventario
                        do { // do while controlado por variable que se recorre hasta ingresar un nombre que se encuentre en el inventario de peliculas de la categoria 
                            nombreBuscado = JOptionPane.showInputDialog("Digite la pelicula de Comedia que desea alquilar "); //se guarda el nombre en la variable indicada
                            // for con do while para recorrer el array y buscar un match entre la pelicula ingresada y los indices del array/inventario
                            for (int i = 0; i < nombrePeliculaComedia.length; i++) {//recorro arreglo con for
                                if (nombrePeliculaComedia[i].equals(nombreBuscado)) { // ingrese si se encuentra un match
                                    bandera = 1; // cambie el valor de la variable a 1 para usarala eventualmente en otro if
                                    nombreEncontrado = nombrePeliculaComedia[i]; // asigna el valor en el indice en otra variable para usos posteriores
                                    repetidoComedia = 0; //  se cambia el valor de la variable que controla el do while para salir de el 
                                    break; // se sale del for
                                } else {//si no
                                    bandera = 0; // se asigna el valor de cero a la variable para usos posteriores
                                }// fin else
                            } // fin for para buscar match 
                            if (bandera == 0) { // if para mostrar mensaje si no se encontro pelicula en inventario despues de recorrer for
                                JOptionPane.showMessageDialog(null, "No se encontro dicha pelicula en inventario, intente de nuevo ", "Categoria Comedia, El Peliculon", 1); // mensaje cuando no se encuentra nombre en inventario
                                repetidoComedia = 1; // se cambia el valor de variable que controla do while para continuar en el 
                            }// fin if
                        } while (repetidoComedia == 1);// fin do while
                        // if de bandera 1 y do while para confirmar cantidades contra inventario
                        if (bandera == 1) {// se abre if para bandera == 1
                            do { // se abre do while y se sale hasta que se ingrese un valor disponible en inventario
                                cantAlquilar = Integer.parseInt(JOptionPane.showInputDialog(" Digite la cantidad de copias de [" + nombreEncontrado + "] que desea alquilar: ")); // se asigna cantidad de copias a alquilar de pelicula                            
                                // for para restar inventario de la pelicula seleccionada
                                for (int i = 0; i < copiasComedia.length; i++) {// se recorre for
                                    if (nombrePeliculaComedia[i].equals(nombreEncontrado)) { // revisa si en algun indice esta la pelicula deseada
                                        if (copiasComedia[i] >= cantAlquilar) { // revisa si la cantidad deseada es menor que el inventario
                                            JOptionPane.showMessageDialog(null, "Cantidad disponible en inventario", "Categoria Comedia, El Peliculon", 1); // muestra un mensaje si la cantidad esta disponible
                                            copiasComedia[i] = copiasComedia[i] - cantAlquilar; // resta la cantidad al inventario
                                            repetidoComedia = 0; // asigna cero al a variable que controla el do while para salir de el
                                            cantTotalComedia += cantAlquilar; // se agrega valor a una variable que va a llevar el total de peliculas alquiladas en la categoria
                                            break;// sale del for
                                        } else {// si no
                                            JOptionPane.showMessageDialog(null, "La cantidad deseada es mayor que la disponible, intente de nuevo ", "Categoria Comedia, El Peliculon", 1); // mensaje cuando no hay dicha cantidad en inventario
                                            repetidoComedia = 1; // asigna uno a la variable para no salir del do while
                                        }// fin else
                                    }// fin if
                                }// fin for
                            } while (repetidoComedia == 1);// fin do while
                        }// fin if de bandera
                        // for para agregar peliculas a alquilar y cantidades en dos nuevos array rellenando indices que esten vacios
                        //y agregando cantidad a los indices llenos si hay match de nombre
                        if (pVezComedia == 0) { // if para ingresar valores en el arreglo la primera vez que se alquila
                            for (int i = 0; i < alquiladoComedia.length; i++) {// se recorre arreglo con for
                                alquiladoComedia[i] = nombreEncontrado; // asigna el nombre de la pelicula en el arreglo indicado
                                contadorComedia[i] = cantAlquilar; // asigna la cantidad de copias de pelicula en el arreglo 
                                break; // sale del for 
                            }// fin for
                        }// fin if
                        if (pVezComedia == 1) { // if para despues de la primera vez que se alquilo
                            for (int i = 0; i < alquiladoComedia.length; i++) { // recorre arreglo
                                if (alquiladoComedia[i] == null) { // revisa si el indice esta vacio, de ser asi lo llena
                                    alquiladoComedia[i] = nombreEncontrado; // le asigna el nombre
                                    contadorComedia[i] = cantAlquilar; // le asigna la cantidad de copias
                                    break; // sale del for
                                } else if (alquiladoComedia[i].equals(nombreEncontrado)) { // si el indice no esta nulo revisa si el nombre es el mismo al del indice
                                    contadorComedia[i] = contadorComedia[i] + cantAlquilar; // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar
                                    break; // sale del for 
                                }// fin else if
                            }//fin for para rellenar arreglos donde se llevan las peliculas alquiladas y sus cantidades
                        }// fin if pvez
                        pVezComedia = 1; // se le asigna uno a la variable que maneja los if de arriba para que a la siguiente vuelta pase directo al segundo if
                        for (int i = 0; i < nombrePeliculaComedia.length; i++) {// for para sacar el indice donde esta el nombre en el arreglo de monto de alquiler 
                            //para multiplicarlo a la cantidad ingresada
                            if (nombrePeliculaComedia[i].equals(nombreEncontrado)) { // se busca un match entre indices y pelicula a alquilar
                                indicePrecioComedia = i; // cuando se tiene el match se pasa el valor en el indice a una variable
                                break; // se sale del for
                            }// fin if
                        }// fin for
                        // for para calcular precio por alquiler de acuerdo al indice obtenido
                        totalTemp = 0; // se limpia variable para almacenar temporalmente total de la compra 
                        for (int i = 0; i < nombrePeliculaComedia.length; i++) {// se recorre arreglo con for
                            if (alquiladoComedia[i] == null) { // se revisa si el indice esta vacio
                                break; // si esta vacio se sale del for
                            } // cierre if
                            if (alquiladoComedia[i].equals(nombreEncontrado)) { // se busca match entre nombre ingresado y lo existente en el inventario
                                totalTemp = totalComedia[i]; // se asigna el valor del indice en variable temporal
                                totalComedia[i] = 0; // se limpia el valor del indice
                                totalComedia[i] += cantAlquilar * precioPeliculaComedia[indicePrecioComedia]; // se multiplica el valor en el indice por la cantidad deseada y se guarda en arreglo
                                break; // se sale del for
                            } // cierre if
                        } // cierre for
                        for (int i = 0; i < alquiladoComedia.length; i++) { // for para recorrer arreglo de nombre de peliculas para almacenar el monto total de todos los alquieres de la categoria
                            if (alquiladoComedia[i] == null) { // se verifica si el indice esta vacio
                                break; // se sale del for
                            } //cierre if
                            if (alquiladoComedia[i].equals(nombreEncontrado)) { // se busca match por indice entre inventario y pelicula ingresada
                                totalPagarComedia += totalComedia[i]; // se acumula el valor de todos los indices en una variable
                                totalComedia[i] += totalTemp; // se agrega de vuelta el valor de la variable en el indice
                                break; // se sale del for                            
                            } // cierre if
                        } // cierre for 
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No puede hacer alquileres en esta categoria, no hay existencias ingresadas", "Categoria Comedia, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break; // sale del switch
                //------------------------------------------------------------------------------------------------------
                case 'R': // categoria Romantica
                    if (nombrePeliculaRomantica != null) {// if para revisar si arreglo esta vacio
                        mensajeRomantica = ""; // se limpia variable para mostrar inventario
                        JOptionPane.showMessageDialog(null, "Selecciono la categoria de peliculas Romanticas", "Categoria de Romantica, El Peliculon", 1); // mensaje indicando categoria seleccionada
                        mensajeRomantica += "Las peliculas romanticas disponibles son\n"; // concatenacion de mensajes mostrando inventario
                        mensajeRomantica += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaRomantica.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeRomantica += "Nombre de la Pelicula: " + nombrePeliculaRomantica[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasRomantica[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaRomantica[i] + " colones\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeRomantica); // concatenacion de mensajes mostrando inventario

                        do { // do while controlado por variable que se recorre hasta ingresar un nombre que se encuentre en el inventario de peliculas de la categoria 
                            nombreBuscado = JOptionPane.showInputDialog("Digite la pelicula romantica que desea alquilar "); //se guarda el nombre en la variable indicada
                            // for con do while para recorrer el array y buscar un match entre la pelicula ingresada y los indices del array/inventario
                            for (int i = 0; i < nombrePeliculaRomantica.length; i++) {// se abre if
                                if (nombrePeliculaRomantica[i].equals(nombreBuscado)) { // ingrese si se encuentra un match
                                    bandera = 1; // cambie el valor de la variable a 1 para usarala eventualmente en otro if
                                    nombreEncontrado = nombrePeliculaRomantica[i]; // asigna el valor en el indice en otra variable para usos posteriores
                                    repetidoRomantica = 0; //  se cambia el valor de la variable que controla el do while para salir de el 
                                    break; // se sale del for
                                } else {// si no
                                    bandera = 0; // se asigna el valor de cero a la variable para usos posteriores
                                }// fin else
                            } // fin for para buscar match 
                            if (bandera == 0) { // if para mostrar mensaje si no se encontro pelicula en inventario despues de recorrer for
                                JOptionPane.showMessageDialog(null, "No se encontro dicha pelicula en inventario, intente de nuevo ", "Categoria de Romanticas, El Peliculon", 1); // mensaje cuando no se encuentra nombre en inventario
                                repetidoRomantica = 1; // se cambia el valor de variable que controla do while para continuar en el 
                            }// fin if
                        } while (repetidoRomantica == 1);// fin do while
                        // if de bandera 1 y do while para confirmar cantidades contra inventario
                        if (bandera == 1) {// se abre if y se ingresa si bandera es == 1
                            do { // se abre do while y se cierra hasta que se ingrese un nombre en inventario
                                cantAlquilar = Integer.parseInt(JOptionPane.showInputDialog(" Digite la cantidad de copias de [" + nombreEncontrado + "] que desea alquilar: ")); // se asigna cantidad de copias a alquilar de pelicula                            
                                // for para restar inventario de la pelicula seleccionada
                                for (int i = 0; i < copiasRomantica.length; i++) {// se recorre arreglo con for
                                    if (nombrePeliculaRomantica[i].equals(nombreEncontrado)) { // revisa si en algun indice esta la pelicula deseada
                                        if (copiasRomantica[i] >= cantAlquilar) { // revisa si la cantidad deseada es menor que el inventario
                                            JOptionPane.showMessageDialog(null, "Cantidad disponible en inventario", "Categoria de Romanticas, El Peliculon", 1); // muestra un mensaje si la cantidad esta disponible
                                            copiasRomantica[i] = copiasRomantica[i] - cantAlquilar; // resta la cantidad al inventario
                                            repetidoRomantica = 0; // asigna cero al a variable que controla el do while para salir de el
                                            cantTotalRomantica += cantAlquilar; // se agrega valor a una variable que va a llevar el total de peliculas alquiladas en la categoria
                                            break;// sale del for
                                        } else { // si no
                                            JOptionPane.showMessageDialog(null, "La cantidad deseada es mayor que la disponible, intente de nuevo ", "Categoria de Romanticas, El Peliculon", 1); // mensaje cuando no hay dicha cantidad en inventario
                                            repetidoRomantica = 1; // asigna uno a la variable para no salir del do while
                                        } // fin else
                                    }// fin de if
                                }// fin de for
                            } while (repetidoRomantica == 1);// fin do while
                        }// fin de if
                        // for para agregar peliculas a alquilar y cantidades en dos nuevos array rellenando indices que esten vacios
                        //y agregando cantidad a los indices llenos si hay match de nombre
                        if (pVezRomantica == 0) { // if para ingresar valores en el arreglo la primera vez que se alquila
                            for (int i = 0; i < alquiladoRomantica.length; i++) {
                                alquiladoRomantica[i] = nombreEncontrado; // asigna el nombre de la pelicula en el arreglo indicado
                                contadorRomantica[i] = cantAlquilar; // asigna la cantidad de copias de pelicula en el arreglo 
                                break; // sale del for 
                            }// fin de for
                        }// fin de if
                        if (pVezRomantica == 1) { // if para despues de la primera vez que se alquilo
                            for (int i = 0; i < alquiladoRomantica.length; i++) { // recorre arreglo
                                if (alquiladoRomantica[i] == null) { // revisa si el indice esta vacio, de ser asi lo llena
                                    alquiladoRomantica[i] = nombreEncontrado; // le asigna el nombre
                                    contadorRomantica[i] = cantAlquilar; // le asigna la cantidad de copias
                                    break; // sale del for
                                } else if (alquiladoRomantica[i].equals(nombreEncontrado)) { // si el indice no esta nulo revisa si el nombre es el mismo al del indice
                                    contadorRomantica[i] = contadorRomantica[i] + cantAlquilar; // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar
                                    break; // sale del for 
                                }// fin else if
                            }//fin for para rellenar arreglos donde se llevan las peliculas alquiladas y sus cantidades
                        }// fin if
                        pVezRomantica = 1; // se le asigna uno a la variable que maneja los if de arriba para que a la siguiente vuelta pase directo al segundo if
                        for (int i = 0; i < nombrePeliculaRomantica.length; i++) {// for para sacar el indice donde esta el nombre en el arreglo de monto de alquiler 
                            //para multiplicarlo a la cantidad ingresada
                            if (nombrePeliculaRomantica[i].equals(nombreEncontrado)) { // se busca un match entre indices y pelicula a alquilar
                                indicePrecioRomantica = i; // cuando se tiene el match se pasa el valor en el indice a una variable
                                break; // se sale del for
                            }// fin if
                        }// fin for
                        // for para calcular precio por alquiler de acuerdo al indice obtenido
                        totalTemp = 0; // se limpia variable donde se va a almacenar temporalmente el valor de la compra 
                        for (int i = 0; i < nombrePeliculaRomantica.length; i++) { // se recorre arreglo con for
                            if (alquiladoRomantica[i] == null) { // se revisa si el indice esta vacio
                                break; // si esta vacio se sale del for
                            } // cierre if
                            if (alquiladoRomantica[i].equals(nombreEncontrado)) { // se busca match entre nombre ingresado y lo existente en el inventario
                                totalTemp = totalRomantica[i]; // se asigna valor de indice en variable temporal
                                totalRomantica[i] = 0; // se limpia valor de indice
                                totalRomantica[i] += cantAlquilar * precioPeliculaRomantica[indicePrecioRomantica]; // se multiplica el valor en el indice por la cantidad deseada y se guarda en arreglo
                                break;// se sale del for
                            } // cierre if
                        } // cierre for
                        for (int i = 0; i < alquiladoRomantica.length; i++) { // for para recorrer arreglo de nombre de peliculas para almacenar el monto total de todos los alquieres de la categoria
                            if (alquiladoRomantica[i] == null) { // se verifica si el indice esta vacio
                                break; // se sale del for
                            } //cierre if
                            if (alquiladoRomantica[i].equals(nombreEncontrado)) { // se busca match por indice entre inventario y pelicula ingresada
                                totalPagarRomantica += totalRomantica[i]; // se acumula el valor de todos los indices en una variable
                                totalRomantica[i] += totalTemp; // se agrega de vuelta el valor de la variable en el indice
                                break; // se sale del for                            
                            } // cierre if
                        } // cierre for
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No puede hacer alquileres en esta categoria, no hay existencias ingresadas", "Categoria Romantica, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else
                    break;// se sale del switch 
                //------------------------------------------------------------------------------------------------
                case 'E': // categoria de educativas
                    if (nombrePeliculaEducativa != null) {// if para revisar si arreglo esta vacio
                        mensajeEducativa = ""; // se limpia variable para mostrar inventario
                        JOptionPane.showMessageDialog(null, "Selecciono la categoria de peliculas educativas", "Categoria de Educativas, El Peliculon", 1); // mensaje indicando categoria seleccionada
                        mensajeEducativa += "Las peliculas educativas disponibles son\n"; // concatenacion de mensajes mostrando inventario
                        mensajeEducativa += "--------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        for (int i = 0; i < nombrePeliculaEducativa.length; i++) { // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                            mensajeEducativa += "Nombre de la Pelicula: " + nombrePeliculaEducativa[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Cantidad de copias: " + copiasEducativa[i] + "\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "Costo de alquiler: " + precioPeliculaEducativa[i] + " colones\n" // concatenacion de mensajes mostrando inventario, se recorre arreglos para obtener inventario ingresado
                                    + "----------------------------------------------------------------------\n"; // concatenacion de mensajes mostrando inventario
                        }// fin for
                        JOptionPane.showMessageDialog(null, mensajeEducativa); // concatenacion de mensajes mostrando inventario
                        do { // do while controlado por variable que se recorre hasta ingresar un nombre que se encuentre en el inventario de peliculas de la categoria 
                            nombreBuscado = JOptionPane.showInputDialog("Digite la pelicula educativa que desea alquilar "); //se guarda el nombre en la variable indicada
                            // for con do while para recorrer el array y buscar un match entre la pelicula ingresada y los indices del array/inventario
                            for (int i = 0; i < nombrePeliculaEducativa.length; i++) {
                                if (nombrePeliculaEducativa[i].equals(nombreBuscado)) { // ingrese si se encuentra un match
                                    bandera = 1; // cambie el valor de la variable a 1 para usarala eventualmente en otro if
                                    nombreEncontrado = nombrePeliculaEducativa[i]; // asigna el valor en el indice en otra variable para usos posteriores
                                    repetidoEducativa = 0; //  se cambia el valor de la variable que controla el do while para salir de el 
                                    break; // se sale del for
                                } else { // si no
                                    bandera = 0; // se asigna el valor de cero a la variable para usos posteriores
                                }// fin else
                            } // fin for para buscar match 
                            if (bandera == 0) { // if para mostrar mensaje si no se encontro pelicula en inventario despues de recorrer for
                                JOptionPane.showMessageDialog(null, "No se encontro dicha pelicula en inventario, intente de nuevo ", "Categoria de Educativas, El Peliculon", 1); // mensaje cuando no se encuentra nombre en inventario
                                repetidoEducativa = 1; // se cambia el valor de variable que controla do while para continuar en el 
                            }// fin if
                        } while (repetidoEducativa == 1);// fin do while
                        // if de bandera 1 y do while para confirmar cantidades contra inventario
                        if (bandera == 1) { // se abre if de bandera == 1
                            do { // se abre do while y se sale hasta encontrar pelicula en inventario
                                cantAlquilar = Integer.parseInt(JOptionPane.showInputDialog(" Digite la cantidad de copias de [" + nombreEncontrado + "] que desea alquilar: ")); // se asigna cantidad de copias a alquilar de pelicula                            
                                // for para restar inventario de la pelicula seleccionada
                                for (int i = 0; i < copiasEducativa.length; i++) {
                                    if (nombrePeliculaEducativa[i].equals(nombreEncontrado)) { // revisa si en algun indice esta la pelicula deseada
                                        if (copiasEducativa[i] >= cantAlquilar) { // revisa si la cantidad deseada es menor que el inventario
                                            JOptionPane.showMessageDialog(null, "Cantidad disponible en inventario", "Categoria de Educativas, El Peliculon", 1); // muestra un mensaje si la cantidad esta disponible
                                            copiasEducativa[i] = copiasEducativa[i] - cantAlquilar; // resta la cantidad al inventario
                                            repetidoEducativa = 0; // asigna cero al a variable que controla el do while para salir de el
                                            cantTotalEducativa += cantAlquilar; // se agrega valor a una variable que va a llevar el total de peliculas alquiladas en la categoria
                                            break;// sale del for
                                        } else {// si no
                                            JOptionPane.showMessageDialog(null, "La cantidad deseada es mayor que la disponible, intente de nuevo ", "Categoria de Educativas, El Peliculon", 1); // mensaje cuando no hay dicha cantidad en inventario
                                            repetidoEducativa = 1; // asigna uno a la variable para no salir del do while
                                        }// fin else
                                    }// fin if
                                }// fin for
                            } while (repetidoEducativa == 1);// fin do while
                        }// fin if de bandera == 1
                        // for para agregar peliculas a alquilar y cantidades en dos nuevos array rellenando indices que esten vacios
                        //y agregando cantidad a los indices llenos si hay match de nombre
                        if (pVezEducativa == 0) { // if para ingresar valores en el arreglo la primera vez que se alquila
                            for (int i = 0; i < alquiladoEducativa.length; i++) {// se recorre arreglo con for
                                alquiladoEducativa[i] = nombreEncontrado; // asigna el nombre de la pelicula en el arreglo indicado
                                contadorEducativa[i] = cantAlquilar; // asigna la cantidad de copias de pelicula en el arreglo 
                                break; // sale del for 
                            }// fin for
                        }// fin if bandera ==0
                        if (pVezEducativa == 1) { // if para despues de la primera vez que se alquilo
                            for (int i = 0; i < alquiladoEducativa.length; i++) { // recorre arreglo
                                if (alquiladoEducativa[i] == null) { // revisa si el indice esta vacio, de ser asi lo llena
                                    alquiladoEducativa[i] = nombreEncontrado; // le asigna el nombre
                                    contadorEducativa[i] = cantAlquilar; // le asigna la cantidad de copias
                                    break; // sale del for
                                } else if (alquiladoEducativa[i].equals(nombreEncontrado)) { // si el indice no esta nulo revisa si el nombre es el mismo al del indice
                                    contadorEducativa[i] = contadorEducativa[i] + cantAlquilar; // de ser igual le agrega la cantidad a la cantidad de copias existentes a alquilar
                                    break; // sale del for 
                                }// fin else if
                            }//fin for para rellenar arreglos donde se llevan las peliculas alquiladas y sus cantidades
                        }// fin if pvez
                        pVezEducativa = 1; // se le asigna uno a la variable que maneja los if de arriba para que a la siguiente vuelta pase directo al segundo if
                        for (int i = 0; i < nombrePeliculaEducativa.length; i++) {// for para sacar el indice donde esta el nombre en el arreglo de monto de alquiler 
                            //para multiplicarlo a la cantidad ingresada
                            if (nombrePeliculaEducativa[i].equals(nombreEncontrado)) { // se busca un match entre indices y pelicula a alquilar
                                indicePrecioEducativa = i; // cuando se tiene el match se pasa el valor en el indice a una variable
                                break; // se sale del for
                            }// fin if
                        }// fin for
                        // for para calcular precio por alquiler de acuerdo al indice obtenido
                        totalTemp = 0; // variable donde se almacena temporalmente el valor del total de la compra 
                        for (int i = 0; i < nombrePeliculaEducativa.length; i++) {// se recorre arreglo con for
                            if (alquiladoEducativa[i] == null) { // se revisa si el indice esta vacio
                                break; // si esta vacio se sale del for
                            } // cierre if
                            if (alquiladoEducativa[i].equals(nombreEncontrado)) { // se busca match entre nombre ingresado y lo existente en el inventario
                                totalTemp = totalEducativa[i]; // se asigna valor de indice en variable temporal
                                totalEducativa[i] = 0; // se limpia valor de indice
                                totalEducativa[i] += cantAlquilar * precioPeliculaEducativa[indicePrecioEducativa]; // se multiplica el valor en el indice por la cantidad deseada y se guarda en arreglo
                                break; // se sale del for
                            } // cierre if
                        } // cierre for
                        for (int i = 0; i < alquiladoEducativa.length; i++) { // for para recorrer arreglo de nombre de peliculas para almacenar el monto total de todos los alquieres de la categoria
                            if (alquiladoEducativa[i] == null) { // se verifica si el indice esta vacio
                                break; // se sale del for
                            } //cierre if
                            if (alquiladoEducativa[i].equals(nombreEncontrado)) { // se busca match por indice entre inventario y pelicula ingresada
                                totalPagarEducativa += totalEducativa[i]; // se acumula el valor de todos los indices en una variable
                                totalEducativa[i] += totalTemp; // se asigna de vuelta el valor de la variable en indice
                                break; // se sale del for                            
                            } // cierre if
                        } // cierre for
                    } else { // inicio else
                        JOptionPane.showMessageDialog(null, "No puede hacer alquileres en esta categoria, no hay existencias ingresadas", "Categoria Educativa, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    }//fin else                   
                    break; // se sale de switch
                default: // se ingresa si ninguna opcion correcta fue ingresada
                    JOptionPane.showMessageDialog(null, "Valor ingresado es invalido");// muestra mensaje
                    break;// sale del switch
            }// fin del switch
            cont = JOptionPane.showInputDialog(null, "Desea alquilar otra pelicula 'S' o 'N'").toUpperCase().charAt(0);// consulta si quiere hacer otro alquiler y lo guarda en variable
        } while (cont == 'S'); // fin de do while

        do { // inicio do while para menu de consulta de alquileres
            categoria = JOptionPane.showInputDialog("Si desea, seleccione la categoria en la que desea consultar alquileres facturados : " // se consulta la opcion que se desea ingresar y se guarda en variable categoria
                    + "\n ( T ) - Alquileres en categoria Terror" // T para terror 
                    + "\n ( S ) - Alquileres en categoria Suspenso" // S para suspenso
                    + "\n ( C ) - Alquileres en categoria Comedia" // C para comedia 
                    + "\n ( R ) - Alquileres en categoria Romantica" // R para romanticas
                    + "\n ( E ) - Alquileres en categoria Educativa" // E para educativas
                    + "\n ( M ) - Salir al menu principal").toUpperCase().charAt(0); // M para salir al menu principal

            switch (categoria) { //se usa valor ingresado para elegir categoria
                case 'T': // categoria terror
                    if (totalPagarTerror == 0) { // if para revisar si el total de los alquieres de la categoria es cero
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Terror, El Peliculon", 1);// si es cero, muestra mensaje indicando que no se alquilo en esa categoria 
                    } else { // si no
                        mensajeTerror = ""; // se limpia la variable
                        mensajeTerror += "Peliculas de terror alquiladas\n"; // mensaje concatenado
                        mensajeTerror += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        for (int i = 0; i < alquiladoTerror.length; i++) { // recorre arreglo de peliculas alquiladas
                            if (alquiladoTerror[i] == null) { // si existe un indice vacio salir
                                break; // salir del for
                            }// fin if
                            mensajeTerror += "Pelicula: " + alquiladoTerror[i] + "\n" // concatena peliculas alquiladas en un mensaje
                                    + "Cantidad de copias alquiladas: " + contadorTerror[i] + " pelicula(s)\n" // concatena copias alquiladas en el mismo mensaje
                                    + "Total a pagar por el alquiler de esta pelicula: " + totalTerror[i] + " colones\n" // concatena monto a pagar por cada alquiler
                                    + "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        }
                        mensajeTerror += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        mensajeTerror += "Total a pagar por todos los alquileres de peliculas de Terror: " + totalPagarTerror + " colones\n"; // monto a pagar por todos los alquileres de la categoria
                        JOptionPane.showMessageDialog(null, mensajeTerror, "Categoria de Terror, El Peliculon", 1); // muestra el mensaje con todo el contenido anterior  
                    }// fin else
                    break;// sale del switch
                //-------------------------------------------------------------------------------
                case 'S': // categoria Suspenso
                    if (totalPagarSuspenso == 0) { // if para revisar si el total de los alquieres de la categoria es cero
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Suspenso, El Peliculon", 1);// si es cero, muestra mensaje indicando que no se alquilo en esa categoria 
                    } else { // si no
                        mensajeSuspenso = ""; // se limpia la variable
                        mensajeSuspenso += "Peliculas de Suspenso alquiladas\n"; // mensaje concatenado
                        mensajeSuspenso += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        for (int i = 0; i < alquiladoSuspenso.length; i++) { // recorre arreglo de peliculas alquiladas
                            if (alquiladoSuspenso[i] == null) { // si existe un indice vacio salir
                                break; // salir del for
                            }// fin if
                            mensajeSuspenso += "Pelicula: " + alquiladoSuspenso[i] + "\n" // concatena peliculas alquiladas en un mensaje
                                    + "Cantidad de copias alquiladas: " + contadorSuspenso[i] + " pelicula(s)\n" // concatena copias alquiladas en el mismo mensaje
                                    + "Total a pagar por el alquiler de esta pelicula: " + totalSuspenso[i] + " colones\n" // concatena monto a pagar por cada alquiler
                                    + "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        }
                        mensajeSuspenso += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        mensajeSuspenso += "Total a pagar por todos los alquileres de peliculas de Suspenso: " + totalPagarSuspenso + " colones\n"; // monto a pagar por todos los alquileres de la categoria
                        JOptionPane.showMessageDialog(null, mensajeSuspenso, "Categoria de Suspenso, El Peliculon", 1); // muestra el mensaje con todo el contenido anterior  
                    }// fin else
                    break;// sale del switch
                //------------------------------------------------------------------------------
                case 'C': // categoria Comedia
                    if (totalPagarComedia == 0) { // if para revisar si el total de los alquieres de la categoria es cero
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Comedia, El Peliculon", 1);// si es cero, muestra mensaje indicando que no se alquilo en esa categoria 
                    } else { // si no
                        mensajeComedia = ""; // se limpia la variable
                        mensajeComedia += "Peliculas de Comedia alquiladas\n"; // mensaje concatenado
                        mensajeComedia += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        for (int i = 0; i < alquiladoComedia.length; i++) { // recorre arreglo de peliculas alquiladas
                            if (alquiladoComedia[i] == null) { // si existe un indice vacio salir
                                break; // salir del for
                            }// fin if
                            mensajeComedia += "Pelicula: " + alquiladoComedia[i] + "\n" // concatena peliculas alquiladas en un mensaje
                                    + "Cantidad de copias alquiladas: " + contadorComedia[i] + " pelicula(s)\n" // concatena copias alquiladas en el mismo mensaje
                                    + "Total a pagar por el alquiler de esta pelicula: " + totalComedia[i] + " colones\n" // concatena monto a pagar por cada alquiler
                                    + "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        }
                        mensajeComedia += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        mensajeComedia += "Total a pagar por todos los alquileres de peliculas de Comedia: " + totalPagarComedia + " colones\n"; // monto a pagar por todos los alquileres de la categoria
                        JOptionPane.showMessageDialog(null, mensajeComedia, "Categoria de Comedia, El Peliculon", 1); // muestra el mensaje con todo el contenido anterior  
                    }// fin else
                    break;// sale del switch 
                //------------------------------------------------------------------------------
                case 'R': // categoria Romantica
                    if (totalPagarRomantica == 0) { // if para revisar si el total de los alquieres de la categoria es cero
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Romantica, El Peliculon", 1);// si es cero, muestra mensaje indicando que no se alquilo en esa categoria 
                    } else { // si no
                        mensajeRomantica = ""; // se limpia la variable
                        mensajeRomantica += "Peliculas romanticas alquiladas\n"; // mensaje concatenado
                        mensajeRomantica += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        for (int i = 0; i < alquiladoRomantica.length; i++) { // recorre arreglo de peliculas alquiladas
                            if (alquiladoRomantica[i] == null) { // si existe un indice vacio salir
                                break; // salir del for
                            }// fin if
                            mensajeRomantica += "Pelicula: " + alquiladoRomantica[i] + "\n" // concatena peliculas alquiladas en un mensaje
                                    + "Cantidad de copias alquiladas: " + contadorRomantica[i] + " pelicula(s)\n" // concatena copias alquiladas en el mismo mensaje
                                    + "Total a pagar por el alquiler de esta pelicula: " + totalRomantica[i] + " colones\n" // concatena monto a pagar por cada alquiler
                                    + "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        }
                        mensajeRomantica += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        mensajeRomantica += "Total a pagar por todos los alquileres de peliculas romanticas: " + totalPagarRomantica + " colones\n"; // monto a pagar por todos los alquileres de la categoria
                        JOptionPane.showMessageDialog(null, mensajeRomantica, "Categoria romanticas, El Peliculon", 1); // muestra el mensaje con todo el contenido anterior  
                    }// fin else
                    break;// sale del switch  
                //----------------------------------------------------------------------------
                case 'E': // categoria Educativa
                    if (totalPagarEducativa == 0) { // if para revisar si el total de los alquieres de la categoria es cero
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Educativa, El Peliculon", 1);// si es cero, muestra mensaje indicando que no se alquilo en esa categoria 
                    } else { // si no
                        mensajeEducativa = ""; // se limpia la variable
                        mensajeEducativa += "Peliculas educativas alquiladas\n"; // mensaje concatenado
                        mensajeEducativa += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        for (int i = 0; i < alquiladoEducativa.length; i++) { // recorre arreglo de peliculas alquiladas
                            if (alquiladoEducativa[i] == null) { // si existe un indice vacio salir
                                break; // salir del for
                            }// fin if
                            mensajeEducativa += "Pelicula: " + alquiladoEducativa[i] + "\n" // concatena peliculas alquiladas en un mensaje
                                    + "Cantidad de copias alquiladas: " + contadorEducativa[i] + " pelicula(s)\n" // concatena copias alquiladas en el mismo mensaje
                                    + "Total a pagar por el alquiler de esta pelicula: " + totalEducativa[i] + " colones\n" // concatena monto a pagar por cada alquiler
                                    + "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        }
                        mensajeEducativa += "------------------------------------------------------------------------------------\n"; // mensaje concatenado
                        mensajeEducativa += "Total a pagar por todos los alquileres de peliculas Educativas: " + totalPagarEducativa + " colones\n"; // monto a pagar por todos los alquileres de la categoria
                        JOptionPane.showMessageDialog(null, mensajeEducativa, "Categoria Educativa, El Peliculon", 1); // muestra el mensaje con todo el contenido anterior  
                    }// fin else
                    break;// sale del switch   
                //-----------------------------------------------------------------------------------
                case 'M': // salir a menu
                    menuAdmin(); // salir a menu metodo
                    break;//sale del switch
                default: // si no se ingresa una opcion correcta
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta", "El Peliculon", 1);// muestra mensaje con totales
                    break;//sale del switch      
            } // fin del switch
            contDos = JOptionPane.showInputDialog(null, "Desea seguir revisando los alquileres facturados? 'S' o 'N'").toUpperCase().charAt(0); // se pregunta si quiere seguir ingresando peliculas
        } while (contDos == 'S'); // fin de do while

        opcion = JOptionPane.showInputDialog("Que desea realizar: " // se consulta que desea hacer y lo guarda en variable
                + "\n 'R' Retornar al menu principal" // R para retornar al menu principal
                + "\n 'S' Salir del programa").toUpperCase().charAt(0); // S para salir del programa

        if (opcion == 'R') { // is opcion es R
            menuAdmin();// redirige a menu de admin
        } else { // si no
            salirPrograma();// sale del programa
        }// fin else

    }// fin metodo

    // metodo para ver contabilidad
    public static void moduloContable() {
        char cont; // variable para controlar do while cuando se consulta si se quiere seguir ingresando peliculas
        char categoria; // variable para guardar valor de categoria a escoger
        char opcion; // variable para almacenar opcion de que hacer al final del metodo
        double sumaTotal; // variable almacena suma total de montos de categorias
        int cantTotal; // variable almacena suma total de cantidades de peliculas alquiladas de todas las categorias
        String mensajeTotal; // variable para almacenar el informacion de categorias y total

        do {
            cantTotal = cantTotalTerror + cantTotalSuspenso + cantTotalComedia + cantTotalRomantica + cantTotalEducativa;// se suma todas las cantidas de todas las categorias
            sumaTotal = totalPagarTerror + totalPagarSuspenso + totalPagarComedia + totalPagarRomantica + totalPagarEducativa;// se suma todos los totales de las categorias
            categoria = JOptionPane.showInputDialog("Seleccione la opcion deseada: " // se consulta la opcion que se desea ingresar y se guarda en variable categoria
                    + "\n ( T ) - Ventas Terror" // T para terror 
                    + "\n ( S ) - Ventas Suspenso" // S para suspenso
                    + "\n ( C ) - Ventas Comedia" // C para comedia 
                    + "\n ( R ) - Ventas Romanticas" // R para romanticas
                    + "\n ( E ) - Ventas Educativas" // E educativa
                    + "\n ( G ) - Ganancias Totales").toUpperCase().charAt(0); // E para educativas

            switch (categoria) { //se usa valor ingresado para elegir categoria
                case 'T': // categoria Terror
                    if (cantTotalTerror == 0) {//si variable es 0
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Terror, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    } else { //si no
                        mensajeTotal = ""; // se limpia variable
                        mensajeTotal += "Cantidad de peliculas de terror alquiladas: " + cantTotalTerror + "\n"; // se concatena mensaje con cantidad de peliculas alquiladas en la categoria
                        mensajeTotal += "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        for (int i = 0; i < alquiladoTerror.length; i++) { // recorre arreglos con for
                            if (alquiladoTerror[i] == null) { // si indice esta nulo en el arreglo
                                break; // salir de for
                            }// fin de if
                            mensajeTotal += "Pelicula: " + alquiladoTerror[i] + "\n" // concatena nombre de peliculas alquiladas
                                    + "cantidad de copias alquiladas: " + contadorTerror[i] + " pelicula(s)\n" // concatena cantidad de copias alquiladas por pelicula
                                    + "Total a pagar por el alquiler de esta(s) pelicula(s): " + totalTerror[i] + " colones\n" // concatena total a pagar por alquiler de cada pelicula
                                    + "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        }// fin for
                        mensajeTotal += "Total a pagar por todos los alquileres de peliculas de terror: " + totalPagarTerror + " colones\n"; // concatena total a pagar por todos los alquileres de la categoria
                        JOptionPane.showMessageDialog(null, mensajeTotal, "Categoria Terror, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion
                    }//fin else
                    break;// se sale del switch
                //--------------------------------------------------------------------------
                case 'S': //categoria suspenso
                    if (cantTotalSuspenso == 0) {//si variable es 0
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Suspenso, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    } else {//si no
                        mensajeTotal = "";// se limpia variable
                        mensajeTotal += "Cantidad de peliculas de Suspenso alquiladas: " + cantTotalSuspenso + "\n"; // se concatena mensaje con cantidad de peliculas alquiladas en la categoria
                        mensajeTotal += "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        for (int i = 0; i < alquiladoSuspenso.length; i++) { // recorre arreglos con for
                            if (alquiladoSuspenso[i] == null) { // si indice esta nulo en el arreglo
                                break; // salir de for
                            }// fin de if
                            mensajeTotal += "Pelicula: " + alquiladoSuspenso[i] + "\n"// concatena nombre de peliculas alquiladas
                                    + "cantidad de copias alquiladas: " + contadorSuspenso[i] + " pelicula(s)\n"// concatena cantidad de copias alquiladas por pelicula
                                    + "Total a pagar por el alquiler de esta(s) pelicula(s): " + totalSuspenso[i] + " colones\n"// concatena total a pagar por alquiler de cada pelicula
                                    + "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        }// fin for
                        mensajeTotal += "Total a pagar por todos los alquileres de peliculas de Suspenso: " + totalPagarSuspenso + " colones\n"; // concatena total a pagar por todos los alquileres de la categoria
                        JOptionPane.showMessageDialog(null, mensajeTotal, "Categoria Suspenso, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion
                    }//fin else
                    break;//se sale del switch
                //----------------------------------------------------------------------------
                case 'C':// categoria C
                    if (cantTotalComedia == 0) {//si variable es 0
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Comedia, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    } else {//si no
                        mensajeTotal = "";// se limpia variable
                        mensajeTotal += "Cantidad de peliculas de Comedia alquiladas: " + cantTotalComedia + "\n"; // se concatena mensaje con cantidad de peliculas alquiladas en la categoria
                        mensajeTotal += "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        for (int i = 0; i < alquiladoComedia.length; i++) { // recorre arreglos con for
                            if (alquiladoComedia[i] == null) { // si indice esta nulo en el arreglo
                                break; // salir de for
                            }// fin de if
                            mensajeTotal += "Pelicula: " + alquiladoComedia[i] + "\n"// concatena nombre de peliculas alquiladas
                                    + "cantidad de copias alquiladas: " + contadorComedia[i] + " pelicula(s)\n"// concatena cantidad de copias alquiladas por pelicula
                                    + "Total a pagar por el alquiler de esta(s) pelicula(s): " + totalComedia[i] + " colones\n"// concatena total a pagar por alquiler de cada pelicula
                                    + "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        }// fin for
                        mensajeTotal += "Total a pagar por todos los alquileres de peliculas de Comedia: " + totalPagarComedia + " colones\n";// concatena total a pagar por todos los alquileres de la categoria
                        JOptionPane.showMessageDialog(null, mensajeTotal, "Categoria Comedia, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion
                    }//fin else
                    break;// se sale del switch
                //---------------------------------------------------------------------------
                case 'R':// categoria Romantica
                    if (cantTotalRomantica == 0) {//si variable es 0
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Romantica, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    } else {//si no
                        mensajeTotal = "";// se limpia variable
                        mensajeTotal += "Cantidad de peliculas Romanticas alquiladas: " + cantTotalRomantica + "\n"; // se concatena mensaje con cantidad de peliculas alquiladas en la categoria
                        mensajeTotal += "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        for (int i = 0; i < alquiladoRomantica.length; i++) { // recorre arreglos con for
                            if (alquiladoRomantica[i] == null) { // si indice esta nulo en el arreglo
                                break; // salir de for
                            }// fin de if
                            mensajeTotal += "Pelicula: " + alquiladoRomantica[i] + "\n"// concatena nombre de peliculas alquiladas
                                    + "cantidad de copias alquiladas: " + contadorRomantica[i] + " pelicula(s)\n"// concatena cantidad de copias alquiladas por pelicula
                                    + "Total a pagar por el alquiler de esta(s) pelicula(s): " + totalRomantica[i] + " colones\n"// concatena total a pagar por alquiler de cada pelicula
                                    + "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        }// fin for
                        mensajeTotal += "Total a pagar por todos los alquileres de peliculas Romanticas: " + totalPagarRomantica + " colones\n";// concatena total a pagar por todos los alquileres de la categoria 
                        JOptionPane.showMessageDialog(null, mensajeTotal, "Categoria Romantica, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion
                    }//fin else
                    break;// se sale del switch
                //---------------------------------------------------------------------------
                case 'E':// categoria Educativa
                    if (cantTotalEducativa == 0) { //si variable es 0
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres en esta categoria", "Categoria Educativa, El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo en esa categoria
                    } else {//si no
                        mensajeTotal = "";// se limpia variable
                        mensajeTotal += "Cantidad de peliculas Educativa alquiladas: " + cantTotalEducativa + "\n"; // se concatena mensaje con cantidad de peliculas alquiladas en la categoria
                        mensajeTotal += "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        for (int i = 0; i < alquiladoEducativa.length; i++) { // recorre arreglos con for
                            if (alquiladoEducativa[i] == null) { // si indice esta nulo en el arreglo
                                break; // salir de for
                            }// fin de if
                            mensajeTotal += "Pelicula: " + alquiladoEducativa[i] + "\n"// concatena nombre de peliculas alquiladas
                                    + "cantidad de copias alquiladas: " + contadorEducativa[i] + " pelicula(s)\n"// concatena cantidad de copias alquiladas por pelicula
                                    + "Total a pagar por el alquiler de esta(s) pelicula(s): " + totalEducativa[i] + " colones\n"// concatena total a pagar por alquiler de cada pelicula
                                    + "---------------------------------------------------------------------------------------------\n"; // concatena lineas punteadas
                        }// fin for
                        mensajeTotal += "Total a pagar por todos los alquileres de peliculas Educativas: " + totalPagarEducativa + " colones\n";// concatena total a pagar por todos los alquileres de la categoria 
                        JOptionPane.showMessageDialog(null, mensajeTotal, "Categoria Educativa, El Peliculon", 1);// si no esta vacio, muestra mensaje con la informacion
                    }
                    break;// sale del switch
                //-----------------------------------------------------------------------------
                case 'G':// categoria total
                    if (cantTotal == 0 && sumaTotal == 0) { // si no hay cantidades alquiladas ni monto total
                        JOptionPane.showMessageDialog(null, "No se realizaron alquileres", "El Peliculon", 1);// si  esta vacio, muestra mensaje indicando que no se alquilo nada
                    } else { // si no
                        mensajeTotal = "";// se limpia variable                    
                        mensajeTotal += "Ganancias totales\n"; // concatena mensaje
                        mensajeTotal += "==================\n"; // concatena mensaje
                        mensajeTotal += "Cantidad total de peliculas alquiladas: " + cantTotal + " peliculas \n";// concatena cantidad de peliculas alquiladas en total
                        mensajeTotal += "----------------------------------------------------------------------------------------------------- \n";
                        mensajeTotal += "Monto total por todas las peliculas alquiladas: " + sumaTotal + " colones \n";// concatena total a cancelar por las peliculas alquiladas
                        mensajeTotal += "----------------------------------------------------------------------------------------------------- \n";
                        JOptionPane.showMessageDialog(null, mensajeTotal, "El Peliculon", 1);// muestra mensaje con totales 
                    }// fin else
                    break;// sale del switch
                default:// opcion si no se escoge ninguna opcion en el switch
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta", "El Peliculon", 1);// muestra mensaje con totales
                    break;// sale del switch                    
            }// fin switch
            cont = JOptionPane.showInputDialog(null, "Desea hacer otra consulta? 'S' o 'N'").toUpperCase().charAt(0);// consulta si quiere hacer otra consulta y lo guarda en variable
        } while (cont == 'S'); // fin de do while
        opcion = JOptionPane.showInputDialog("Que accion desea realizar: "// consulta sobre que se desea realizar
                + "\n 'R' Retornar al menu principal"// R para retornar al menu principal
                + "\n 'S' Salir del programa").toUpperCase().charAt(0); // S para salir del programa
        if (opcion == 'R') {// si la opcion es R
            menuAdmin();// redirige al menu de admin
        } else {// si no
            salirPrograma();//sale del programa
        }// fin else
    }// fin metodo

    //metodo para salir del programa
    public static void salirPrograma() {
        JOptionPane.showMessageDialog(null, "Adios", "El Peliculon", 1);// muestra mensaje con totales
        System.exit(0);// sale del programa
    }// fin metodo
}// fin programa
