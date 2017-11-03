/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mandelbrot;

/**
 *
 * @author Cory
 */
public class ComplexNumber
{
    private double a;
    private double b;

    public ComplexNumber(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public ComplexNumber plus(ComplexNumber x)
    {
        return new ComplexNumber(getA() + x.getA(),getB()+x.getB());
    }
    public ComplexNumber times(ComplexNumber x)
    {
        //(a + b)(c+d)
        //a(c+d)+b(c+d)
        //ac+ad+bc+bd(-1)
       return new ComplexNumber(getA()*x.getA()-getB()*x.getB(),getA()*x.getB()+getB()*x.getA());
    }
    protected double getA()
    {
        return this.a;
    }
    protected double getB()
    {
        return this.b;
    }

    public double abs()
    {
        return Math.sqrt(Math.pow(getA(), 2) + Math.pow(getB(), 2));
    }

    @Override
    public String toString()
    {
        String retVal;
        if(getB() < 0)
        {
            retVal = getA() +" - "+ -getB()+"i";
        }
        else
        {
            retVal = getA() +" + "+ getB()+"i";
        }
        return retVal;
    }
}
