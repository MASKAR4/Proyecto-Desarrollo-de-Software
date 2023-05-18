public class Administrador {
    // Constructor
    public Administrador() {
        // Aquí puedes inicializar cualquier configuración adicional del administrador
    }

    // Métodos para modificar los parámetros de la aplicación
    public void modificarUbicacionGeografica(double latitud, double longitud) {
        // Implementa la lógica para modificar la ubicación geográfica aquí
        System.out.println("Ubicación modificada: Latitud: " + latitud + ", Longitud: " + longitud);
    }

    public void modificarTipoRiesgo(String tipo) {
        // Implementa la lógica para modificar el tipo de riesgo aquí
        System.out.println("Tipo de riesgo modificado: " + tipo);
    }

    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() {
        // Implementa la lógica para cerrar la conexión a la base de datos aquí
        System.out.println("Conexión cerrada");
    }
}
