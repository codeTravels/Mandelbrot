/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mandelbrot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Cory
 */
public class Picture extends JPanel
{
   private BufferedImage image;

    Picture(int N, int N0)
    {
        this.image = new BufferedImage(N, N0, BufferedImage.TYPE_INT_RGB);
    }


    protected void display()
    {
        JFrame jFrame = new JFrame("My Picture");

        jFrame.setContentPane(new JScrollPane(this));
        jFrame.pack();
        jFrame.setSize(image.getWidth() + 50,image.getHeight()+50);
        jFrame.setLocation(200,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw image centered.
        int x = (getWidth() - image.getWidth())/2;
        int y = (getHeight() - image.getHeight())/2;
        g.drawImage(image, x, y, this);
    }


    void set(int x, int y, Color color)
    {
        this.image.setRGB(x, y, color.getRGB());
    }

}
