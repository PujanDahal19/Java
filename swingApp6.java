import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swingApp6 implements ActionListener{
    JFrame f1;
    JMenuBar mb;
    JMenu file,edit;
    JMenuItem mi1, mi2;
        
    swingApp6(){
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        mb=new JMenuBar();
        file=new JMenu("File");
        edit = new JMenu("Edit");
        mi1=new JMenuItem("New");
        mi2=new JMenuItem("Exit");
        mb.add(file);
        mb.add(edit);
        file.add(mi1);
        file.add(mi2);
        f1.setJMenuBar(mb);
        f1.setVisible(true);
        
        mi1.addActionListener(this);
        mi2.addActionListener(this);
    }
    
    public static void main(String[] args){
        swingApp6 ob = new swingApp6();
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==mi1){
            swingApp4 ob = new swingApp4();
        }else{
            f1.dispose();
        }
    }
}
