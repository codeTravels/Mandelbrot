/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mandelbrot;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Cory
 */
public class ColorMap
{

    public static List<Color> generateRandom()
    {
        Random random = new Random();
        List<Color> colors = new ArrayList<>(256);
        colors.add(Color.BLACK);
        addColor(25, new Color(random.nextInt()), colors);
        addColor(20, new Color(random.nextInt()), colors);
        addColor(50, new Color(random.nextInt()), colors);
        addColor(55, new Color(random.nextInt()), colors);
        addColor(60, new Color(random.nextInt()), colors);
        addColor(45, new Color(random.nextInt()), colors);
        return colors;
    }

    public static List<Color> generate()
    {
        List<Color> colors = new ArrayList<>(256);
        colors.add(Color.BLACK);
        addColor(5, Color.RED, colors);
        addColor(20, Color.ORANGE, colors);
        addColor(50, Color.YELLOW, colors);
        addColor(55, Color.GREEN, colors);
        addColor(60, Color.BLUE, colors);
        addColor(65, Color.MAGENTA, colors);
        return colors;
    }

    private static List<Color> addColor(int num, Color color, List<Color> colors)
    {
        for (int i = 0; i < num; i++)
        {
            colors.add(color);
        }
        return colors;
    }
}
