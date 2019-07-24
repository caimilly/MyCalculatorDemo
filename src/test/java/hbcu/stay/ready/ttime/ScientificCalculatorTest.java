package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class ScientificCalculatorTest {

    @Test
    public void sineTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.sine();
        double expected = 0.5;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void cosineTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.cosine();
        double expected = 0.86;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void tangentTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.tangent();
        double expected = 0.57;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void inverseSineTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.inverseSine();
        double expected = 0.55;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void inverseCosineTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.inverseCosine();
        double expected = 1.01;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void inverseTangentTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.inverseTangent();
        double expected = 0.48;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void logTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.log();
        double expected = -0.28;
        Assert.assertEquals(expected,actual,0.01);
    }
    @Test
    public void inverseLogTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.inverseLog();
        double expected = 1.68;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void naturalLogTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.naturalLog();
        double expected = -0.64;
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void inverseNaturalLogTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(Math.PI/6);
        double actual = scientificCalculator.inverseNaturalLog();
        double expected = 0.64;
        Assert.assertEquals(expected,actual,0.01);
    }
}
