package tareauno;

class Persona {

    // Atributos de la clase Persona
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNacimiento;

    // Constructor de la clase Persona
    public Persona(String nombre, String apellido, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getter y setter de la clase Persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método que devuelve una representación textual de una persona
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nFecha de nacimiento: " + fechaNacimiento;
    }
}