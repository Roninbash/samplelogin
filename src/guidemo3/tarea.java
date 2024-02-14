
package guidemo3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class tarea extends JFrame implements ActionListener{
    JTextArea area;
    JPanel panel;
    JButton count;
    JLabel counter;
    JComboBox combo;
    String[] list={"word count","Hehe"};
    
    tarea(){
        panel=new JPanel();
        count=new JButton("Count");
        counter=new JLabel();
        area=new JTextArea();
        combo=new JComboBox(list);
        
        panel.setLayout(null);
        area.setBounds(50, 50, 400, 400);
        count.setBounds(200, 450, 100, 30);
        counter.setBounds(100, 450, 100, 30);
        combo.setBounds(100, 450, 100, 30);
        
        panel.add(count);
        panel.add(counter);
        panel.add(area);
        panel.add(combo);
        add(panel);
        
        count.addActionListener(this);
        
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text=area.getText();
//        Integer val=text.length();
        String arr[]=text.split(" ");
        Integer val =arr.length;
        counter.setText(val.toString());
        
    }
}
