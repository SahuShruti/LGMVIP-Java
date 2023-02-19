import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class ScientificCalculator extends JFrame implements ActionListener {
    JTextField tfield;
    double temp, temp1, result, a;
    static double m1, m2;
    int k=1, x=0, y=0, z=0;
    char ch;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow1, pow2, exp, fac, plus, div, min, log, rec, mul, eq, addSub, dot, mr, mc, mp, mm, sqrt, sin, cos, tan;
    Container cont;
    JPanel textPanel, buttopanel;

    ScientificCalculator(){
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        tfield = new JTextField(25);
        tfield.setHorizontalAlignment(SwingConstants.RIGHT);
        tfield.addKeyListener(new KeyAdapter(){
                public void keyTyped(KeyEvent keyevent){
                    char c = keyevent.getKeyChar();
                    if(c>='0' && c<='9'){
                    }
                    else{
                        keyevent.consume();
                    }
                }
        });
        textpanel.add(tfield);
        buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(8, 4, 2, 2));
        boolean 


    }

}
