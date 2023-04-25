public class Usuario {
    // Atributos
    private double latitud;
    private double longitud;
    private String tipoRiesgo;
    
    // Constructor
    public User() {
        // Inicializar atributos
        latitud = 0;
        longitud = 0;
        tipoRiesgo = "";
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
    
    // Método para llamar al 911
    public void llamar911() {
        // Aquí puedes implementar la funcionalidad para llamar al 911, como utilizar una librería para hacer llamadas o enviar un mensaje de texto
    }
}
