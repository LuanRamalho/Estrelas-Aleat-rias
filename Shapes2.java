package Conjunto_de_Estrelas;
import java.awt.Color;
import javax.swing.JFrame;

public class Shapes2
{
    // executa o aplicativo
    public static void main(String[] args)
    {
        // cria frame para Shapes2JPanel
        JFrame frame = new JFrame("Drawing 2D Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
        frame.add(shapes2JPanel);
        frame.setBackground(Color.WHITE);
        frame.setSize(315, 330);
        frame.setVisible(true);
    }
} // fim da classe Shapes2