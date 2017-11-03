package com.mycompany.mandelbrot;

/**
 *
 * @author Cory
 */
public class InputOptions
{

    private double xc = 0.5;
    private double yc = 0;
    private double size = 5;

    private int N = 1000;   // create N-by-N image
    private int max = 225;   // maximum number of iterations

    public InputOptions()
    {
    }

    public InputOptions(double xc, double yc, double size, int N, int max)
    {
        this.xc = xc;
        this.yc = yc;
        this.size = size;
        this.N = N;
        this.max = max;
    }

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

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("xc = ").append(getXc()).append("\n");
        builder.append("yc = ").append(getYc()).append("\n");
        builder.append("size = ").append(getSize()).append("\n");
        builder.append("N = ").append(getN()).append("\n");
        builder.append("max = ").append(getMax()).append("\n");

        return builder.toString();
    }

}
