import java.util.Scanner;

public class Usuario {
    // Atributos
    private double latitud;
    private double longitud;
    private String tipoRiesgo;
    private String descripcion;
    private String comuna;
    private String nombre;

    // Constructor
    public Usuario() {
        // Inicializar atributos
        latitud = 0;
        longitud = 0;
        tipoRiesgo = "";
        descripcion = "";
        comuna = "";
        nombre = "";
    }

    // Métodos para obtener y modificar la ubicación geográfica del usuario
    public void setUbicacion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    // Métodos para obtener y modificar el tipo de riesgo reportado por el usuario
    public void setTipoRiesgo(String tipoRiesgo) {
        this.tipoRiesgo = tipoRiesgo;
    }

    public String getTipoRiesgo() {
        return tipoRiesgo;
    }

    // Métodos para obtener y modificar la descripción del usuario
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Métodos para obtener y modificar la comuna del usuario
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getComuna() {
        return comuna;
    }

    // Métodos para obtener y modificar el nombre del usuario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método para llamar al 911
    public void llamar911() {
        System.out.println("Llamando al 911...");
        // Implementa la lógica de llamada al 911 aquí
        System.out.println("Llamada finalizada");
    }
}
