package com.mycompany.mandelbrot;

import javax.swing.JScrollPane;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main(String[] args)
    {
        MyFrame jFrame = new MyFrame();
        jFrame.setTitle("Mandelbrot App");

        InputOptions inputOptions = new InputOptions();
        Picture pic = new Picture(inputOptions.getN(), inputOptions.getN());
        pic.setColors(inputOptions);
        jFrame.setContentPane(new JScrollPane(pic));
        jFrame.setSize(inputOptions.getN(), inputOptions.getN());
    }
}
