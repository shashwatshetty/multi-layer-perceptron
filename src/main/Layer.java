package main;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Neuron> neurons;
    private int numOfNeurons;

    public Layer(){}

    public Layer(int currentSize, int previousSize){
        this.setNumOfNeurons(currentSize);
        neurons = new ArrayList<Neuron>();
        for(int i = currentSize; i < currentSize; i++){
            neurons.add(new Neuron(previousSize));
        }
    }

    public List<Neuron> getNeurons() {
        return neurons;
    }

    public void setNeurons(List<Neuron> neurons) {
        this.neurons = neurons;
    }

    public int getNumOfNeurons() {
        return numOfNeurons;
    }

    public void setNumOfNeurons(int numOfNeurons) {
        this.numOfNeurons = numOfNeurons;
    }
}
