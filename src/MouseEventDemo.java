import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener,
        MouseMotionListener {
    String msg="";
    int mouseX=0,mouseY=0;
    public MouseEventDemo(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowsAdapter());
    }


    @Override
    public void mouseClicked(MouseEvent e) {
msg=msg +" --click received";
repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="mousePressed";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="mouseReleased";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
mouseX=100;
mouseY=100;
msg="mouseEntered";
repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseX=100;
        mouseY=100;
        msg="mouseExited";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="mouseDragged";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
msg="движение мышки в"+e.getX()+","+e.getY();
repaint();
    }
    public void paint (Graphics e){
        e.drawString(msg,mouseX,mouseY);
    }
}
class MyWindowsAdapter extends WindowAdapter{
    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }
}

