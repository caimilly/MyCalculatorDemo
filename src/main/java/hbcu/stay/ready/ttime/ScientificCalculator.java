package hbcu.stay.ready.ttime;

public class ScientificCalculator {
    private double memory;

    public ScientificCalculator(double memory){
        this.memory = memory;
    }

    public double sine(){
        memory = Math.sin(memory);
        return memory;
    }

    public double cosine(){
        memory = Math.cos(memory);
        return memory;
    }

    public double tangent(){
        memory = Math.tan(memory);
        return memory;
    }

    public double inverseSine(){
        memory = Math.asin(memory);
        return memory;
    }


    public double inverseCosine() {
        memory = Math.acos(memory);
        return memory;
    }

    public double inverseTangent() {
        memory = Math.atan(memory);
        return memory;
    }

    public double log(){
        memory = Math.log10(memory);
        return memory;
    }

    public double inverseLog() {
        memory = Math.exp(memory);
        return memory;
    }

    public double naturalLog() {
        memory = Math.log(memory);
        return memory;
    }

    public double inverseNaturalLog() {
        memory = Math.log(1/memory);
        return memory;
    }
}
