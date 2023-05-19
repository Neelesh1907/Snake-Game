/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakegame;
import javax.swing.JFrame;
/**
 *
 * @author HP
 */
public class frame extends JFrame{
    frame(){
        this.setTitle("Snake_Game"); // sets the title of the frame
        this.add(new panel());  // adding the panel to the frame
        this.setVisible(true);  // this property is false by default
        this.setResizable(false); // this property is true by default
        this.pack();
        
    }
}
