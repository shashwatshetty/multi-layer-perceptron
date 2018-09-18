package main;

import java.util.List;

public class NeuralNetwork {
    private double alpha = 0.6;
    private List<Layer> layers;

    public NeuralNetwork(){}

    public NeuralNetwork(int[] numNeurons, double alpha){
        this.setAlpha(alpha);
        int prevNeurons = 0, currentNeurons;
        for(int i = 0; i < numNeurons.length; i++){
            currentNeurons = numNeurons[i];
            Layer l = new Layer(currentNeurons, prevNeurons);
            layers.add(l);
            prevNeurons = currentNeurons;
        }
    }

    public double getAlpha() {
        return alpha;
    }

    private void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }
}