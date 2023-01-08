import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swingApp2 implements ActionListener{
    JFrame f1;
    JTextField t1;
    JButton b1;
    
    swingApp2(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        t1= new JTextField(10);
        b1=new JButton("ok");
        f1.add(t1);
        f1.add(b1);
        b1.addActionListener(this);
        f1.setVisible(true);
    }
    
    public static void main(String[] args){
        swingApp2 ob = new swingApp2();
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        if(a%2==0){
            JOptionPane.showMessageDialog(null, "Even Number");
        }else{
            JOptionPane.showMessageDialog(null, "Odd Number");
        }
    }
}
