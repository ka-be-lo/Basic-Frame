/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tut.ac.za.ui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author sepit
 */
public class MyFirstFrame extends JFrame{
    
    public MyFirstFrame(){
    
        //JFrame frame = new JFrame();
        
        this.setTitle("My First GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 250);
        this.setForeground(Color.BLUE);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("icon.jpeg");
        this.setIconImage(image.getImage());
        
    }
}
