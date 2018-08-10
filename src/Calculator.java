import Threadpack.MyApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expertzlab12 on 7/24/18.
 */
public class Calculator implements ActionListener {
    JLabel label1;
    JLabel label2;
    JLabel label3;
     JTextField textField1;
     JTextField textField2;
     JTextField textField3;
    JButton button1;
    JButton button2;
    Calculator()
    {
        JFrame f=new JFrame("Calculator");
        f.setLayout(null);
        f.setSize(500,500);
        label1=new JLabel("first num");
        label2=new JLabel("second num");
        label3=new JLabel("result");
        button1=new JButton("+");
        button2=new JButton("-");
        textField1=new JTextField();
        textField2=new JTextField();
        textField3=new JTextField();
        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(button1);
        f.add(button2);
        f.add(textField1);
        f.add(textField2);
        f.add(textField3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        label1.setBounds(100,100,150,50);
        label2.setBounds(100,190,150,50);
        label3.setBounds(100,280,150,50);
        textField1.setBounds(300,100,150,50);
        textField2.setBounds(300,190,150,50);
        textField3.setBounds(300,280,150,50);
        button1.setBounds(100,370,150,50);
        button2.setBounds(300,370,150,50);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.green);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();}
    @Override
    public void actionPerformed(ActionEvent e)
    {
        label1.setText(textField1.getText());
        label2.setText(textField2.getText());
        label3.setText(textField3.getText());

    }
}


