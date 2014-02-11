/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.componentes;

import javax.swing.JFrame;

public class Ejercicio1 {

    public static void main(String[] args) {
        JClock clock = new JClock();
        clock.setVisible(true);
        
        JFrame frame = new JFrame();
        frame.setSize(60, 60);
        frame.add(clock);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
}
