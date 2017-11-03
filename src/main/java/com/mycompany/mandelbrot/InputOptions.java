/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mandelbrot;

/**
 *
 * @author Cory
 */
public class InputOptions
{
        private double xc   = 0.5;
        private double yc   = 0;
        private double size = 5;

        private int N   = 2000;   // create N-by-N image
        private int max = 225;   // maximum number of iterations

    public double getXc()
    {
        return xc;
    }

    public double getYc()
    {
        return yc;
    }

    public double getSize()
    {
        return size;
    }

    public int getN()
    {
        return N;
    }

    public int getMax()
    {
        return max;
    }


    
}
