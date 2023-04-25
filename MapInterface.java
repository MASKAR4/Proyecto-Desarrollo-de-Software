import javax.swing.*;
import java.awt.*;

public class MapaInterfaz extends JFrame {
    
    // Constructor
    public MapaInterfaz() {
        super("Mapa de Medellín");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        
        // Crear panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 4));
        
        // Botón de llamada al 911
        JButton boton911 = new JButton("Llama al 911");
        panelBotones.add(boton911);
        
        // Botón de inserción de diálogo
        JButton botonInsertar = new JButton("Insertar Diálogo");
        panelBotones.add(botonInsertar);
        
        // Botón de reporte de crimen
        JButton botonCrimen = new JButton("Reportar Crimen");
        botonCrimen.setBackground(Color.RED);
        panelBotones.add(botonCrimen);
        
        // Botón de reporte de riesgo geológico o natural
        JButton botonRiesgo = new JButton("Reportar Riesgo");
        botonRiesgo.setBackground(Color.YELLOW);
        panelBotones.add(botonRiesgo);
        
        // Botón de reporte de accidente de tránsito
        JButton botonAccidente = new JButton("Reportar Accidente");
        botonAccidente.setBackground(Color.BLUE);
        panelBotones.add(botonAccidente);
        
        // Agregar panel de botones a la interfaz
        add(panelBotones, BorderLayout.NORTH);
        
        // Crear mapa
        // Aquí puedes utilizar una librería de mapas, como JXMapViewer, para mostrar el mapa de Medellín dividido en sectores
        // Para este ejemplo, simplemente crearemos un JLabel con un texto que simula ser el mapa
        JLabel mapa = new JLabel("Mapa de Medellín");
        add(mapa, BorderLayout.CENTER);
        
        // Mostrar la interfaz
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Crear la interfaz
        MapaInterfaz mapaInterfaz = new MapaInterfaz();
    }
}
