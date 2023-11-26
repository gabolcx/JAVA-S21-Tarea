
package tareauno;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
              
        ListaPersonas listaPersonas = new ListaPersonas();

        // Declarar las variables para el nombre, el apellido, el DNI y la FECHA DE NACIMIENTO
String nombre = null, apellido = null, dni = null, fecha = null;

        // Crear una variable para controlar el bucle
        try ( // Crear un objeto de tipo Scanner para leer los datos por teclado
                Scanner sc = new Scanner(System.in)) {
            // Crear una variable para controlar el bucle
            boolean salir = false;
            // Crear un bucle para mostrar el menú y pedir al usuario que elija una opción
            while (!salir) {
                // Mostrar el menú
                System.out.println("Menú de opciones:");
                System.out.println("1. Ingresar los datos de una persona");
                System.out.println("2. Mostrar todas las personas ya ingresadas");
                System.out.println("3. Salir");
                
                // Pedir al usuario que elija una opción
                System.out.print("Ingrese número de opción: ");
                int opcion = sc.nextInt();
                // Consumir el carácter de nueva línea pendiente
                sc.nextLine();
                // Ejecutar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        
                        // Declarar una variable para indicar si se está pidiendo el nombre, el apellido, el DNI o la FECHA DE NACIMIENTO
// 1 = nombre, 2 = apellido, 3 = DNI, 4 = FECHA DE NACIMIENTO
int caso = 1;

// Usar un bucle while para repetir el proceso
while (caso != 0) {
    // Usar un switch case para evaluar el valor de caso
    switch (caso) {
        case 1 -> {
            // Pedir el nombre al usuario
            System.out.println("Ingrese el nombre de la persona:");
            // Leer el nombre y asignarlo a la variable nombre
            nombre = sc.nextLine();
            // Comprobar si el nombre está vacío
            if (nombre.isEmpty()) {
                // Mostrar un mensaje de error
                System.out.println("El nombre no puede estar vacío. Intente de nuevo.");
            } else {
                // Cambiar el valor de caso a 2, para pedir el apellido
                caso = 2;
            }
        }
        case 2 -> {
            // Pedir el apellido al usuario
            System.out.println("Ingrese el apellido de la persona:");
            // Leer el apellido y asignarlo a la variable apellido
            apellido = sc.nextLine();
            // Comprobar si el apellido está vacío
            if (apellido.isEmpty()) {
                // Mostrar un mensaje de error
                System.out.println("El apellido no puede estar vacío. Intente de nuevo.");
            } else {
                // Cambiar el valor de caso a 3, para pedir el DNI
                caso = 3;
            }
        }
        case 3 -> {
            // Pedir el DNI al usuario
            System.out.println("Ingrese el DNI de la persona:");
            // Leer el DNI y asignarlo a la variable dni
            dni = sc.nextLine();
            // Comprobar si el DNI tiene el formato correcto
            if (dni.matches("\\d{8}")) {
                // Cambiar el valor de caso a 4, para pedir la FECHA DE NACIMIENTO
                caso = 4;
            } else {
                // Mostrar un mensaje de error
                System.out.println("El DNI debe ser un número de 8 dígitos. Intente de nuevo.");
            }
        }
        case 4 -> {
            // Pedir la FECHA DE NACIMIENTO al usuario
            System.out.println("Ingrese la FECHA DE NACIMIENTO de la persona (dd/mm/yyyy):");
            // Leer la FECHA DE NACIMIENTO y asignarla a la variable fecha
            fecha = sc.nextLine();
            // Comprobar si la FECHA DE NACIMIENTO tiene el formato correcto
            if (fecha.matches("(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/\\d{4}")) {
                // Cambiar el valor de caso a 0, para terminar el bucle
                caso = 0;
            } else {
                // Mostrar un mensaje de error
                System.out.println("La FECHA DE NACIMIENTO debe tener el formato dd/mm/yyyy. Intente de nuevo.");
            }
        }
    }
        }

// Crear un objeto de tipo Persona con los datos ingresados
Persona persona = new Persona(nombre, apellido, dni, fecha);

// Agregar la persona a la lista
listaPersonas.agregarPersona(persona);

// Mostrar un mensaje de confirmación
System.out.println("La persona ha sido registrada correctamente.");
                    }
                    
                    case 2 -> {
                        // Verificar si la lista de personas está vacía
                        if (listaPersonas.estaVacia()) {
                        System.out.println("No se han ingresado datos actualmente.");
                        } else {
                        // Mostrar todas las personas de la lista
                        System.out.println("Las personas registradas son:");
                        listaPersonas.mostrarPersonas();
                    }
                        break;
                                }
                    case 3 -> // Salir del bucle
                        salir = true;
                    default -> // Mostrar un mensaje de error si la opción no es válida
                        System.out.println("Opción inválida. Por favor, ingrese número de opción (1, 2 o 3)");
                }
            }
        }
    }
}