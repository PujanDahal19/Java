import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swingApp4 implements ActionListener{
    JFrame f1;
    JButton b1,b2,b3;
    
    swingApp4(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        b1=new JButton("button 1");
        b2=new JButton("button 2");
        b3=new JButton("button 3");
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);        
        f1.setVisible(true);
    }
    
    public static void main(String[] args){
        swingApp4 ob = new swingApp4();
    }
    public void actionPerformed(ActionEvent e){
        
        
        if(e.getSource()==b1){
           b1.setBackground(Color.red);
        }else if(e.getSource()==b2){
            b2.setBackground(Color.blue);
        }else{
            b3.setBackground(Color.green);
        }
        
        
        
        
    }
}
