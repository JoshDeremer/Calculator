/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author Josh
 * This is the main class in the Calculator program. This class will set up a frame and populate
 * the frame with buttons, labels and text fields.
 * In addition, a CalculatorClass object is created to run the calculations through. When an action
 * occurs, the source of the action is determined and an appropriate response to the action is
 * executed.
 * 
 * This class extends the frame class to take advantage of the GUI capabilities of frame. In 
 * addition, the ActionListener interface is implemented to allow for button clicks to become
 * events.
 * 
 * Created by JoshDeremer
 */

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    Button B1=new Button("Sum");
    Button B2=new Button("Subtract");
    Button B3=new Button("Multiply");
    Button B4=new Button("Divide");
    Label l1=new Label("Number 1");
    Label l2=new Label("Number 2");
    Label l3=new Label("Result");
    TextField t1=new TextField(20);
    TextField t2=new TextField(20);
    TextField t3=new TextField(20);
    CalculatorClass calc = new CalculatorClass();
    
    public Calculator()
    {
        super("Calculator");
        setLayout(null);
        l1.setBounds(20,50,55,25);
        add(l1);
        l2.setBounds(20,100,55,25);
        add(l2);
        l3.setBounds(20,150,55,25);
        add(l3);
        t1.setBounds(150,50,100,25);
        add(t1);
        t2.setBounds(150,100,100,25);
        add(t2);
        t3.setBounds(150,150,100,25);
        add(t3);
        B1.setBounds(20,200,80,25);
        add(B1);
        B2.setBounds(100,200,80,25);
        add(B2);
        B3.setBounds(180,200,80,25);
        add(B3);
        B4.setBounds(260,200,80,25);
        add(B4);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        
        addWindowListener(
            new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            }
        );
    }
    
    public void actionPerformed(ActionEvent AE)
    {
        if(AE.getSource()==B1)
        {
            sum();
        }
        
        else if(AE.getSource()==B2)
        {
            subt();
        }
        
        else if(AE.getSource()==B3)
        {
            mult();
        }
        
        else if(AE.getSource()==B4)
        {
            div();
        }
    }
    
    public void sum()
    {
        int i=Integer.parseInt(t1.getText());
        int j=Integer.parseInt(t2.getText());
        int val;
        
        val=calc.add(i,j);
        t3.setText(""+val);
    }
    
    public void subt()
    {
        int i=Integer.parseInt(t1.getText());
        int j=Integer.parseInt(t2.getText());
        int val;
        
        val=calc.subt(i,j);
        t3.setText(""+val);
    }
    
    public void mult()
    {
        int i=Integer.parseInt(t1.getText());
        int j=Integer.parseInt(t2.getText());
        int val;
        
        val=calc.mult(i,j);
        t3.setText(""+val);
    }
    
    public void div()
    {
        int i=Integer.parseInt(t1.getText());
        int j=Integer.parseInt(t2.getText());
        int val;
        
        val=calc.div(i,j);
        t3.setText(""+val);
    }
    
    public static void main(String args[])
    {
        Calculator MC=new Calculator();
        MC.setVisible(true);
        MC.setSize(600,500);
    };
}
