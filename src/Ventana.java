import javax.swing.JFrame;
public class Ventana extends JFrame{
    public Ventana(){
        //Definicion de las cararcteristicas de la ventana
        setTitle("Proyecto JUego -Base Grafica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        //Creacion de objeto panel de tipo PanelJuego y su instanciacion
        PanelJuego panel = new PanelJuego();
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
    
}