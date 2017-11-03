/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mandelbrot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

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

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        // Draw image centered.
        int x = (getWidth() - image.getWidth()) / 2;
        int y = (getHeight() - image.getHeight()) / 2;
        g.drawImage(image, x, y, this);
    }

    void set(int x, int y, Color color)
    {
        this.image.setRGB(x, y, color.getRGB());
    }

    void setColors(InputOptions options)
    {
        double xc = options.getXc();
        double yc = options.getYc();
        double size = options.getSize();

        int N = options.getN();   // create N-by-N image
        int max = options.getMax();   // maximum number of iterations

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                double x0 = xc - size / 2 + size * i / N;
                double y0 = yc - size / 2 + size * j / N;
                ComplexNumber z0 = new ComplexNumber(x0, y0);
                int gray = max - mand(z0, max);
                Color color = new Color(gray, gray, gray);
                set(i, N - 1 - j, color);
            }
        }
    }

    /**
     * return number of iterations to check if c = a + ib is in Mandelbrot set
     *
     * @param z0
     * @param max
     * @return
     */
    public static int mand(ComplexNumber z0, int max)
    {
        ComplexNumber z = z0;
        for (int t = 0; t < max; t++)
        {
            if (z.abs() > 2.0)
            {
//                System.out.println("t= "+t);
                return t;
            }
            z = z.times(z).plus(z0);
        }
        return max;
    }

}
