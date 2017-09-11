/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniserver;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Utente
 */
public class Mappa extends JPanel {

    public Image immagine;

    public Mappa() {
        immagine = Toolkit.getDefaultToolkit().createImage("C:\\Users\\Alessio\\Desktop\\SISTEMI MAPPA\\MiniClient\\src\\miniclient\\standoff.jpg");
        System.out.println("IMMAGINE CARICATA");
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("STAMPA");
        g.drawImage(immagine, 0, 0, getWidth(), getHeight(), this);
    }
}
