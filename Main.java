import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("*************************");
        System.out.println("* Bienvenido al Sistema *");
        System.out.println("*************************");
        System.out.println();

        System.out.print("Por favor, ingrese su nombre completo: ");
        String nombre = scanner.nextLine();
        usuario.setNombre(nombre);

        System.out.println();
        System.out.println("¡Hola, " + usuario.getNombre() + "! Bienvenido al sistema.");
        System.out.println();

        System.out.println("****************************");
        System.out.println("*   Ingresar Ubicación     *");
        System.out.println("****************************");
        System.out.print("Ingrese la latitud: ");
        double latitud = scanner.nextDouble();
        System.out.print("Ingrese la longitud: ");
        double longitud = scanner.nextDouble();
        usuario.setUbicacion(latitud, longitud);
        System.out.println();
        System.out.println("Ubicación registrada: Latitud: " + usuario.getLatitud() + ", Longitud: " + usuario.getLongitud());
        System.out.println();

        System.out.println("************************");
        System.out.println("*   Ingresar Comuna   *");
        System.out.println("************************");
        System.out.println("Seleccione la comuna en la que se encuentra:");

        System.out.println("1. Comuna 1 - Popular");
        System.out.println("2. Comuna 2 - Santa Cruz");
        System.out.println("3. Comuna 3 - Manrique");
        System.out.println("4. Comuna 4 - Aranjuez");
        System.out.println("5. Comuna 5 - Castilla");
        System.out.println("6. Comuna 6 - Doce de Octubre");
        System.out.println("7. Comuna 7 - Robledo");
        System.out.println("8. Comuna 8 - Villa Hermosa");
        System.out.println("9. Comuna 9 - Buenos Aires");
        System.out.println("10. Comuna 10 - La Candelaria");
        System.out.println("11. Comuna 11 - Laureles - Estadio");
        System.out.println("12. Comuna 12 - La América");
        System.out.println("13. Comuna 13 - San Javier");
        System.out.println("14. Comuna 14 - El Poblado");
        System.out.println("15. Comuna 15 - Guayabal");
        System.out.println("16. Comuna 16 - Belén");
        System.out.println();

        System.out.print("Ingrese el número de la comuna en la que se encuentra: ");
        int numeroComuna = scanner.nextInt();

        // Asignar la comuna correspondiente al número ingresado
        String comuna = "";
        switch (numeroComuna) {
            case 1:
                comuna = "Comuna 1 - Popular";
                break;
            case 2:
                comuna = "Comuna 2 - Santa Cruz";
                break;
            case 3:
                comuna = "Comuna 3 - Manrique";
                break;
            case 4:
                comuna = "Comuna 4 - Aranjuez";
                break;
            case 5:
                comuna = "Comuna 5 - Castilla";
                break;
            case 6:
                comuna = "Comuna 6 - Doce de Octubre";
                break;
            case 7:
                comuna = "Comuna 7 - Robledo";
                break;
            case 8:
                comuna = "Comuna 8 - Villa Hermosa";
                break;
            case 9:
                comuna = "Comuna 9 - Buenos Aires";
                break;
            case 10:
                comuna = "Comuna 10 - La Candelaria";
                break;
            case 11:
                comuna = "Comuna 11 - Laureles - Estadio";
                break;
            case 12:
                comuna = "Comuna 12 - La América";
                break;
            case 13:
                comuna = "Comuna 13 - San Javier";
                break;
            case 14:
                comuna = "Comuna 14 - El Poblado";
                break;
            case 15:
                comuna = "Comuna 15 - Guayabal";
                break;
            case 16:
                comuna = "Comuna 16 - Belén";
                break;
            default:
                System.out.println("Opción inválida. Se asignará Comuna 1 - Popular por defecto.");
                comuna = "Comuna 1 - Popular";
                break;
        }

        usuario.setComuna(comuna);
        System.out.println();
        System.out.println("Comuna registrada: " + usuario.getComuna());
        System.out.println();

        System.out.println("************************************");
        System.out.println("*   Ingresar Tipo de Riesgo   *");
        System.out.println("************************************");
        System.out.println("Seleccione el tipo de riesgo:");

        System.out.println("1. Rojo - Peligro de alerta inmediata");
        System.out.println("2. Azul - Accidente de tránsito");
        System.out.println("3. Verde - Accidentes biológicos o naturales");
        System.out.println();

        System.out.print("Ingrese el número del tipo de riesgo: ");
        int numeroRiesgo = scanner.nextInt();

        // Asignar el tipo de riesgo correspondiente al número ingresado
        String tipoRiesgo = "";
        switch (numeroRiesgo) {
            case 1:
                tipoRiesgo = "Rojo - Peligro de alerta inmediata";
                break;
            case 2:
                tipoRiesgo = "Azul - Accidente de tránsito";
                break;
            case 3:
                tipoRiesgo = "Verde - Accidentes biológicos o naturales";
                break;
            default:
                System.out.println("Opción inválida. Se asignará Rojo - Peligro de alerta inmediata por defecto.");
                tipoRiesgo = "Rojo - Peligro de alerta inmediata";
                break;
        }

        usuario.setTipoRiesgo(tipoRiesgo);
        System.out.println();
        System.out.println("Tipo de riesgo registrado: " + usuario.getTipoRiesgo());
        System.out.println();

        System.out.println("**********************************");
        System.out.println("*   Ingresar Descripción   *");
        System.out.println("**********************************");
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese la descripción: ");
        String descripcion = scanner.nextLine();
        usuario.setDescripcion(descripcion);
        System.out.println();
        System.out.println("Descripción registrada: " + usuario.getDescripcion());
        System.out.println();

        System.out.println("********************************");
        System.out.println("*   Llamar al 911   *");
        System.out.println("********************************");
        System.out.print("¿Desea llamar al 911? (S/N): ");
        String opcionLlamar = scanner.next();

        if (opcionLlamar.equalsIgnoreCase("S")) {
            usuario.llamar911();
        }

        System.out.println();
        System.out.println("************************************");
        System.out.println("*   Salir del Sistema   *");
        System.out.println("************************************");
        System.out.println("Gracias por utilizar el sistema. ¡Hasta luego!");
    }
}
