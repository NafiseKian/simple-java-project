package com.mycompany.project;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Form2 extends JFrame implements ActionListener
{
 JButton CLEAR;
  JTextField brand =new JTextField(15);
  JTextField gear =new JTextField(15);
  JTextField model =new JTextField(15);
  JTextField year =new JTextField(15);
  JTextField max =new JTextField(15);
  JTextField color =new JTextField(15);
  JButton FIND = new JButton("FIND THE FAST CAR");
  String b ,m , y , g , c , s;
   
   
    public Form2(String s1 , String s2 , String s3 , String s4 ,String s5 , String s6)
    {
        b=s1 ;
        g=s2;
        m=s3 ;
        y=s4;
        s=s5;
        c=s6;
        setSize(600,180);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel BRAND = new JLabel("BRAND  ");
        BRAND.setBounds(10,5,80,40);
        brand.setBounds(10,40,80,30);
        brand.setEditable(false);
        add(BRAND);
        add(brand);
        JLabel GEAR= new JLabel("GEAR BOX  ");
        GEAR.setBounds(110,5,80,40);
        gear.setBounds(110,40,80,30);
        gear.setEditable(false);
        add(GEAR);
        add(gear);
        JLabel MODEL= new JLabel(" MODEL  ");
        MODEL.setBounds(200,5,80,40);
        model.setBounds(200,40,80,30);
        model.setEditable(false);
        add(MODEL);
        add(model);
        JLabel YEAR = new JLabel(" YEAR ");
        YEAR.setBounds(300,5,80,40);
        year.setBounds(300,40,80,30);
        year.setEditable(false);
        add(YEAR);
        add(year);
        JLabel MAX = new JLabel("MAX SPEED ");
        MAX.setBounds(400,5,80,40);
        max.setBounds(400,40,80,30);
        max.setEditable(false);
        add(MAX);
        add(max);
        JLabel COLOR = new JLabel("COLOR  ");
        COLOR.setBounds(500,5,80,40);
        color.setBounds(500,40,80,30);
        color.setEditable(false);
        add(COLOR);
        add(color);
        
        
       
       FIND.setForeground(Color.white);
       FIND.setBackground(Color.black);
       FIND.setBounds(25,90,250,30);
       FIND.addActionListener(this);
       CLEAR = new JButton("CLEAR");
       CLEAR.setForeground(Color.white);
       CLEAR.setBackground(Color.black);
       CLEAR.setBounds(315,90,250,30);
       CLEAR.addActionListener(this);
       add(FIND);
       add(CLEAR);
        
        setVisible(true);
        
        
        
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
          if (e.getSource()==CLEAR){
               brand.setText("");
               gear.setText("");
               model.setText("");
               year.setText("");
               max.setText("");
               color.setText("");

    }else  if (e.getSource()==FIND)
       {
           
               brand.setText(b);
               gear.setText(g);
               model.setText(m);
               year.setText(y);
               max.setText(s);
               color.setText(c);
          
 

    

        }

}
}
