/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mandelbrot;

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Cory
 */
public class ComplexNumberTest
{


    /**
     * Test of plus method, of class ComplexNumber.
     */
    @Test
    public void testPlus()
    {
                ComplexNumber a = new ComplexNumber(5,2);
        ComplexNumber b = new ComplexNumber(3,-7);
        ComplexNumber result = a.plus(b);
        System.out.println(result);
        Assert.assertEquals(8.,result.getA(),0.);
        Assert.assertEquals(-5.,result.getB(), 0.);
    }

    /**     * Test of times method, of class ComplexNumber.
     */
    @Test
    public void testTimes()
    {
        ComplexNumber a = new ComplexNumber(1,-3);
        ComplexNumber b = new ComplexNumber(2,5);
        ComplexNumber result = a.times(b);
        System.out.println(result);
        Assert.assertEquals(17.,result.getA(),0.);
        Assert.assertEquals(-1.,result.getB(), 0.);
    }

    @Test
    public void testAbs()
    {
        Assert.assertEquals(5, new ComplexNumber(3, -4).abs(), 0.);
    }

    /**
     * Test of getA method, of class ComplexNumber.
     */
    public void testGetA()
    {
    }

    /**
     * Test of getB method, of class ComplexNumber.
     */
    public void testGetB()
    {
    }
}
