/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniclient;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Utente
 */
public class Mappa extends JPanel implements MouseListener{

    Image immagine;
    int posizioneX;
    int posizioneY;
    Point punto;

    public Mappa() {
        immagine = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alessio\\Desktop\\SISTEMI MAPPA\\MiniClient\\src\\miniclient\\standoff.jpg");
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(immagine, 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public void mouseClicked(MouseEvent e
    ) {
        punto = e.getPoint();
        System.out.println(punto.x+" "+punto.y);
    }

    @Override
    public void mousePressed(MouseEvent e
    ) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e
    ) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
