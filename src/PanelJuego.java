import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class PanelJuego extends JPanel {
    public PanelJuego(){
        setPreferredSize(new Dimension(640, 320));
        setBackground(Color.BLACK);
    }
        String nombre = "Jose Manuel Carpio Peña";
        String grupo = "25A";
        String turno = "Matutino";
        int anioEjecucion = 2026;
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.WHITE);
            g.drawString("Base grafica del juego lista", 20, 20);
            g.drawString("Nombre: " + nombre, 20, 50);
            g.drawString("Grupo: " + grupo, 20, 80);
            g.drawString("Turno: " + turno, 20, 110);
            g.drawString("Año de Ejecución: " + anioEjecucion, 20, 140);
            
        }
    
}