package hbcu.stay.ready.ttime;

public class Calculator {
    private double memory;
    //default constructor
    public Calculator(){
        memory = 0;
    }

    //argument accepting constructor
    public Calculator(double memory){
        this.memory = memory;
    }

    public double add(double x){
        memory += x;
        return memory;
    }

    public double add(double x, double y){
        return 0;
    }

    public double subtract(double x){
        memory -= x;
        return memory;
    }

    public double multiply(double x){
        memory *= x;
        return memory;
    }

    public double divide(double x){
        memory /= x;
        return memory;
    }

    public double square(){
        memory *= memory;
        return memory;
    }

    public double squareRoot(){
        memory = Math.sqrt(memory);
        return memory;
    }

    public double exponentiation(double x){
        memory = Math.pow(memory,x);
        return memory;
    }

    public double inverseNumber(){
        memory = (1/memory);
        return memory;
    }

    public double inverseSign(){
        memory *= -1;
        return memory;
    }
}
