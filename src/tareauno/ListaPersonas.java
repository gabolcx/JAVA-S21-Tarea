
package tareauno;

import java.util.ArrayList;

class ListaPersonas {
      
     // Atributo de la clase ListaPersonas
    private final ArrayList <Persona> lista;

    // Constructor de la clase ListaPersonas
    public ListaPersonas() {
        lista = new ArrayList<>();
    }

    // Método que agrega una persona a la lista
    public void agregarPersona(Persona persona) {
        lista.add(persona);
    }

    // Método que busca una persona por su dni y la devuelve si la encuentra, o null si no la encuentra
    public Persona buscarPersonaPorDni(String dni) {
        for (Persona persona : lista) {
            if (persona.getDni().equals(dni)) {
                return persona;
            }
        }
        return null;
    }
    
    // Método que busca una persona por su nombre y la devuelve si la encuentra, o null si no la encuentra
    public Persona buscarPersonaPorNombre(String nombre) {
        for (Persona persona : lista) {
            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }
        return null;
    }

    // Método que busca una persona por su fecha de nacimiento y la devuelve si la encuentra, o null si no la encuentra
    public Persona buscarPersonaPorFecha(String fecha) {
        for (Persona persona : lista) {
            if (persona.getFechaNacimiento().equals(fecha)) {
                return persona;
            }
        }
        return null;
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return lista.isEmpty();
    }
    
    // Método que muestra todas las personas de la lista
    public void mostrarPersonas() {
        if (estaVacia()) {
            System.out.println("No hay personas registradas.");
        } else {
        for (Persona persona : lista) {
            System.out.println(persona);
            System.out.println("---------------");
        }
    }
    }
}
