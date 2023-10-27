package model;

public class Persona{
    private String dni;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Persona(String dni, String apellidoPaterno, String apellidoMaterno) {
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDni() {
        return dni;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Apellido Paterno: " + apellidoPaterno + ", Apellido Materno: " + apellidoMaterno;
    }
}
