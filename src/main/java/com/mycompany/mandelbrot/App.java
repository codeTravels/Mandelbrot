package com.mycompany.mandelbrot;

import java.awt.Color;

/**
 * Hello world!
 *
 */
public class App
{
        // return number of iterations to check if c = a + ib is in Mandelbrot set
    public static int mand(ComplexNumber z0, int max) {
        ComplexNumber z = z0;
        for (int t = 0; t < max; t++) {
            if (z.abs() > 2.0)
            {
//                System.out.println("t= "+t);
                return t;
            }
            z = z.times(z).plus(z0);
        }
        return max;
    }
       public static void main(String[] args)  {
//        double xc   = Double.parseDouble(args[0]);
//        double yc   = Double.parseDouble(args[1]);
//        double size = Double.parseDouble(args[2]);
        double xc   = 0.5;
        double yc   = 0;
        double size = 5;

        int N   = 2000;   // create N-by-N image
        int max = 225;   // maximum number of iterations

        Picture pic = new Picture(N, N);
//        pic.display();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                double x0 = xc - size/2 + size*i/N;
                double y0 = yc - size/2 + size*j/N;
                ComplexNumber z0 = new ComplexNumber(x0, y0);
                int gray = max - mand(z0, max);
                Color color = new Color(gray, gray, gray);
                pic.set(i, N-1-j, color);
            }
        }
        pic.display();
    }
}
