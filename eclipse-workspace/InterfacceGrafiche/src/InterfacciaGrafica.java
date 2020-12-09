import java.awt.*;
import java.awt.event.*;

public class InterfacciaGrafica extends Frame
{
    private static String labelPrefix = "Number of clicks: "; // definisce un messaggio e lo mette in una striga
    private int numClicks = 0; // definisce ed inizializza un contatore;
    Label label = null; // definisce una lablel(finestra)
    Button button = null; // definisce un Bottone

    public InterfacciaGrafica()
    {
        label = new Label(labelPrefix + "0    "); // crea un oggetto label con un messaggio iniziale
        button = new Button("Click me!"); // crea un pulsante con su scritto il messaggio
        
        
        button.addActionListener(new ActionListener() // crea un evento che viene gestito da actionPerformed
        {
            public void actionPerformed(ActionEvent e)
            {   numClicks++;
                label.setText(labelPrefix + numClicks);
            }
        });
        
        
        setLayout(new GridLayout(1,0)); // definiti nella classe frame 
        add(button);
        add(label);
        addWindowListener(new WindowAdapter()// definisce un evento che viene gestito dal metodo windowsClosing
        {
            public void windowClosing(WindowEvent e)
            {   System.exit(0);
            }
        });
        pack();
        setVisible(true);
    }

    public static void main(String[] args)
    {
    	InterfacciaGrafica app = new InterfacciaGrafica();
    }
}
