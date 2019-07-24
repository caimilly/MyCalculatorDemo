package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator(5);
        double actual = calculator.multiply(5);
        double expected = 25;

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator(10);
        double actual = calculator.divide(2);
        double expected = 5;

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void squareTest(){
        Calculator calculator = new Calculator(2);
        double actual = calculator.square();
        double expected = 4;
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator(16);
        double actual = calculator.squareRoot();
        double expected = 4;
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void exponentiationTest(){
        Calculator calculator = new Calculator(2);
        double actual = calculator.exponentiation(4);
        double expected = 16;
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void inverseNumberTest(){
        Calculator calculator = new Calculator(5);
        double actual = calculator.inverseNumber();
        double expected = 1/5;
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void inverseSignTest(){
        Calculator calculator = new Calculator(4);
        double actual = calculator.inverseSign();
        double expected = -4;

        Assert.assertEquals(expected,actual,0);
    }
}
