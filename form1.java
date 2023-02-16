
package com.mycompany.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.io.FileWriter;
import java.io.IOException;


public class cars extends JFrame implements ActionListener{
 JLabel BRAND = new JLabel("CHOOSE THE BRAND:");
Form2 F1;
JTextField year=new JTextField(20);
JTextField max=new JTextField(20);
JTextField color =new JTextField(20);
JButton B1= new JButton("OPEN SEARCH FORM");
JTextField model=new JTextField(20);
JRadioButton gear= new JRadioButton("MANUAL");
JRadioButton gear2= new JRadioButton("ATUMATIC");
JButton B2 = new JButton("ADD CAR TO FILE"); 
JComboBox brand=new JComboBox();
ButtonGroup gearty  = new ButtonGroup();

String buff="" ;
String maxc ;
String maxb ;
String maxg;
String maxm;
String maxy;
String maxss;
int maxs=0 ; 


  

   public cars (String Title)
    {
        setTitle("car info");
        setSize(350,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel title = new JLabel(" ENTER THE CAR INFORMATION");
        add(title);
        title.setBounds(60,5,200,20);
        title.setForeground(Color.blue);
        
        
        
        
        BRAND.setBounds(10,20,200,40);
        brand.setBounds(150,30,180,20);
        brand.addItem("CHOOSE");
        brand.addItem("MERCEDES");
        brand.addItem("BMW");
        brand.addItem("HONDA");
        brand.addItem("MAZDA");
        brand.addItem("SUZUKI");
        brand.addItem("HYUNDAI");
        add(BRAND);
        add(brand);
        
        
        JLabel GEAR = new JLabel("CHOOSE THE GEAR BOX : ");
        GEAR.setBounds(10,60,160,40);
        gear.setBounds(165,70,80,20);
        gear.addActionListener(this);
        gear2.setBounds(245,70,120,20);
        gear2.addActionListener(this);
        gearty.add(gear);
        gearty.add(gear2);
        add(GEAR);
        add(gear);
        add(gear2);
        
        
        
        
        JLabel MODEL = new JLabel("ENTER THE MODEL:  ");
        MODEL.setBounds(10,90,160,40);
        model.setBounds(180,100,150,20);
        add(MODEL);
        add(model);
        
        JLabel YEAR = new JLabel("ENTER THE YEAR:  ");
        YEAR.setBounds(10,120,160,40);
        year.setBounds(180,130,150,20);
        add(YEAR);
        add(year);
        
        
        
        JLabel MAX = new JLabel("ENTER THE MAX SPEED : ");
        MAX.setBounds(10,150,160,40);
        max.setBounds(180,160,150,20);
        add(MAX);
        add(max);
        
        
        
        JLabel COLOR = new JLabel("ENTER THE COLOR:  ");
        COLOR.setBounds(10,180,160,40);
        color.setBounds(180,190,150,20);
        add(COLOR);
        add(color);

         
         
         
         


       
        B2.setForeground(Color.white);
        B2.setBackground(Color.black);
        B2.setBounds(50,230,250,30);
        B2.addActionListener(this);
        B1.setBounds(50,270,250,30);
        B1.setForeground(Color.white);
        B1.setBackground(Color.black);
        B1.addActionListener(this);
        add(B2);
        add(B1);
        setVisible(true);


    }
   
   
@Override
   public void actionPerformed (ActionEvent e){
 
   if (e.getSource()==B1){
       //JOptionPane.showMessageDialog(null, "data " + maxm );
   F1=new Form2(maxb ,maxg , maxm , maxy , maxss , maxc);
   
   }else if (e.getSource()==B2){
     
       
       try{
       buff += brand.getSelectedItem().toString() + "        ";
       if (gear.isSelected())
           buff += gear.getText() + "     ";
       else if (gear2.isSelected())
           buff += gear2.getText() + "     ";
      
       buff += this.model.getText() + "     ";
       buff += this.year.getText() + "     ";
       buff += this.max.getText() + "     ";
       buff += this.color.getText() + "     \n";
       
       if (Integer.parseInt(max.getText()) > maxs){
           
           maxb=brand.getSelectedItem().toString();
           maxs=Integer.parseInt(max.getText());
           maxss=max.getText();
           maxy=year.getText();
           maxm=model.getText();
           maxc=color.getText();
           
           if (gear.isSelected())
           maxg=gear.getText();
       else if (gear2.isSelected())
           maxg=gear2.getText();
          
       }
       
       
       
       
       
   try {
      FileWriter FF = new FileWriter("tr.txt");
      FF.write(buff);
      FF.close();
    } catch 
            (IOException ex) {
      System.out.println("An error occurred.");
      ex.printStackTrace();
    }
   
model.setText("");
year.setText("");
max.setText("");
color.setText("");
gearty.clearSelection();
brand.setSelectedItem("CHOOSE");


        
}catch(Exception ee){

JOptionPane.showMessageDialog(null , "ERROR! Enter all the inputs please!");

}
   
   
   
   }
         
   

   }






}
