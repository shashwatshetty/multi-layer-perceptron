package main;

public class Neuron {
    private double value;
    private double[] weights;
    private double bias;
    private double delta;
    private final static double DENOMINATOR = 10000000000000.0;

    public Neuron(){}

    public Neuron(int previousSize){
        double[] w = new double[previousSize];
        for(int i = 0; i < previousSize; i++){
            w[i] = Math.random()/DENOMINATOR;
        }
        this.setWeights(w);
        this.setBias(Math.random()/DENOMINATOR);
        this.setDelta(Math.random()/DENOMINATOR);
        this.setValue(Math.random()/DENOMINATOR);
    }

    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
}
