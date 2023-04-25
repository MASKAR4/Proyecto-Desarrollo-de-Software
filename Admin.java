import java.sql.*;

// Clase Administrador
public class Admini {
    // Atributos
    private Connection conexion;
    
    // Constructor
    public Administrador() throws SQLException {
        // Crear conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/ReporteRiesgosDB"; // Cambiar por la URL de tu base de datos
        String usuario = "admin"; // Cambiar por el usuario de tu base de datos
        String contrasena = "admin123"; // Cambiar por la contraseña de tu base de datos
        conexion = DriverManager.getConnection(url, usuario, contrasena);
    }
    
    // Métodos para modificar los parámetros de la aplicación
    public void modificarUbicacionGeografica(int id, double latitud, double longitud) throws SQLException {
        String sql = "UPDATE reporte_riesgos SET latitud = ?, longitud = ? WHERE id = ?";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setDouble(1, latitud);
        stmt.setDouble(2, longitud);
        stmt.setInt(3, id);
        stmt.executeUpdate();
    }
    
    public void modificarTipoRiesgo(int id, String tipo) throws SQLException {
        String sql = "UPDATE reporte_riesgos SET tipo_riesgo = ? WHERE id = ?";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setString(1, tipo);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    }
    
    // Métodos para cerrar la conexión a la base de datos
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }
}
