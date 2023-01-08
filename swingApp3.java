import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class swingApp3 implements ActionListener{
    JFrame f1;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    
    swingApp3(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        t1= new JTextField(10);
        t2= new JTextField(10);
        t3= new JTextField(10);
        t3.setEditable(false);
        b1=new JButton("add");
        b2=new JButton("subtract");
        b3=new JButton("multiply");
        b4=new JButton("divide");
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        f1.setVisible(true);
    }
    public static void main(String[] args){
        swingApp3 ob = new swingApp3();
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        
        if(e.getSource()==b1){
            int c = a+b;
            t3.setText(c+"");
        }else if(e.getSource()==b2){
            int c = a-b;
            t3.setText(c+"");
        }else if(e.getSource()==b3){
            int c = a*b;
            t3.setText(c+"");
        }else{
            int c = a/b;
            t3.setText(c+"");
        }
        
        
        
        
    }
}
