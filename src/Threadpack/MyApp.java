package Threadpack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expertzlab12 on 7/23/18.
 */
public class MyApp implements ActionListener {
    JLabel label;
    JButton button;
    JTextField textField;
    MyApp(){
        JFrame f=new JFrame("first window");//set form name
        f.setLayout(null);
        f.setSize(500,500);
        label=new JLabel("Enter name");//create a new label box into the form
        button=new JButton("click");//to create a new button into the form
        textField=new JTextField();//to create a new textfield
        f.add(label);
        f.add(button);
        f.add(textField);
        button.addActionListener(this);
        label.setBounds(100,100,150,50);
        button.setBounds(100,300,75,50);
        textField.setBounds(100,200,75,50);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.green);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new MyApp();}
    @Override
    public void actionPerformed(ActionEvent e)//to perform an action while click on the
    {                                           //botton in the form
        label.setText(textField.getText());
  label.setText("first label");
    }
}
